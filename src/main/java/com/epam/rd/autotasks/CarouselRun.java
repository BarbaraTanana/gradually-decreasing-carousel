package com.epam.rd.autotasks;

public class CarouselRun {
    int[] ar = DecrementingCarousel.array;
    int k=0;
    public int next() {
        if (isFinished()) {
            return -1;
        }
        else while (ar[k=k % ar.length] <= 0) {
            ++k;
        }
        return ar[k++]--;
        //throw new UnsupportedOperationException();
    }

    public boolean isFinished() {
        for (int value : ar)
            if (value > 0) {
                return false;
            }
        return true;
    }

}

