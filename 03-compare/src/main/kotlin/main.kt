import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.roundToInt

const val name = "Vito"

fun main(args: Array<String>) {
    val n = 15
    val m = 25
    val match: Boolean = (n == m)
    println("Match: $match")

    val eq: Boolean = n.equals(m)
    println("Equals: $eq")
    // Tools > Kotlin > show bytecode

    println("Compare: ${n.compareTo(m)}")

    val sum = n + m
    println("Sum+: ${sum}")
    val s = n.plus(m)
    println("Sum.plus: ${s}")

    val z = -455.34
    val abs: Double = Math.abs(z)
    val abs2: Double = abs(z)
    val zi = Math.round(abs)
    val zi2 = abs2.roundToInt()

    println(PI)
}