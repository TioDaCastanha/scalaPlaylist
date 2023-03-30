object FarAway{
	def code = {
		println("Now this is a subroutine")

		(isHappy: Boolean, isMad: Boolean) =>
		if(isHappy)
			"I'm Happy"
		else if (isMad)
			"I'm Mad"
		else 
			"Forget It..."
	}	
}