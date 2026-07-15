class Person{

    var name = "John"
    var gender = "Male"

    fun Drink(){
        println("Doctor is drinking")
    }

}

fun main() {

    var doctor = Person()
    println(doctor.name)

    var farmer = Person()
    println(farmer.name)

}