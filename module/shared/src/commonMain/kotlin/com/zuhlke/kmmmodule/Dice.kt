package com.zuhlke.kmmmodule

import kotlin.random.Random

class Dice {
    operator fun invoke(max: Int = 6): Int = (1..max).random(Random.Default)
    val version = "0.0.1"
}