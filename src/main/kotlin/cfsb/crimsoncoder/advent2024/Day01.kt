package cfsb.crimsoncoder.advent2024

class Day01(input: String) {
    private val lists = parseInput(input)

    fun solveP1(): Int {
        val leftList = lists.first
        val rightList = lists.second
        val totalDiff = leftList.sorted().zip(rightList.sorted()).sumOf { (a, b) -> kotlin.math.abs(a - b) }
        return totalDiff
    }

    fun solveP2(): Int {
        val leftList = lists.first
        val rightList = lists.second
        return leftList.sumOf { n -> n * rightList.count { it == n } }
    }

    private fun parseInput(input: String): Pair<List<Int>, List<Int>> {
        val numPairs = input
            .trim()
            .lines()
            .map {
                val (a, b) = it.trim().split(" ", limit = 2)
                Pair(a.trim().toInt(), b.trim().toInt())
            }

        val leftList = numPairs.map { it.first }
        val rightList = numPairs.map { it.second }
        return Pair(leftList, rightList)
    }
}