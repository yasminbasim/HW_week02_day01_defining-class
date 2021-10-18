fun main() {
    var ss = stu1("yasmin", 23, 12.9)

    ss.speak()
    ss.add(11,14)

}

class stu1( var name1: String, var age: Int, var GPA: Double) {
    fun speak() {
        println("my name is $name1\n and my age is $age\n and my is GPA $GPA \n")
    }

    fun add(n1: Int, n2: Int): Int {
        return (n1 + n2)

    }


}


