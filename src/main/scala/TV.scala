class TV extends Device {
	override val wattsPerSecond: Int = 500

	override protected[this] def actuallyTurnOn(): Unit = {
		println("TV On")
	}

	override protected[this] def actuallyTurnOff(): Unit = {
		println("TV Off")
	}
}