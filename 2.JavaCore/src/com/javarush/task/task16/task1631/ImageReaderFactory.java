package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by Sergey on 23.04.2017.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes ext){
        if (ext == ImageTypes.JPG) return new JpgReader();
        else if (ext == ImageTypes.BMP) return new BmpReader();
        else if (ext == ImageTypes.PNG) return new PngReader();
        throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
