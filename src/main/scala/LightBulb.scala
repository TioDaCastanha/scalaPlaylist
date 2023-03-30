class LightBulb extends Device {
	override val wattsPerSecond: Int = 100

	override protected[this] def actuallyTurnOn(): Unit = {
		println("Light Bulb On")
	}

	override protected[this] def actuallyTurnOff(): Unit = {
		println("Light Bulb Off")
	}
}