import com.sun.xml.internal.bind.v2.model.core.ID

fun main(args: Array<String>) {
val (IdNumber,name) =addStudent()
println("Student ID:$IdNumber and Name:$name")
}

data class Student(val ID:Int,val Name:String)

fun addStudent():Student {
     print("Enter ID Please:")
     val ID:Int= readLine()?.toInt() ?: 0
    print("Enter Student Name Please:")

    val name:String= readLine() ?:"No Name"
     return Student(ID, name)
}




