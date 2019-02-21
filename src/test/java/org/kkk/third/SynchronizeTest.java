package org.kkk.third;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SynchronizeTest {

    @Test
    public static void test() {

        IncrementSynchronize incrementSynchronize = new IncrementSynchronize();

        int zero = incrementSynchronize.getVal();

        incrementSynchronize.firstWay();

        int one = incrementSynchronize.getVal();

        incrementSynchronize.secondWay();

        int two = incrementSynchronize.getVal();

        incrementSynchronize.thirdWay();

        int finalVal = incrementSynchronize.getVal();

        System.out.println("Zero: " + zero + " one: " + one + " two: " + two);

        assertEquals(zero+one+two, finalVal);
    }
}
