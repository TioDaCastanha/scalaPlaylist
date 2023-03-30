object Video15{
	/*def main(args: Array[String]): Unit = {
		println("-"*50)

		code(args)

		println("-"*50)
	}*/
	
	def code(args: Array[String]): Unit = {
		/*final case class Device(
			wattsPerSecond: Int,
			turnOn: () => Unit,
			turnOff: () => Unit
		)*/

		class EnergyMeter(device: Device) {
			private[this] var turnedOnAtMillis: Long = 0
			private[this] var _wattsConsumedInTotal: Double = 0
			def wattsConsumedInTotal: Double = _wattsConsumedInTotal

			def startMeasuring(): Unit = {
				device.turnOn()

				turnedOnAtMillis = System.currentTimeMillis 
			}

			def stopMeasuring(): Unit = {
				device.turnOff()

				val durationInMillis = System.currentTimeMillis - turnedOnAtMillis
				val durationInSeconds = durationInMillis.toDouble / 1000

				_wattsConsumedInTotal += device.wattsPerSecond * durationInSeconds
			}
		}

		/*object EnergyMeter{
			def apply(device: Any): EnergyMeter = device match {
				case lightBulb: LightBulb => {
					new EnergyMeter(
						wattsPerSecond 	= lightBulb.wattsPerSecond,
						turnDeviceOn 	= () => lightBulb.turnOn(),
						turnDeviceOff	= () => lightBulb.turnOff()
					)
				}

				case tv: TV => {
					new EnergyMeter(
						wattsPerSecond 	= tv.wattsPerSecond,
						turnDeviceOn 	= () => tv.turnOn(),
						turnDeviceOff	= () => tv.turnOff()
					)
				}

				case _ => sys.error("not a device")

			}
		}	*/

		class Device {
			def wattsPerSecond: Int = {
				sys.error("please assign a value first!")
			}

			def turnOn(): Unit = {
				sys.error("please assign a value first!")
			}

			def turnOff(): Unit = {
				sys.error("please assign a value first!")
			}
		}


		// something Like a TV
		class TV extends Device{
			/*def toDevice: Device =
				Device(
					wattsPerSecond 	= this.wattsPerSecond,
					turnOn 			= () => this.turnOn(),
					turnOff			= () => this.turnOff()	
				)*/

			override val wattsPerSecond: Int = 500

			override def turnOn(): Unit = {
				println("TV on")
			}

			override def turnOff(): Unit = {
				println("TV off")
			}	
		}

		// something Like a Light Bulb
		class LightBulb extends Device{
			/*def toDevice: Device =
				Device(
					wattsPerSecond 	= this.wattsPerSecond,
					turnOn 			= () => this.turnOn(),
					turnOff			= () => this.turnOff()	
				)*/

			override val wattsPerSecond: Int = 100

			override def turnOn(): Unit = {
				println("LightBulb on")
			}

			override def turnOff(): Unit = {
				println("LightBulb off")
			}	
		}

		val lightBulb: LightBulb = new LightBulb
		val tv: TV = new TV

		val energyMeter = new EnergyMeter(tv)

		/*val energyMeter = new EnergyMeter(
			wattsPerSecond 	= lightBulb.wattsPerSecond,
			turnDeviceOn 	= () => lightBulb.turnOn(),
			turnDeviceOff	= () => lightBulb.turnOff()
		)*/

		energyMeter.startMeasuring()
		Thread.sleep(1000)
		energyMeter.stopMeasuring()
		println(energyMeter.wattsConsumedInTotal)

		println()

		energyMeter.startMeasuring()
		Thread.sleep(1000)
		energyMeter.stopMeasuring()
		println(energyMeter.wattsConsumedInTotal)




		/*def f(g: Int => String, h: String => String, i: String => Char): Unit = {
			val resultOfG: String = g(369)
			val resultOfH: String = h(resultOfG)
			val resultOfI: Char = i(resultOfH)
			
			println(resultOfI)
		}*/


		/*def g(number: Int): String = {
			number.toString.reverse
		}

		def h(string: String): String = {
			string
		}

		def i(string: String): Char = {
			if(string.nonEmpty)
				string(0) // the first Character
			else
				'?'
		}*/

		//f(g, h, i)
		
		/*class EnergyMeter(g: Int => String, h: String => String, i: String => Char) {
			def doStuff(): Unit = {
				val resultOfG: String = g(369)
				val resultOfH: String = h(resultOfG)
				val resultOfI: Char = i(resultOfH)
				
				println(resultOfI)
			}	
		}

		val energyMeter = new EnergyMeter(g, h, i)
		energyMeter.doStuff()*/
	}
}