package com.example.homework.o.Lesson17and18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstStudent = Student(0, "Steve")
        val secondStudent = Student(1, "Li")
        val thirdStudent = Student(2, "John")
        val fourthStudent = Student(3, "Sara")
        val fifthStudent = Student(4, "Nina")

        val firstDiscipline = Discipline(0, "Math")
        val secondDiscipline = Discipline(0, "English")
        val thirdDiscipline = Discipline(0, "GYM")

        val stevesMarkForMath = Mark(firstStudent,firstDiscipline).disciplineMarkForStudent()
        val stevesMarkForEnglish = Mark(firstStudent,secondDiscipline).disciplineMarkForStudent()
        val stevesMarkForGYM = Mark(firstStudent,thirdDiscipline).disciplineMarkForStudent()

        val lisMarkForMath = Mark(secondStudent,firstDiscipline).disciplineMarkForStudent()
        val lisMarkForEnglish = Mark(secondStudent,secondDiscipline).disciplineMarkForStudent()
        val lisMarkForGYM = Mark(secondStudent,thirdDiscipline).disciplineMarkForStudent()

        val johnsMarkForMath = Mark(thirdStudent,firstDiscipline).disciplineMarkForStudent()
        val johnsMarkForEnglish = Mark(thirdStudent,secondDiscipline).disciplineMarkForStudent()
        val johnsMarkForGYM = Mark(thirdStudent,thirdDiscipline).disciplineMarkForStudent()

        val sarasMarkForMath = Mark(fourthStudent,firstDiscipline).disciplineMarkForStudent()
        val sarasMarkForEnglish = Mark(fourthStudent,secondDiscipline).disciplineMarkForStudent()
        val sarasMarkForGYM = Mark(fourthStudent,thirdDiscipline).disciplineMarkForStudent()

        val ninasMarkForMath = Mark(fifthStudent,firstDiscipline).disciplineMarkForStudent()
        val ninasMarkForEnglish = Mark(fifthStudent,secondDiscipline).disciplineMarkForStudent()
        val ninasMarkForGYM = Mark(fifthStudent,thirdDiscipline).disciplineMarkForStudent()

        val averageForFirstStudent = FunctionsForAverageData().averageMarkForStudent(stevesMarkForEnglish,
            stevesMarkForGYM,
            stevesMarkForMath)
        println(averageForFirstStudent)
        val averageForSecondStudent = FunctionsForAverageData().averageMarkForStudent(lisMarkForMath,
            lisMarkForEnglish,
            lisMarkForGYM)
        println(averageForSecondStudent)
        val averageForThirdStudent = FunctionsForAverageData().averageMarkForStudent(johnsMarkForMath,
            johnsMarkForEnglish,
            johnsMarkForGYM)
        println(averageForThirdStudent)
        val averageForFourthStudent = FunctionsForAverageData().averageMarkForStudent(sarasMarkForMath,
            sarasMarkForEnglish,
            sarasMarkForGYM)
        println(averageForFourthStudent)
        val averageForFifthStudent = FunctionsForAverageData().averageMarkForStudent(ninasMarkForMath,
            ninasMarkForEnglish,
            ninasMarkForGYM)
        println(averageForFifthStudent)

        val averageForMath = FunctionsForAverageData().averageMarkForDiscipline(stevesMarkForMath,
            lisMarkForMath,
            sarasMarkForMath,
            ninasMarkForMath,
            johnsMarkForMath)
        println(averageForMath)
        val averageForEnglish = FunctionsForAverageData().averageMarkForDiscipline(stevesMarkForEnglish,
            lisMarkForEnglish,
            sarasMarkForEnglish,
            ninasMarkForEnglish,
            johnsMarkForEnglish)
        println(averageForEnglish)
        val averageForGYM = FunctionsForAverageData().averageMarkForDiscipline(stevesMarkForGYM,
            lisMarkForGYM,
            sarasMarkForGYM,
            ninasMarkForGYM,
            johnsMarkForGYM)
        println(averageForGYM)

        val averageInClass = FunctionsForAverageData().averageMarkInClass(averageForFirstStudent,
            averageForSecondStudent,
            averageForThirdStudent,
            averageForFourthStudent,
            averageForFifthStudent)
        println(averageInClass)
    }
}