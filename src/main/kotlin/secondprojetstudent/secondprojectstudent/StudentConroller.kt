package secondprojetstudent.secondprojectstudent

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.StringJoiner

@RestController
class StudentController {
var studentService = StudentService()

    @GetMapping("/returnStudents")
    fun returnStundets():Map<Long,Student> {
        return returnStundets()
    }

    @GetMapping("/addStudent")
    fun addStudent(@RequestParam id:Long,
                   @RequestParam name:String,
                   @RequestParam lastname:String,
                   @RequestParam age:Int,
                   @RequestParam yearOfBirth:Int,
                   @RequestParam faculty:String,
                   @RequestParam course:Int
    )
    {
        var addStudent = Student()
        addStudent.name = name
        addStudent.lastName = lastname
        addStudent.age = age
        addStudent.faculty = faculty
        addStudent.course = course
        addStudent.yearOfBirth = yearOfBirth

        studentService.addStudent(id,addStudent)
    }

    @GetMapping("/deleteStudent")
    fun deleteStudent(@RequestParam id: Long){
        studentService.deleteStudent(id)
    }

    @GetMapping("/searchStudent")
    fun searchStudent(@RequestParam id: Long):Student {
        return searchStudent(id)
    }

    @GetMapping("/changeStudent")
    fun changeStudent(@RequestParam id: Long,
                      @RequestParam name: String,
                      @RequestParam lastname: String,
                      @RequestParam age: Int,
                      @RequestParam yearOfBirth: Int,
                      @RequestParam faculty: String,
                      @RequestParam course: Int
    )
    {
        var newStudent = Student()
        newStudent.name = name
        newStudent.lastName = lastname
        newStudent.age = age
        newStudent.yearOfBirth = yearOfBirth
        newStudent.faculty = faculty
        newStudent.course = course

        studentService.changStudents(id,newStudent)
    }
}