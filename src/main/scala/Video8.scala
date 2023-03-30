object Video8 /*extends App*/ {
	println("-"*50)

	{
		//val a: Byte = 127
		//val a: Byte = 0x7F // 127
		//val a = 0x80 // 128
	
		//val b: Long = 9223372036854775807L
	
		//val c: Char = 'A'
		//val c: Char = 65
		//val c: Char = 0x41 //65
		//val c: Char = '\u0041'//65 

		//val d: Double = 0.5

		//println(d)
		//println(0.5e0)
		//println(0.05e1)
		//println(0.005e2)
		//println(5e-1)
		//println(50e-2)
		//println(0.5e2) // e2 = 10*2

		//val f: String = """Hello 
		//  world"""

		//val f: String = 
		// 	"""#Hello
		// 	   #Scala""".stripMargin('#')

		//val f: String = 
		// 	"""|Hello
		// 	   |Scala""".stripMargin

		//val g: Symbol = 'Hi

		//val h: Char = '\n'	   
	
	
		// println("Hello\t\tWorld") //Tab in print
		// println("Hello\bWorld") //Backspace
		// println("Hello\rScala") //Sobrescrever mas sem mudar o tamanho da String original
		// println("Hello \"Scala\"") //Aspas Duplas
		// println("Hello \\Scala") //Backslash
		// println{
		// 	"""|Hello\n\t\r""\"      
		// 	   |Scala""".stripMargin //Strip Margin ignora os comandos acima
		// }
	
		// val i: Int => Int = x => x + 1 // x => x + 1 é o Literal de uma função
		//val i: Int => Int = _ + 1
		//val i: (Int, Int) => Boolean = (left, right) => left == right
		//val i: (Int, Int) => Boolean = _ == _
	   	
	    //println(i(10, 10))
    	//println(i(10, 11))
	}

	{
		def now: String = {
			val formatter =
				java.time.format
					.DateTimeFormatter
					.ofPattern("HH:mm:ss")

			java.time
				.LocalDateTime
				.now
				.format(formatter)
		}

		def inOneLine(in: String): String = {
			val clearLine = "\u001b[2K"
			val carriageReturn = "\r"
			clearLine + carriageReturn + in
		}

		// var i = 0
		// while(i < 5) {
		// 	Thread.sleep(1 * 1000)
		//     println(inOneLine(now))

		//     i += 1
		// }

		def timeByTime(n: Int): Unit = {
			if (n < 5) {
				Thread.sleep(1 * 1000)
				print(inOneLine(now))
				timeByTime(n + 1)
			}
		}

		timeByTime(0)
		println()
	}

	println("-"*50)
}