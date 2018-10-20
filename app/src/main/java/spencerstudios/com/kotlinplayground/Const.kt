package spencerstudios.com.kotlinplayground

class Const {
    companion object {
        fun commands(rn: Int): ArrayList<String> {
            return arrayListOf("think of a number", "multiply that number by 2", "add $rn to it", "divide that number by 2", "subtract that number by the number you thought of first", "the number in your mind is ${rn / 2}")
        }
    }
}
