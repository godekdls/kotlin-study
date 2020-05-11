package chap06.section1

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val user = User(1, "Kildong", 30)
    user.age = 20
    println("user.age = ${user.age}")
}