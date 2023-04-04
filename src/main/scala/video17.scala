object Video17{
/*	def main(args: Array[String]): Unit = {
		println("-"*50)

		code(args)

		println("-"*50)
	}*/

	def code(args: Array[String]): Unit = {
		class Animal

		trait Pet {
			def allowedToSleepInBed: Boolean
			def disallowedToSleepInBed: Boolean = !allowedToSleepInBed
		}

		class Cat extends Animal with Pet {
			val allowedToSleepInBed: Boolean = true
		}

		class Turtle extends Animal with Pet {
			def allowedToSleepInBed: Boolean = false
		}

		def show(pet: Pet): Unit ={
			println(pet.disallowedToSleepInBed)
		}

		// show(new Cat)
		// show(new Turtle)

		// val file = new java.io.File(path)

		// println(file.getName)

		trait Timestamp {
			val creationTime: String = {
				val formatter =
					java.time.format
						.DateTimeFormatter
						.ofPattern("HH:mm:ss")

				java.time
					.LocalDateTime
					.now
					.format(formatter)
			}
		}

		// class FileWithTimestamp(path: String) extends java.io.File(path) with Timestamp

		val path = 
			"C:/Users/minho/Documents/Desenvolvimento de Sistemas/SublimeProject/ScalaDev/scalaPlaylist/src/main/scala/video17.scala"

		// val file = new FileWithTimestamp(path)
		type TooLazyToType = java.io.File with Timestamp
		val file: TooLazyToType = new java.io.File(path) with Timestamp

		def showName(file: TooLazyToType): Unit = {
			println(file.getName)
		}

		def showCreationTime(timestamp: Timestamp): Unit = {
			println(timestamp.creationTime)
		}

		showName(file)
		showCreationTime(file)

	}
}
