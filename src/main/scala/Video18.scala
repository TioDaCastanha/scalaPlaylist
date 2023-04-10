object Video18{
	/*def main(args: Array[String]): Unit = {
		println("-"*50)

		code(args)

		println("-"*50)
	}*/

	def code(args: Array[String]): Unit = {
		// trait SimpleFunction1[-Input1, +Output] {
		// 	def apply(argument: Input1): Output
		// }

		val totalFunction: Int => String =
			argument => "\"" + argument + "\""

		type ~>[-Input, +Output] = PartialFunction[Input, Output]

		val partialFunction: Int ~> String = {
			case 4 => "\"" + 4 + "\""
		}

		val totalFunctionWhithoutSyntaticSugar: Function1[Int, String] = new Function1[Int, String] {
			override def apply(argument: Int): String =
				"\"" + argument + "\""
		}

		val partialFunctionWhithoutSyntaticSugar: PartialFunction[Int, String] = new PartialFunction[Int, String] {
			override def apply(argument: Int): String =
				if(argument == 4)
					"\"" + argument + "\""
				else 
					sys.error("boom")


			override def isDefinedAt(argument: Int): Boolean =
				if(argument == 4)
					true
				else 
					false

		}

		val random = scala.util.Random.nextInt(5)

		println(" " + 4)
		println(totalFunction(4))
		println(totalFunctionWhithoutSyntaticSugar(4))

		println()
		
		println(" " + 4)
		println(partialFunction(4))
		if(partialFunctionWhithoutSyntaticSugar.isDefinedAt(4))
			println(partialFunctionWhithoutSyntaticSugar(4))
		else 
			println("ain't gonna call apply(SomeNumber)")

		// val range = 1 to 10

		// range foreach println

		// val function: Int => Int = _ + 1

		// range.map(totalFunction) foreach println

		// val predicate: Int => Boolean = _ == 4

		// range.filter(predicate).map(totalFunction) foreach println

		// range.collect(partialFunctionWhithoutSyntaticSugar) foreach println
	

		// class NamedFunction1(name: String) extends SimpleFunction1 {
		// 	override def apply(argument: String): Unit = {
		// 		println(s"Hi I'm $name. $argument")
		// 	}
		// }

		// val singleton: SimpleFunction1 = new SimpleFunction1{
		// 	override def apply(argument: String): Unit = {
		// 		println(s"Hi I'm a singleton. It doesn't even make sense for me to have a constructor :( $argument")
		// 	}
		// }

		// val zed: SimpleFunction1 = new NamedFunction1("Zed")
		// val bob: SimpleFunction1 = new NamedFunction1("Bob")

		// zed("How are you going?")
		// bob("Sup?")
		// singleton("Duhh!")


	}
}