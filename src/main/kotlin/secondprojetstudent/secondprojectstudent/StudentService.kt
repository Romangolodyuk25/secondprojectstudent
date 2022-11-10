package secondprojetstudent.secondprojectstudent

class StudentService {
    var students = HashMap<Long, Student>()
    var idStudent = 0L

    fun returnStudent(): Map<Long, Student> {
        return students
    }

    fun addStudent(id:Long, student : Student) {
        students.put(id, student)
        idStudent++
    }

    fun deleteStudent(idStudent: Long) {
        students.remove(idStudent)
    }

    fun searchStudent(id:Long): Student {
        return students.get(id)!!
    }

    fun changStudents(id: Long,student: Student){
        students.get(id)!!.age = student.age
        students.get(id)!!.lastName = student.lastName
        students.get(id)!!.course = student.course
        students.get(id)!!.faculty = student.faculty
        students.get(id)!!.yearOfBirth = student.yearOfBirth
        students.get(id)!!.name = student.name

    }
}