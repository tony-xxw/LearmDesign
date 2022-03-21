package design.principle.dependenceinversion

import java.awt.color.ICC_ColorSpace
import javax.swing.Icon


fun main() {
    CourseImpVersion1().apply {
        studyCPlusCourse()
        studyJavaCourse()
        studyKotlinCourse()
    }

    println()
    //version2
    CourseImpVersion1().apply {
        studyCourse(PythonCourse())
        studyCourse(JavaCourse())
    }
    println()
    //version3
    CourseImpVersion1(PythonCourse()).apply {
        studyCourse()
    }
    println()
    //version4
    CourseImpVersion1().apply {
        iCourse = JavaCourse()
        studyCourse()
    }


}

class CourseImpVersion1(var iCourse: ICourse? = null) {
    fun studyJavaCourse() {
        println("学习Java课程")
    }

    fun studyKotlinCourse() {
        println("学习kotlin课程")
    }

    fun studyCPlusCourse() {
        println("学习c++课程")
    }

    fun studyCourse(iCourse: ICourse) {
        iCourse.studyCourse()
    }

    fun studyCourse() {
        iCourse?.studyCourse()
    }

}

interface ICourse {
    fun studyCourse()
}

class PythonCourse : ICourse {
    override fun studyCourse() {
        println("学习python课程")
    }
}

class JavaCourse : ICourse {
    override fun studyCourse() {
        println("学习Java课程")
    }

}
