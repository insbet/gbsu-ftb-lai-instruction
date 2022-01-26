package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: Int): String {
        var result = ""
        if (inputNumber == null) {
            return null
        }
        if (inputNumber == 1) {
            return "1"
        }
        val inputNumberAsStr: String = String.valueOf(inputNumber)
        val isDevByThree = isDivisibleByThree(inputNumber)
        val isDevByFive = isDivisibleByFive(inputNumber)
        if (!isDevByThree && !isDevByFive && !contains(inputNumberAsStr, "3") && !contains(inputNumberAsStr, "5")
                && !contains(inputNumberAsStr, "7")) {
            return inputNumberAsStr
        }
        if (isDevByThree) {
            result = result.concat("Gbsu")
        }
        if (isDevByFive) {
            result = result.concat("Ftb")
        }
        for (i in 0 until inputNumberAsStr.length()) {
            val partition: String = String.valueOf(inputNumberAsStr.charAt(i))
            val containsThree = contains(partition, "3")
            val containsFive = contains(partition, "5")
            val containsSeven = contains(partition, "7")
            if (containsThree) {
                result = result.concat("Gbsu")
            } else if (containsFive) {
                result = result.concat("Ftb")
            } else if (containsSeven) {
                result = result.concat("Lai")
            }
        }
        return result
    }

    fun isDivisibleByThree(inputNumber: Int): Boolean {
        return inputNumber % 3 == 0
    }

    fun isDivisibleByFive(inputNumber: Int): Boolean {
        return inputNumber % 5 == 0
    }

    fun contains(inputNumberAsStr: String, content: String?): Boolean {
        return inputNumberAsStr.contains(content)
    }

}