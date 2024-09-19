package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void math() {
        List<Double> test= new ArrayList<>();
        test.add(3.0);
        test.add(5.0);
        assertEquals(test, Main.math(1, -8, 15));
    }
}