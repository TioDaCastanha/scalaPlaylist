object StringWithLength {
	def apply(string: String): StringWithLength = new StringWithLength(string)
}


final case class StringWithLength(string: String) {
	val length: Int = string.length

	def +(that: StringWithLength): StringWithLength = 
		StringWithLength(
			this.string + that.string
		)
}

final case class Person(
	name: String,
	age: Int,
	phone: String,
	email: String
)

object Video14{
	/*def main(args: Array[String]): Unit = {
		println("-"*50)
		
		code(args)
		
		println("-"*50)
	}*/

	def code(args: Array[String]): Unit = {
		
		val bob = 
			Person(
				name = "Bob",
				age = 20,
				phone = "+1-225-324-2020",
				email = "bob@bobme.com"
		)

		println(bob)
		println(bob.name)
		println(bob.age)
		println(bob.phone)
		println(bob.email)


		// val tuple2 = new Tuple2(1337, "one three three seven") //

		// println(tuple2._1)
		// println(tuple2._2)

		// val tuple3 = (369, "three six nine", 'A')
		// println(tuple3)

		/*type StringToInt = (String, Int)
		def addTuples(first: StringToInt, second: StringToInt): StringToInt = (
			first._1 + second._1,
			first._2 + second._2
		)

		def stringWithLength(in: String): StringToInt = in -> in.length

		val result: StringToInt = 
			addTuples(
				first = stringWithLength("Hello "),
				second = stringWithLength("Scala")
			)*/
		
		// val result: StringWithLength = 
		// 	StringWithLength("Hello ") + StringWithLength("Scala") 

		// println()
		// println(result)
		// println(result.string)
		// println(result.length)


	}
}