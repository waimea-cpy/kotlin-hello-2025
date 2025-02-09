/**
 * This is a little intro to Kotlin
 */


/**
 * The main function is the entry
 * point to any Kotlin program
 */
fun main() {
    // We can output to the terminal
    // with print() and println()
    println("Hello World!")

    print("Hello")
    print(" ")
    print("World!")
    println()

    // Strings are concatenated with a +
    println("Hello" + " " + "World!")

    // In kotlin, there are two types of variable

    // If a variable will never change (immutable)
    // we use 'val' (value)...
    val name = "Steve"
    val dob = "27 Dec 1967"

    // If a variable will change (mutable), we use
    // 'var' (variable)
    var height = 185
    var favColour = "Green"
}
    // Variable names should always start with
    // a lowercase letter
    val numLegs = 2     // Good!
    val NumLegs = 2     // Bad!

    // Multiple words in a variable...
    val speciesofpet = "cat"    // Bad!
    val speciesOfPet = "cat"    // Good... CamelCase
    val species_of_pet = "cat"  // Good... SnakeCase










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
 *  - Input:
 *      - readln
 *      - readlnOrNull
 *  - Output with string templates:
 *      - $....
 *      - ${....} for calcs
 *  - String conversion:
 *      - lower
 *      - upper
 *      - toInt
 *      - toIntOrNull
 *  - Branching:
 *      - if, else
 *      - when
 *  - Looping:
 *      - while, for
 *      - ranges: a..b, a..<b, downTo
 *  - Functions
 */