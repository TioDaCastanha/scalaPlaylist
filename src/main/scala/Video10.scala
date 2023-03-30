object Video10 /*extends App*/{
	println("-"*50)

	{
		// def isEven(x: Int): Boolean = 
		// x % 2 == 0

		// def isOdd(x: Int): Boolean =
		// !isEven(x)

		// 1 to 10 foreach println

		// 1 to 10 foreach { i =>
		// println(isEven(i))
		// }

		// 'a' to 'z' foreach println

		// println('A')
		// println('A' + 1: Char)
		// println(66: Char)
		
		// val secInAMinute = 60

		// 0 to 120 foreach { i =>
		// 	println(i % secInAMinute) //Modulus
		// }

		// println(1 min 4)
		// println(5 min 2)

		// println(1 max 5)
		// println(6 max 2)

		// println(
		// 	"Color %s, number1 %d, number2 %05d, hex %#x, float %5.2f."
		// 	.format("red", 123456, 89, 255, 3.14159)
		// )

		// println(
		// 	f"Color ${"red"}%s, number1 ${123456}%d, number2 ${89}%05d, hex ${255}%#x, float ${3.14159}%5.2f."
		// )

		// val x = scala.io.StdIn.readLine("Favorite Number: ")
		// println(x)
		// println(x + 10)
		// println(x.toInt + 10)
	}

	{
		def f: Int => Int = _ + 5
		def g: Int => Int = _ / 2
		def h: Int => Int = i => f(i) / 2

		// println(f(15))
		// println(g(20))
		// println(h(15))

		def rightThenLeft(left: Int => Int, right: Int => Int): Int => Int =
			input => left(right(input))

		val gThenF = rightThenLeft(f, g)
		println(gThenF(20))
		
		println(rightThenLeft(g, f)(15))

		println((f compose g)(20))

		val fThemG = g compose f
		println(fThemG(15))

		println((g andThen f)(20))

		println((f andThen g)(15))

		val a: Int => Int = _ + 5
		val b: Int => Int = a

		println(a == b)
		println(a equals b)
		println(a eq b) // compara referências
		println(a ne b)


	}

	println("-"*50)
}