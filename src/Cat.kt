class Cat (val name: String, var age: Int, var weight: Int) {

    public fun walk(distance: Int) : Boolean
    {
        if(weight - distance >= 5) {
            weight -= distance
            return true
        }
        return false
    }
    fun eat(amount: Int) {
        if (amount <= 0) {
            println("Error: There is nothing to eat.")
            return
        }

        if (weight + amount > 20) {
            println("Error: $name cannot eat $amount as $name would be overweight.")
            return
        }

        weight += amount
        println("$name is eating $amount unit(s) of food.")
    }

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}
