# Kotlin Programming
ffun main() {
    val ss = stu1("yasmin", 23, 12.9)

    stu1.speak("")
    stu1.add(11,14)

}

class stu1(private var name1: String, var age: Int, var GPA: Double) {
    fun speak() {

        println("my  $name1\n and my  $age\n and my $GPA \n")
    }

    fun add(n1: Int, n2: Int): Int {
        return n1 + n2

    }


}



