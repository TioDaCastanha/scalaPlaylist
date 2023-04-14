object Helpers{
	def showRed(string: String): Unit = {
		styled(string, Console.RED)
	}

	def showBlue(string: String): Unit = {
		styled(string, Console.CYAN)
	}

	def showGreen(string: String): Unit = {
		styled(string, Console.GREEN)
	}

	def showMagenta(string: String): Unit = {
		styled(string, Console.MAGENTA)
	}


	private def styled(string: String, color: String): Unit = {
		println(color + string + Console.RESET)
	}
}