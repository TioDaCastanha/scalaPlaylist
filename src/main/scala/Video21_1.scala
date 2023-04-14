import Helpers._

object Video21_2{
/*	def main(args: Array[String]): Unit = {
		println("-"*50)

		code(args)

		println("-"*50)
	}*/

	def code(args: Array[String]): Unit = {
		val file =
			new File2(
				location = ".../src/main/scala/",
				name = "Video21_1",
				extension = ".scala",
				content = "Hello Scala!"
			)

		file.write()	
	}
}