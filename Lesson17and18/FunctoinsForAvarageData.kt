package com.example.homework.o.Lesson17and18

import android.util.Log
import java.math.RoundingMode

class FunctionsForAverageData() {

    fun averageMarkForStudent(firstMark: Int, secondMark: Int, thirdMark: Int): Double{     //Создаю функцию, которая выводит среднюю
        val numArray = doubleArrayOf(firstMark.toDouble(), secondMark.toDouble(),           //оценку студента, принимая оценки студента за каждый предмет
            thirdMark.toDouble()
        )
        var sum = 0.0

        for (num in numArray) {
            sum+=num
        }
        Log.d("Оценка", "Оценка студента")
        val average = sum / numArray.size
        val rounded = average.toBigDecimal().setScale(1, RoundingMode.UP). toDouble()

        if (rounded>=9){                                                        //Определяю и вывожу в логи уровень знаний
            Log.e("Студент", "Отличник")
        }else if(rounded<=8 && rounded>5){
            Log.e("Студент", "Хорошист")
        }else if(rounded<=5){
            Log.e("Студент", "Двоечник")
        }
        return rounded
    }

    fun averageMarkForDiscipline(firstStudentMark: Int, secondStudentMark: Int,
                                 thirdStudentMark: Int, fourthStudentMark: Int, fifthStudentMark: Int): Double{
        val numArray = doubleArrayOf(firstStudentMark.toDouble(), secondStudentMark.toDouble(),
            thirdStudentMark.toDouble(), fourthStudentMark.toDouble(), fifthStudentMark.toDouble()
        )
        var sum = 0.0

        for (num in numArray) {
            sum+=num
        }
        Log.w("Оценка", "Средняя оценка по предмету")
        val average = sum / numArray.size
        return average
    }

    fun averageMarkInClass(averageMarkFirstStudent: Double, averageMarkSecondStudent: Double,           //создаю функцию, которая выводит среднюю оценку в классе,
                           averageMarkThirdStudent: Double, averageMarkFourthStudent: Double,           // принимая все средние оценки каждого студента
                           averageMarkFifthStudent: Double): Double{
        val numArray = doubleArrayOf(averageMarkFirstStudent, averageMarkSecondStudent,
            averageMarkThirdStudent, averageMarkFourthStudent, averageMarkFifthStudent
        )
        var sum = 0.0

        for (num in numArray) {
            sum+=num
        }
        Log.e("Оценка", "Средняя оценка в классе")
        val average = sum / numArray.size
        val rounded = average.toBigDecimal().setScale(1, RoundingMode.UP). toDouble()
        return rounded
    }
}