package com.epam.rd.autotasks;

public class GraduallyDecreasingCarouselRun extends CarouselRun {
    int p=1;
    public int next() {
        if (isFinished()) {
            return -1;
        }
        int BefDecrem = ar[k];
        ar[k]-=p;
        do {
            k++;
            if (k == ar.length) {
                k=0;
                p++;
            }
        } while ((ar[k]<=0) && !isFinished() );
            return BefDecrem;
    }
}
