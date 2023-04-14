import words._

object Video22{
	def main(args: Array[String]): Unit = {
		println("-"*50)

		code(args)

		println("-"*50)
	}

	def code(args: Array[String]): Unit = {
		println(nouns.Animals.dog)
		println(verbs.Actions.eating)

		nouns.Animals.demonstrate()
	}
}