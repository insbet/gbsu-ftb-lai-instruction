package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: Int): String {
        var result = ""
        if (inputNumber == 1) {
            return "1"
        }
        val inputNumberAsStr: String = inputNumber.toString()
        val isDevByThree = isDivisibleByThree(inputNumber)
        val isDevByFive = isDivisibleByFive(inputNumber)
        if (!isDevByThree && !isDevByFive && !contains(inputNumberAsStr, "3") && !contains(inputNumberAsStr, "5")
                && !contains(inputNumberAsStr, "7")) {
            return inputNumberAsStr
        }
        if (isDevByThree) {
            result = result+"Gbsu"
        }
        if (isDevByFive) {
            result = result+"Ftb"
        }
        for (i in 0 until inputNumberAsStr.length) {
            val partition: String = inputNumberAsStr.get(i).toString()
            val containsThree = contains(partition, "3")
            val containsFive = contains(partition, "5")
            val containsSeven = contains(partition, "7")
            if (containsThree) {
                result = result+"Gbsu"
            } else if (containsFive) {
                result = result+"Ftb"
            } else if (containsSeven) {
                result = result+"Lai"
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

    fun contains(inputNumberAsStr: String, content: String): Boolean {
        return inputNumberAsStr.contains(content)
    }

}