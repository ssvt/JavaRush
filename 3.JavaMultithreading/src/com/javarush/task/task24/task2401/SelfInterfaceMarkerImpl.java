package com.javarush.task.task24.task2401;

public class SelfInterfaceMarkerImpl implements SelfInterfaceMarker {
    public void sowSomething(){
        System.out.println("Something");
    }

    public void calc(int i, int b){
        System.out.println(i + b);
    }
}
