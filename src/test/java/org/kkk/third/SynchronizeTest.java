package org.kkk.third;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SynchronizeTest {

    @Test
    public static void test() {

        IncrementSynchronize incrementSynchronize = new IncrementSynchronize();

        int count = 0;

        for (int i = 0; i < 4; i++) {
            incrementSynchronize.thirdWay();
            count++;
            for (int j = 0; j < 4; j++) {
                incrementSynchronize.secondWay();
                count++;
                for (int k = 0; k < 4; k++) {
                    incrementSynchronize.firstWay();
                    count++;
                }
            }

        }

        assertEquals(count, incrementSynchronize.getVal());
    }
}
