//A simple calculator program using a when statement

fun main() {
     println("Enter first number:")
     val num1= readln()!!.toDouble()

    println("Enter second number:")
    val num2= readln()!!.toDouble()

    println("choose an operation (+, -, *, /")
    val operator = readln()

    val result = when (operator){
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 != 0.0){
                num1 / num2
            } else {
                "cannot divide by zero"
            }
        }
        else -> "invalid operator"
    }
    println("result $result")
}