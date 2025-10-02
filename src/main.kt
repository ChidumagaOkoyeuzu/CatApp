fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    binnie.walk(3)
    clyde.walk(2)
    println(binnie)
    println(clyde)

    val Flathead = Cat("Flathead", 7, 10)
   val Cupra = Cat("Cupra", 2, 7)
    Flathead.walk(4)
    Cupra.walk(2)
    println(Flathead)
    println(Cupra)

    Flathead.eat()
    Flathead.eat()
    println(Flathead)

    Cupra.walk(1)
    Cupra.walk(1)
    Cupra.walk(1)
    Cupra.walk(1)
    println(Cupra)
}