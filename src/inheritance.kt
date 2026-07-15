open class Animal{

    var isMammal = true
    var hasLimbs = true

}

class Cow:Animal(){

    var hasHorns = true

    fun sound(){
        println("Moow! Moow!")
    }
}


class Cat :Animal(){

    fun sleep(){
        println("Cat is sleeping")
    }

}

fun main() {
    var a =Animal()

    var c =Cow()
    println(c.hasLimbs)
    c.sound()

}