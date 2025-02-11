import java.util.*

/**
 * This is a little intro to Kotlin
 */


/**
 * The main() function is the entry point to any Kotlin program
 */
fun main() {
    // OUTPUT ======================================

    // We can output to the terminal with print() and println()

    // println() move the cursor to the next line after output
    println("Hello World!")

    // print() keeps the output on the same line
    print("Hello")
    print(" ")
    print("World!")
    println()

    // Strings are concatenated with a +
    println("Hello" + " " + "World!")


    // VARIABLES ======================================

    // In kotlin, there are two types of variable...

    // If a variable will never change (immutable) we use 'val' (value)
    val name = "Steve"
    val dob = "27 Dec 1967"

    // If a variable will change (mutable), we use 'var' (variable)
    var height = 185
    var favColour = "Green"
    height = 187            // New values (reassignment)
    favColour = "Red"

    // Variable names should always start with a lowercase letter
    val numLegs = 2     // Good!
    val NumLegs = 2     // Bad!

    // Multiple words in a variable...
    val speciesofpet = "cat"    // Bad!
    val speciesOfPet = "cat"    // Good... CamelCase
    val species_of_pet = "cat"  // Good... SnakeCase


    // STRING TEMPLATES ======================================

    // We often want to output variable values with text

    println("My name is " + name)   // Using concatenation

    println("My name is $name")     // Using a template
    println("I have $numLegs legs")

    // If we need to do calculations, use {...}
    println("I have ${numLegs * 5} toes")


    // STRING MANIPULATION ======================================

    println(name.uppercase())
    println(name.lowercase())

    val scoreText = "1000"          // This is a string!
    val score = scoreText.toInt()   // This is an Int and we can do Maths
    println("Score: $score")

    val testText = "Goat"
    val textNum = testText.toIntOrNull()    // This copes with bad inputs
    println(textNum)


    // USER INPUT ====================================

    print("Enter your favourite color: ")
    val colour = readln()
    println("I like $colour too!")

    // If you need a number from user...
    print("Enter your favourite number: ")
    val number = readln().toIntOrNull()


    // BRANCHING ======================================

    // Can use if / else if / else
    if (number == null) {
        println("That's not a number")
    }
    else {
        println("So, you like $number?")
    }

    // Alternatively
    when (number) {
        null -> println("That's not a number")
           7 -> println("Seven is just the best!")
          13 -> println("No, that's unlucky!")
        else -> println("Oh, interesting")
    }


    // LOOPING / ITERATION ================================

    // while loops
    var count = 1
    while (count <= 10) {
        println(count)
        count++
    }

    // Infinite loop
    while (true) {
        println("Hi! Type 'x' to exit")
        val input = readln()
        if (input == "x") break     // The breakout condition
    }

    // For range loop
    for (num in 1..10) {
        println(num)
    }
    
}








/**
 * Notes
 *
 * Cover:
 *  - Comments
 *  - Output:
 *      - print
 *      - println
 *  - String concatenation
 *  - Variables:
 *      - var
 *      - val
 *      - naming
 *  - Output with string templates:
 *      - $....
 *      - ${....} for calcs
 *  - String conversion:
 *      - lower
 *      - upper
 *      - toInt
 *      - toIntOrNull
 *  - Input:
 *      - readln
 *      - readlnOrNull
 *  - Branching:
 *      - if, else
 *      - when
 *  - Looping:
 *      - while, for
 *      - ranges: a..b, a..<b, downTo
 *  - Functions
 */