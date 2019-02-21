package org.kkk.third;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SynchronizeTest {

    @Test
    public static void test() {

        IncrementSynchronize incrementSynchronize = new IncrementSynchronize();

        int count = 0;

        int zero = incrementSynchronize.getVal();

        incrementSynchronize.firstWay();
        count++;
        int one = incrementSynchronize.getVal();

        incrementSynchronize.secondWay();
        count++;
        int two = incrementSynchronize.getVal();

        incrementSynchronize.thirdWay();
        count++;
        int finalVal = incrementSynchronize.getVal();

        System.out.println("Zero: " + zero + " one: " + one + " two: " + two);

        assertEquals(count, finalVal);

        assertEquals(zero + one + two, finalVal);

    }
}
