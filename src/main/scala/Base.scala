object Base {
	abstract class Car {
		println("Car")

		def model: String
		def topSpeedInKmPerHour: Int
		def topAccelerationInRpm: Int
		def brand: String = ""

		override def toString: String = {
			//val brand = getClass.getName
			brand + " " + model + " " + topSpeedInKmPerHour + " " + topAccelerationInRpm
		} 
	}
}