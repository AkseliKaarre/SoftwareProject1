package org.example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.security.DrbgParameters;

import static org.junit.Assert.*;

public class StringManipulationAkseliTest {

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Initializing recources.");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Cleaning the recources.");
    }

    @Before
    public void setUp() {
        System.out.println("Setting up recourses before test methods.");
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up recources after each test method.");
    }

    @Test
    public void testReverse() {
        StringManipulationAkseli manipulator = new StringManipulationAkseli();
        String input = "hyvää päivää";
        String reversed = manipulator.reverse(input);
        System.out.println(reversed);
        assertEquals("ääviäp äävyh", reversed);
    }
    @Test
    public void testCapitalize() {
        StringManipulationAkseli manipulator = new StringManipulationAkseli();
        String input = "Hyvää päivää";
        String capitalized = manipulator.capitalize(input);
        System.out.println(capitalized);
        assertEquals("HYVÄÄ PÄIVÄÄ", capitalized);
    }
}
