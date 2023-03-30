object Video7_1 /*extends App*/ {
	println("-"*50)

	
	def factorial(n: Int): Int = {
		if (n == 0)
			1
		else
			n * factorial(n - 1)
	}

	println("5 => "+ factorial(5))

	println("-"*50)
}