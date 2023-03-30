object Video7 /*extends App*/{
	println("-"*50) 

	def method1: String = {
		var iteration = 1
		@scala.annotation.tailrec
		def loop: String = {
			if(iteration % 5 != 0){
				println(iteration)

				iteration += 1

				loop
			}
			else
				"Done"
		}

		loop	
	}

	def method2: String = {
		@scala.annotation.tailrec
		def loop(iteration: Int): String = {
			if(iteration % 5 != 0){
				println(iteration)

				loop(iteration + 1)
			}
			else
				"Done."
		}

		loop(1)	
	}

	println(method2)
	

	println("-"*50)
}