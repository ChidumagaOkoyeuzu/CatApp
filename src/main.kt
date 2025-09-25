fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    binnie.walk()
    clyde.walk()
    println(binnie)
    println(clyde)

    val Flathead = Cat("Flathead", 7, 10)
   val Cupra = Cat("Cupra", 2, 7)
    Flathead.walk()
    Cupra.walk()
    println(Flathead)
    println(Cupra)

    Flathead.eat()
    Flathead.eat()
    println(Flathead)

    Cupra.walk()
    Cupra.walk()
    Cupra.walk()
    Cupra.walk()
    println(Cupra)
}