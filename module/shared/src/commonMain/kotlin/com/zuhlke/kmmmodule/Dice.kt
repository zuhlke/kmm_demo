package com.zuhlke.kmmmodule

import kotlin.random.Random

public class Dice {
    public operator fun invoke(max: Int = 6): Int = (1..max).random(Random.Default)
    public val version = "0.0.1"
}