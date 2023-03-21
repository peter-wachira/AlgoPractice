package GDSCExcercises

// Exercise 1
enum class CardType(val status: String, val passNo: Int) {
    GOLD("VIP", 120), SILVER("VVIP", 10), BRONZE("Regular", 200)
}


// Exercise 1
class StockMarket {
    companion object Currencies {
        var dollarValue = 121.0
        fun computeKshValue(dollarValue: Double, ksh: Double): Double {
            return dollarValue * ksh
        }
    }
}


fun main(args: Array<String>) {

    //Excercise 1
    val peterAccessLevel = CardType.BRONZE
    when (peterAccessLevel) {
        CardType.BRONZE -> print(peterAccessLevel.passNo)
        CardType.GOLD -> print("Gold")
        CardType.SILVER -> print("Silver")
    }


    //Excercise 2
    println(StockMarket.dollarValue)
    println(StockMarket.computeKshValue(121.0, 2.0))
}
