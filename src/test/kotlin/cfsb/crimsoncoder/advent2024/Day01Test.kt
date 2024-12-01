package cfsb.crimsoncoder.advent2024

import cfsb.crimsoncoder.advent2024.Resources.resourceAsText
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@DisplayName("Day 1")
class Day01Test {

    @Nested
    @DisplayName("Day 1: Part 1")
    inner class Part1 {
        @Test
        fun example() {
            val answer = Day01(resourceAsText("day01_ex.txt")).solveP1()
            assertThat(answer).isEqualTo(11)
        }

        @Test
        fun answer() {
            val answer = Day01(resourceAsText("day01.txt")).solveP1()
            assertThat(answer).isEqualTo(2113135)
        }
    }

    @Nested
    @DisplayName("Day 1: Part 2")
    inner class Part2 {
        @Test
        fun example() {
            val answer = Day01(resourceAsText("day01_ex.txt")).solveP2()
            assertThat(answer).isEqualTo(31)
        }

        @Test
        fun answer() {
            val answer = Day01(resourceAsText("day01.txt")).solveP2()
            assertThat(answer).isEqualTo(19097157)
        }
    }
}