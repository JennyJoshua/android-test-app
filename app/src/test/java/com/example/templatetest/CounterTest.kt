package com.example.templatetest

import org.junit.Assert.assertEquals
import org.junit.Test

class CounterTest {

    @Test
    fun startsAtZero() {
        assertEquals(0, Counter().value)
    }

    @Test
    fun incrementAddsOne() {
        val counter = Counter()
        counter.increment()
        counter.increment()
        assertEquals(2, counter.value)
    }

    @Test
    fun resetGoesBackToZero() {
        val counter = Counter(5)
        counter.reset()
        assertEquals(0, counter.value)
    }
}
