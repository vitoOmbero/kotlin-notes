import Constants.Companion.NAME
import Constants.Companion.NAME2

// see bytecode

val badname = "vito"

const val badnametoo = "vito"

fun main(args: Array<String>) {
    println(badname)
    println(badnametoo)
    println(NAME)
    println(NAME2)

    var str = "string"
    println(str)
    val empty = String()
    println(empty)
    val charArr: CharArray = str.toCharArray()
    println(charArr.toList())

    val byteArr: ByteArray = str.toByteArray()
    println(byteArr.toList())

    // strings are immutable
    // see bytecode
    str += "addition"
    println(str)

    val len = str.length
    for (i in 0 until len) {
        val c = str[i]
        println(c)
    }
    val p = str.indexOf("d")
    val subset = str.substring(p)
    println(subset)

    val builder = StringBuilder("alkhbkhb")
            .append("\n")
            .append("!")
    val result = builder.toString()
    println(result)
}