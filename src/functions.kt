fun main() {

    //Standard Library Functions - ALREADY EXIST

    var number = Math.sqrt(144.0)
    println("The squareroot number is $number")

    var result = Math.max(80, 78)
    println("The maximum value is $result")

    day()
    sum( x = 56, y = 20, z = 70)
    sum( x = 23, y = 90, z = 85)



}

//User-defined Functions
fun day(){
    println("Today is Wednesday")
}

//Parameters/Variables and Arguments/Values
fun sum(x:Int, y:Int, z:Int){
    println(x + y)
}