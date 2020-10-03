const val name = "Vito"

fun main(args: Array<String>) {
    println("Args[0]:" + args[0])
    println("Args[1]: ${args[1]}")
    println("Top level val: $name")

    val num = 42
    println("immutable num = $num")
    // num++

    var num2: Int = 42
    ++num2
    println("variable num = $num2")

    // val num3 : Double = 5
    val num3: Double = 5.toDouble()
    println("immutable num = $num3")

    var nullableInt: Int? = null
    println("Current value = $nullableInt, new:")
    nullableInt = readLine()?.toInt()
    println("New value = $nullableInt")

    nullableInt = 64
    /*
            Numbers

            Kotlin(java) // Bits
            Double (double) // 64
            Float // 32
            Long // 64
            Int // 32
            Short // 16
            Byte // 8
            Char // Not treated as number
            Boolean //  true or false
            String (String) // immutable
            Array (n/a) // just Kotlin class

             */

    val one = 42
    // explicit!!!
    val oneLong: Long = one.toLong()

    println("the type of oneLong is ${oneLong::class.simpleName}")
}