object Video19 {
/*	def method(input: Any): Any = input match {
		case variable => s"Any: $variable" 
	}

	def method(input: Int): Any = input match {
		case variable => s"Int: $variable"
	}*/

	def code(args: Array[String]): Unit = {
		def method(input: Any): Any = input match {
			// case Seq() => "empty"
			// case Seq(last) => last
			// case Seq(secondToLast, last) => last
			// case Seq(1, 2, 3) => "matched"
			// case Seq(first, _*) => "at least 1"
			// case Seq(first, second, _*) => "at least 2"
			// case Seq(first, secont, others @ _*) => others
			case wrapper: MyFavoriteStrings => wrapper.strings	

		}

		def show(input: Any): Unit = {
			println(method(input))
		}

		show(MyFavoriteStrings(Seq("1", "2")))

		/*println(Set(1,2,3))
		println(Set(3,2,1))
		println(Set(1,2,2,2,3,2)) //No Duplicates

		println()

		println(Set(1,2,3) == Set(3,2,1))
		println(Set(1,2,3) == Set(2,2,1,3,3))

		println()

		println(Set[Int]())
		println(Set.empty[Int])

		println()

		println(Set[Int]() == Set.empty[Int])

		println("-"*50)

		println(Seq(1,2,3))
		println(Seq(3,2,1))
		println(Seq(1,2,2,2,3,2))

		println()

		println(Seq(1,2,3) == Seq(3,2,1))
		println(Seq(1,2,3) == Seq(2,2,1,3,3))

		println()

		println(Seq[Int]())
		println(Seq.empty[Int])

		println()

		println(Seq[Int]() == Seq.empty[Int])*/
	
		/*def method(input: Any): Any = input match {
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

		show(aTuple)*/

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

final case class MyFavoriteStrings(strings: Seq[String]) extends AnyVal