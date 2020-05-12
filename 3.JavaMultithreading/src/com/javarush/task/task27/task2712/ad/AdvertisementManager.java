package com.javarush.task.task27.task2712.ad;

import com.javarush.task.task27.task2712.ConsoleHelper;

import java.util.*;

public class AdvertisementManager {
    final AdvertisementStorage storage = AdvertisementStorage.getInstance();
    private int timeSeconds;
//    private List<Advertisement> storageList = storage.list();

    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

    public void processVideos(){

        List<Advertisement> storageList = storage.list();
        List<Advertisement> resultList = getVideos(timeSeconds, storageList.size() - 1, storageList);

        if (resultList.size() == 0) {
            throw new NoVideoAvailableException();
        }

        Collections.sort(resultList, (ad1, ad2) -> {
            int result = (int) (ad2.getAmountPerOneDisplaying() - ad1.getAmountPerOneDisplaying());
            if (result == 0) {
                result = (int) ((ad1.getAmountPerOneDisplaying() * 1000 / ad1.getDuration())
                        - (ad2.getAmountPerOneDisplaying() * 100 / ad2.getDuration()));
            }
            return result;
        });

        resultList.forEach(advertisement -> {

            advertisement.revalidate();
            ConsoleHelper.writeMessage(String.format("%s is displaying... %d, %d", advertisement.getName()
                    , advertisement.getAmountPerOneDisplaying()
                    , advertisement.getAmountPerOneDisplaying()* 1000/advertisement.getDuration()));



        });

    }

    private List<Advertisement> getVideos(int maxDuration, int adCount, List<Advertisement> storageList){

        if (maxDuration <= 0 || adCount < 0) {
            return new ArrayList<>();
        }
        Advertisement adElement = storageList.get(adCount);
        List<Advertisement> withoutAddingAd = getVideos(maxDuration, adCount - 1, storageList);
        if (adElement.getDuration() <= maxDuration){
            List<Advertisement> withAddingAd = getVideos(maxDuration - adElement.getDuration()
                    , adCount - 1, storageList);
            withAddingAd.add(adElement);
            return compareLists(withAddingAd, withoutAddingAd);
        }else {
            return withoutAddingAd;
        }
    }

    private List<Advertisement> compareLists(List<Advertisement> withAddingAd, List<Advertisement> withoutAddingAd){
        List<List<Advertisement>> lists = Arrays.asList(withAddingAd, withoutAddingAd);
        return Collections.max(lists, (list1, list2) -> {
            int result = (int) (getListProfit(list1) - getListProfit(list2));
            if (result == 0) {
                result = getListDuration(list1) - getListDuration(list2);
            }
            if (result == 0) {
                result = list2.size() - list1.size();
            }
            return result;
        });
    }

    private int getListDuration(List<Advertisement> advertisementList){
        return advertisementList.stream().mapToInt(Advertisement::getDuration).sum();
    }

    private long getListProfit(List<Advertisement> advertisementList){
        return advertisementList.stream().mapToLong(Advertisement::getAmountPerOneDisplaying).sum();
    }
}
