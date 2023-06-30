class Person(val name: String, var age: Int) {
    fun speak() {
        println("Hello, my name is $name and I'm $age years old.")
    }
    
    fun haveBirthday() {
        age++
        println("Happy birthday, $name! You are now $age years old.")
    }
}

fun main() {
    val person = Person("John", 30)
    person.speak()

    person.age = 31
    person.speak()

    person.haveBirthday()
    person.speak()
}
