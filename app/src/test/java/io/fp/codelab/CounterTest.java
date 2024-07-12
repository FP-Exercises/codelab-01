package io.fp.codelab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CounterTest {

    @Test
    void testIncreaseCounter() {
        Counter counter = new Counter(100, 10, 110);
        int lastValue = counter.getCounter();
        counter.increaseCounter();
        int expected = lastValue + counter.getStepSize();
        assertEquals(expected, counter.getCounter());
    }

    @Test
    void testInitialize() {
        Counter counter = new Counter(100, 10,110);
        counter.increaseCounter();
        counter.initialize();
        assertEquals(counter.getInitValue(), counter.getCounter());
    }       
}
