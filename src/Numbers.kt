interface Numbers {

    fun sum(): Int
    fun dif():Int

    class Base(
        private val number1: Int,
        private val number2: Int,
    ) : Numbers {
        override fun sum(): Int {
            return number1 + number2
        }

        override fun dif(): Int {
            return number1 - number2
        }
    }
}

