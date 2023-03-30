object Main {
	//def main(args: Array[String]): Unit = {
		println("-"*50)

		def theFunValue = {
			println("This is a fun Value")

			69
		}

		lazy val theMeaningOfLife = {
			println("The Meaning of Life Is...")

			42
		}

		println(s"The first time: $theMeaningOfLife")
		println(s"Now for the last one: $theMeaningOfLife")

		println("-"*50)
		
		println(s"Laught for the first time: $theFunValue")
		println(s"Laught for the second time: $theFunValue")		

		println("-"*50)
	//}
}