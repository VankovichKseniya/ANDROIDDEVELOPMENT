package com.example.homework.o.Lesson17and18

open class Mark(var student: Student, var discipline: Discipline) {

    var value = (0..10).random()

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }

    fun disciplineMarkForStudent(): Int {
       return value
    }
}