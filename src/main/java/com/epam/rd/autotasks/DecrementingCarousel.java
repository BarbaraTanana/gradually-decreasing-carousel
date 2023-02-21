package com.epam.rd.autotasks;

import java.util.Arrays;

public class DecrementingCarousel {
    private final int campacity;
    int i=0;
    static int [] array;
    boolean call=false;
    public DecrementingCarousel(int capacity) {
        this.campacity=capacity;
        array=new int[capacity];
    }

    public boolean addElement(int element){
        if (element>0 && i<campacity && !call){
            array[i++]=element;
            return true;
        }
        return false;
//        throw new UnsupportedOperationException();
    }

    public CarouselRun run(){
        if (!call) {
            array= Arrays.copyOf(array,i);
            call=true;
            return new CarouselRun();
        } return null;
//       throw new UnsupportedOperationException();
    }
}
