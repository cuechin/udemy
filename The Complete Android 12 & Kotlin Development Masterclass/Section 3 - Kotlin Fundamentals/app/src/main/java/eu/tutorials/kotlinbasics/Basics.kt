package eu.tutorials.kotlinbasics

fun myFunction(){
    print("Called from myFunction")
}
// Method - a Method is a Function within a class
// Parameter (input)
fun addUp(a: Int, b: Int) : Int{
    // output
    return a + b
}

fun avg(a: Double, b: Double): Double{
    return (a+b)/2
}

fun main(){

    //var name : String = "Denis"
    // name = null -> Compilation ERROR

    var nullableName : String? = "Denis"
    //nullableName = null

    //var len = name.length
    var len2 = nullableName?.length
    println(nullableName?.toLowerCase())

    // Print if the variable is in fact not null
    nullableName?.let { println(it.length) }

    // ?: Elvis operator
    val name = nullableName ?: "Guest"

    // argument
    var avg = avg(5.3, 13.37)
    var result = addUp(5, 3)
    print("result is $result")
    print("avg is $avg")

    //myFunction()
    //myFunction()


    // immutable `variable`
    val myName = "Frank"
    // type int 32 bit
    var myAge = 31 // This is a type inference, it finds out the type from context.

    // Integer TYPES: Byte (8 bit), Short (16 bit),
    // Int (32 bit), Long (64 bit)
    val myByte : Byte = 13
    val myShort : Short = 125
    val myInt : Int = 123123123
    val myLong : Long = 12_039_812_309_487_120_39

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat : Float = 13.34f // Float is important for example when you develop video games and you want to calculate the physics, then having as fast as possible calculations will be more important than having super duper precision
    val myDouble : Double = 3.14159265358979323846

    // Booleans: the type Boolean is used to represent logical values. It can have two possible values true and false
    var isSunny : Boolean = true

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    print("First character $firstCharInStr")

    //Arithmetic operators (+, -, *, /, %)
    var result1 = 5+3
    result1 = result1 / 2
    // alternatively
    // result /= 2
    result1 = result1 * 5
    result1 = result1 - 1
    var moduloResult = 5%2
    println( moduloResult)

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    // Concatenation - adding of "Strings"
    println("isEqual is " + isEqual)
    val isNotEqual = 5!=5
    // Kotlin has a feature called String Interpolation.
    // This feature allows you to directly insert a template expression inside a String.
    // Template expressions are tiny pieces of code that are evaluated and
    // their results are concatenated with the original String.
    // A template expression is prefixed with $ symbol.
    // Following are examples of String interpolation
    println("isNotEqual is $isNotEqual")

    println("is5Greater3 ${5 > 3}")
    println("is5LowerEqual3 ${5 >= 3}")
    println("is5LowerEqual5 ${5 >= 5}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")


    //Increment & Decrement operators (++, --)
    myNum++
    println("myNum is $myNum")
    // increments after use
    println("myNum is ${myNum++}")
    // increments before use
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")

    var heightPerson1 = 170
    var heightPerson2 = 189

    if (heightPerson1 > heightPerson2){
        println("use raw force")
    } else if (heightPerson1 == heightPerson2) {
        println("use your power technique 1337")
    } else {
        println("use technique")
    }

    val age = 31

    if (age >= 30)
        println("you're over 30")

    if(age >= 21){
        println("now you may drink in the US")
    } else if (age >= 18) {
        println("you may vote now")
    } else if (age >= 16) {
        println("you may drive now")
    } else {
        print("you're too young")
    }

    when(age){
        !in 0..20 -> println("now you may drink in the US")
        in 18..20 -> println("you may vote now")
        16, 17 -> println("you may drive now")
        else -> println("you're too young")
    }

    var x : Any = "13.37f"
    when(x){
        is Int -> println("$x is an Int")
        !is Double -> println("$x is an Double")
        is String -> println("$x is an String")
        else -> println("$x is none of the above")
    }

    //assign when to a variable
    val result2 =  when(x) {
    //let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
    //then print x with the result
    print("$x $result2")

    var name1 = "Denis"

    if(name1 == "Denis"){
        println("Welcome home Dennis?")
    }else{
        println("Who are you?")
    }
    var isRainy = true
    if (isRainy)
        println("It's rainy")

    //create a variable for testing all condition
    val age2 = 16
    //create a variable for drinkingAge
    val drinkingAge = 21
//create a variable for votingAge
    val votingAge = 18
//create a variable for drivingAge
    val drivingAge = 16

//Assign the if statement to a variable
    val currentAge =  if (2 >=drinkingAge){
        println("Now you may drink in the US")
//return the value for this block
        drinkingAge
    }else if(age2 >=votingAge){
        println("You may vote now")
//return the value for this block
        votingAge
    }else if (2>=drivingAge){
        println("You may drive now")
//return the value for this block
        drivingAge
    }else{
        println("You are too young")
//return the value for this block
        age2
    }
//print the age for the passing condition
    print("current age is $currentAge")

    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        in 12 downTo 2 -> println("Spring")
        else -> println("Invalid Season")
    }

    var x1 = 1
    while(x1 >= 0) {
        print("$x1")
        x1 -= 2
    }
    println("\nwhile loop is done")

    // Do while loop
    // The do-while loop is similar to while loop except that it
    // tests the condition at the end of the loop.
    // This means that it will at least execute the body once
    do {
        x1++
    } while (x1 <= 100)

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }

    // For Loop
    // A for-loop is used to iterate through ranges, arrays, collections, or anything
    // that provides an iterator (You’ll learn about iterator, arrays, ranges and collections in a future lectur    e).
    for(num in 1..10){
        print("$num")
    }

    // infix notation
    for(i in 1 until 10){ // Same as - for(i in 1.until(10)
        print("$i ")
    }

    for(i in 10 downTo 1) {     // Same as - for(i in 10.downTo(1))
        print("$i ")
    }

    for(i in 10 downTo 1 step 2){ // Same as - for(i in 10.downTo(1).step(2))
        print("$i ")
    }

    for(i in 1 until 20){
        // 10/2 = 5
        // 11/2 = 5.5 which is 5 in term of an int
        print("$i ")
        if(i/2 == 5){
            break
        }
    }
    print("Done with the loop")
}



