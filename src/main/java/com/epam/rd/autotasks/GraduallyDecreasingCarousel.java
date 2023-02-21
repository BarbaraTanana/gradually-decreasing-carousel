package com.epam.rd.autotasks;

import java.util.Arrays;

public class GraduallyDecreasingCarousel extends DecrementingCarousel {
    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
    }

    public CarouselRun run() {
        if (!call) {
            array = Arrays.copyOf(array, i);
            call = true;
            return new GraduallyDecreasingCarouselRun();
        }
        return null;
    }
}
