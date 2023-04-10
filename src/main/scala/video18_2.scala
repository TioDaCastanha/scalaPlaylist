object video18_2 {
	/*def main(args: Array[String]): Unit = {
		println("-"*50)

		code(args)

		println("-"*50)
	}*/

	def code(args: Array[String]): Unit = {
		type ~>[-Input, +Output] =
			PartialFunction[Input, Output]

		def toRomanNumeral(number: Int): String = {
			val partialFunction: Int ~> String = {
				case 0 => "0: N"
				case 1 => "1: I"
				case 2 => "2: II"
				case 3 => "3: III"
				case 4 => "4: IV"
				case 5 => "5: V"
				case 6 => "6: VI"
				case 7 => "7: VII"
				case 8 => "8: VIII"
				case 9 => "9: IX"
			}

			partialFunction(number)
		}


		val onlyEvenDigits: Int ~> String ={
			case 0 => "0: N"
			case 2 => "2: II"
			case 4 => "4: IV"
			case 6 => "6: VI"
			case 8 => "8: VIII"
		}

		val onlyOddDigits: Int ~> String ={
			case 1 => "1: I"
			case 3 => "3: III"
            case 5 => "5: V"
			case 7 => "7: VII"
			case 9 => "9: IX"
		}

		def toRomanNumeralOrElse(number: Int): String = {
			val partialFunction: Int ~> String = 
				onlyEvenDigits orElse onlyOddDigits

			partialFunction(number)
		}

		0 to 9 map toRomanNumeralOrElse foreach println

	}
}