object Video12{
	/*def main(args: Array[String]): Unit = {
		println("-"*50)

		code(args)

		println("-"*50)

	}*/

	def code(args: Array[String]): Unit = {

		def closedTerm(freeVariable: Int): Int => Int =
			boundVariable => freeVariable + boundVariable
		// val x: Int = 7
		// def addToX(y: Int): Int = x + y

		println (closedTerm	( 7)(0))
		println (closedTerm	(10)(1))
		println (closedTerm	(20)(2))
		println (closedTerm	(30)(3))

		val partialCoputing =  closedTerm(40)
			println(partialCoputing(4))
	}

}
