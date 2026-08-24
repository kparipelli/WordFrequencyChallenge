package com.assessments.wordfrequency;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordFrequencyCounterTest {


    @Test
    void shouldReturnWordFrequency() {

        Map<String, Integer> result = WordFrequencyCounter.countWordFrequency("java python java selenium java");

        assertEquals(3, result.get("java"));
        assertEquals(1, result.get("python"));
        assertEquals(1, result.get("selenium"));
    }

    @Test
    void shouldBeCaseInsensitive() {

        Map<String, Integer> result = WordFrequencyCounter.countWordFrequency("Java JAVA java");

        assertEquals(3, result.get("java"));
    }

    @Test
    void shouldReturnEmptyMapForNullInput() {

        Map<String, Integer> result = WordFrequencyCounter.countWordFrequency(null);

        assertTrue(result.isEmpty());
    }
}