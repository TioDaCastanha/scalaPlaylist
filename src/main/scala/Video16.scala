object Video16{
	def main(args: Array[String]): Unit = {
		println("-"*50)

		code(args)

		println("-"*50)
	}

	def code(args: Array[String]): Unit = {
		val bulb = new LightBulb
		val tv = new TV
		val meter = new EnergyMeter(bulb)

		meter.startMeasuring()
		Thread.sleep(1000)
		meter.stopMeasuring()
		println(meter.wattsConsumedInTotal)

		println()

		meter.startMeasuring()
		Thread.sleep(1000)
		meter.stopMeasuring()
		println(meter.wattsConsumedInTotal)
	}
}