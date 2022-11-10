package secondprojetstudent.secondprojectstudent

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SecondprojectstudentApplicationTests {

    @Test
    fun contextLoads() {
    }

    @Test
    fun testForMySelf() {
        var studentService = StudentService()

        var firstStudent = Student()
        firstStudent.name = "Cherim"
        firstStudent.lastName = "Tseev"
        firstStudent.age = 10
        firstStudent.course = 6
        firstStudent.faculty = "Warlok"
        firstStudent.yearOfBirth = 1852

        var secondStudent = Student()
        secondStudent.name = "Romchitos"
        secondStudent.lastName = "Jostkiy"
        secondStudent.age = 11
        secondStudent.course = 3
        secondStudent.faculty = "Magistr"
        secondStudent.yearOfBirth = 1999

        var threeStudent = Student()
        threeStudent.name = "Mandrey"
        threeStudent.lastName = "Doter"
        threeStudent.age = 29
        threeStudent.course = 12
        threeStudent.faculty = "Rapira"
        threeStudent.yearOfBirth = 1998

        studentService.addStudent(0,firstStudent)
        studentService.addStudent(1,secondStudent)
        studentService.addStudent(2,threeStudent)

        studentService.searchStudent(1)
        //studentService.deleteStudent(1)
        studentService.addStudent(1,firstStudent)

        var result = studentService.returnStudent()
        for ((key, value) in result) {
            println((key.toString() + " " + value.name + " " + value.lastName + " " + value.age + " " + value.course + " " + value.faculty + " " + value.yearOfBirth))
        }
    }
}
