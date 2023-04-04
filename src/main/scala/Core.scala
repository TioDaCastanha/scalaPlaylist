object Core {
	class OrdinaryCar(override val model: String)
		extends Base.Car {
			println("OrdinaryCar")

			override def topSpeedInKmPerHour: Int = {
				println("OrdinaryCar.topSpeedInKmPerHour")
				
				220
			}
			override def topAccelerationInRpm: Int = 8000
		}

	class SportsCar(override val model: String)
		extends Base.Car {
			println("SportsCar")

			override def topSpeedInKmPerHour: Int = 300
			override def topAccelerationInRpm: Int = 11000
		}
}

