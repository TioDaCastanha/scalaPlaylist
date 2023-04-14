object Video20_2{
	/*def main(args: Array[String]): Unit = {
		println("-"*50)

		code(args)

		println("-"*50)
	}*/

	def code(args: Array[String]): Unit = {
		val f3: (String, Int, Boolean) => Unit =
			(string, int, boolean) => {
				println(int)
			}

		val f1: ((String, Int, Boolean)) => Unit =
			f3.tupled

		val person: Avatar = 
			Avatar("Steve", age = 99, isFemale = false)

		f1(
			Avatar
				.unapply(person) // Option[(String, Int, Boolean)]
				.get // (String, Int, Boolean)
		)			
	}

	def code1(args: Array[String]): Unit = {
		val implicitFile: String = 
			"C:/Users/minho/Documents/Desenvolvimento de Sistemas/SublimeProject/ScalaDev/scalaPlaylist/src/main/scala/Video20_2.scala"

		val explicitFile: File =
			File(
				location  = "C:/Users/minho/Documents/Desenvolvimento de Sistemas/SublimeProject/ScalaDev/scalaPlaylist/src/main/scala",
				name 	  = "Video20_2",
				extension = "scala"
			)

		println(implicitFile)
		println(explicitFile)

		println(implicitFile == explicitFile)

		implicitFile match {
			case File(l, n, e) =>
				println(s"Location:  $l")
				println(s"Name:      $n")
				println(s"Extension: $e")
		}
	}

	def code2(args: Array[String]): Unit = {
		println(Some(369))
		println(None)

		println(Some(null))
		println(Option(null))

		println(Option.empty)
		println(Option.empty[String])
		println(None)
	}

	def code3(args: Array[String]): Unit = {
		val person = Avatar("Bobby", age = 27, isFemale = true)

		println(person.isMale)
		println(person.isFemale)
		println(person)
		println(Avatar)
		println(Avatar.isInstanceOf[Function3[_, _, _, _]])
		println(person == Avatar("Bobby", age = 27, isFemale = true))

		val persons: Set[Avatar] = 
			Set(
				person,
				Avatar("Bill" , age = 27, isFemale = false),
				Avatar("Bryan", age = 29, isFemale = false),
				Avatar("Bob"  , age = 25, isFemale = false),
				Avatar("Bruce", age = 23, isFemale = false)
			)

		println(persons.contains(Avatar("Bobby", age = 27, isFemale = true)))

		println(person.copy(age = 369))

		println()

		println(person.isInstanceOf[Product])
		println(person.productPrefix)
		println(person.productElement(0))
		println(person.productArity)
		println(person.productIterator.mkString(", "))

		println()

		person match {
			case Avatar(n, a, f) => println(a) 
		}

		println(Console.GREEN + "-"*50 + Console.RESET)

		val human = new Human("Billy", age = 33, isFemale = false)
		println(human.isFemale)
		println(human.isMale)
		println(human)
		println(Human)
		println(Human.isInstanceOf[Function3[_, _, _, _]])
		println(human == Human("Billy", age = 33, isFemale = false))

		val humans: Set[Human] = 
			Set(
				human,
				Human("Bill" , age = 27, isFemale = false),
				Human("Bryan", age = 29, isFemale = false),
				Human("Bob"  , age = 25, isFemale = false),
				Human("Bruce", age = 23, isFemale = false)
			)

		println(humans.contains(Human("Billy", age = 33, isFemale = false)))
		
		println(human.copy(age = 369))

		println()

		println(human.isInstanceOf[Product])
		println(human.productPrefix)
		println(human.productElement(0))
		println(human.productArity)
		println(human.productIterator.mkString(", "))

		println()

		human match {
			case Human(n, a, f) => println(a) 
		}
	}
}