class Exercise

fun main() {
    println(School().printName())
}

interface RegNo {
    val regNo: String
    fun printName() {
        println("Hello")
    }
}

open class Institution : RegNo {
    override val regNo: String
        get() = "ENM"
    open val address: String = "Juja"

}

class School : Institution() {
    override val address: String
        get() = super.address
}

class Student : RegNo {
    override val regNo: String
        get() = "ENM221z"

}