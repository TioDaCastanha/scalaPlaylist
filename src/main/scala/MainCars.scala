object MainCars /*extends App*/{
		/*println("-"*50)

		code(args)

		println("-"*50)*/
	

	def code(args: Array[String]): Unit = {
		final class Lamborghini(override val model: String)
			extends Core.SportsCar(model)
			with Modification.Spoiler{
				override def brand: String = "Lamborghini"
			}

		final class BMW(override val model: String)
			extends Core.OrdinaryCar(model)
			with Modification.Spoiler
			with Modification.EngineControlUnit
			with Modification.TurboCharger{
				println("BMW")

				override def brand: String = "BMW"
			}

		// println(new Lamborghini("Murcielago"))

		// class Person(val name: String) extends AnyRef

		// val bob = new Person("bob")

		// val bob = new AnyRef {
		// 	def name: String = "bob"
		// }

		// println(bob.name)
		// println(bob.getClass)

		// BMW -> TurboCharger -> EngineConrolUnit -> Spoiler -> OrdinaryCar -> Car -> Anyref -> Any

		// println(new BMW("M3-GT"))

		val firstLogThenIgnoreCase = 
			new java.util.HashSet[String]
				with Modification.CaseIgnorance
				with Modification.Logging

		val firstIgnoreCaseThenLog =
			new java.util.HashSet[String]
				with Modification.Logging
				with Modification.CaseIgnorance


		// prints out "Add: HI" and then adds "hi" to Set
		firstLogThenIgnoreCase.add("HI")

		// adds "hi" to the collection and then prints out "Add: hi"
		firstIgnoreCaseThenLog.add("HI")

		println(
			firstLogThenIgnoreCase.contains("Hi") &&
			firstIgnoreCaseThenLog.contains("hI")
		)

		/*println(executionStart)
		println(new java.util.Date(executionStart))*/
	}
}