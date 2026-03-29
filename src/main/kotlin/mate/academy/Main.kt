package mate.academy

fun greetUsers() {
    while(true) {
        val string = readln()
        if (string == "") break
        println("Hello, $string!")
    }
}

fun main() {
    greetUsers()
}
