/*object Video11{
	def main(args: Array[String]): Unit = {
		println("-"*50)

		code(args)

		println("-"*50)
	}

	def code(args: Array[String]): Unit = {
		// def plusFive(input: Int): Int = input + 5
		// def dividedByTwo(input: Int): Int = input / 2

		def show(functionName: String, argument: Int, function: Int => Int): Unit =
			println(higherOrder(functionName, argument, function))

		def higherOrder(functionName: String, argument: Int, function: Int => Int): String = 
			lowerOrder(functionName, argument, function(argument))

		def lowerOrder(functionName: String, argument: Int, result: Int): String = 
			s"Function: $functionName\tArgument: $argument\tResult: $result"

		// val renderedPlusFive: String =
		// 	s"Function: plusFive\tArgument: ${10}\tResult: ${plusFive(10)}"
		// val renderedDividedByTwo: String =
		// 	s"Function: plusFive\tArgument: ${20}\tResult: ${dividedByTwo(20)}"

		show("+ 5", 	10,	_ + 5)
		show("/ 2", 	20, _ / 2)
		show("* 3", 	 2, _ * 3)
		show("mod 2", 	 9, _ % 2)

	}
}*/