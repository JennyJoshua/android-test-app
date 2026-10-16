package com.example.templatetest

/** Simple counter kept separate from the screen so it can be unit tested. */
class Counter(start: Int = 0) {
    var value: Int = start
        private set

    fun increment(): Int {
        value += 1
        return value
    }

    fun reset() {
        value = 0
    }
}
