package com.martinmcclenaghan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)

public class MainTest {

    private long number;
    private long response;

    public MainTest(long number, long response) {
        this.number = number;
        this.response = response;
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions() {
        return Arrays.asList(new Object[][]{

                {38458215, 85821534},
                {195881031, 988103115},
                {896219342, 962193428},
                {69418307, 94183076},
        });

    }

    @Test
    public void rotateMaxTest() {
        assertEquals(Main.maxRotate(number),response);
    }
}