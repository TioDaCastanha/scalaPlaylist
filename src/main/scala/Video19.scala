object Video19 {
	def main(args: Array[String]): Unit = {
		println("-"*50)

		code(args)

		println("-"*50)
	}

/*	def method(input: Any): Any = input match {
		case variable => s"Any: $variable" 
	}

	def method(input: Int): Any = input match {
		case variable => s"Int: $variable"
	}*/

	def code(args: Array[String]): Unit = {
	
		def method(input: Any): Any = input match {
			//case person: AnPerson if person.isAdult 
			//	=> s"guard: ${person.isAdult}"
			//case person: AnPerson => person.name
			case p @ AnPerson(n, a) =>
				s"""|Matched $n who is $a years old.
					|This is the "toString" implementation:
					|$p""".stripMargin

			case (first: AnPerson, second: AnPerson) =>
				s"Received $first and $second"
		}

		def show(input: Any): Unit = {
			println(method(input))
		}

		val bob =
			AnPerson(
				name = "Bob",
				age = 33
			)

		val billy =
			AnPerson(
				name = "Billy",
				age = 66
			)

		val aTuple = (bob, billy)

		show(aTuple)

	/*	val One = 1
		val ten = 10

		def method(input: Any): Any = input match {
			case 2 => 4
			case One => "One Maybe"
			case `ten` => s"It's a $ten"
			case name @ "Alan" => s"Hi $name"
			case _: Boolean => "It's a Boolean" 	
			case _ => input
		}

		*/

		/*show(1)
		show(2)
		show(true)
		show(false)
		show("hi")
		show("Alan")
		show('c')
		show(10)*/
	}
}

final case class AnPerson(name: String, age: Int) {
	def isAdult: Boolean = age >= 18
}