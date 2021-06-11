package com.zuhlke.kmmmodule

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class DiceTest {
    companion object {
        private const val TEST_COUNT = 1000
    }

    @Test
    fun testOptionD6() {
        val testSubject = Dice()
        print(testSubject.version)
        val sides = 6
        val tests = TEST_COUNT
        val rolls = mutableMapOf<Int, Int>()

        for (x in 1..sides) {
            rolls[x] = 0
        }

        for (x in 0..tests) {
            val roll = testSubject()
            assertTrue(roll > 0)
            //assertThat(roll).isGreaterThan(0)
            rolls[roll] = rolls[roll]!! + 1
        }

        assertEquals(rolls.size, sides)
        //assertThat(rolls.size == sides)
        print("Distribution over ${tests}:")
        for (x in 1..sides) {
            print("    [$x]: ${rolls[x]}")
            assertTrue(rolls[x]!! > 0)
        }
    }
}