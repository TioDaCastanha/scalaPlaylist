object TwoDimensionalDigit {
	val Zero: TwoDimensionalString =
		TwoDimensionalString(
			top		= " _ ",
			middle	= "| |",
			bottom	= "|_|"
		)

	val One: TwoDimensionalString =
		TwoDimensionalString(
			top		= "   ",
			middle	= "  |",
			bottom	= "  |"
		)

	val Two: TwoDimensionalString =
		TwoDimensionalString(
			top		= " _ ",
			middle	= " _|",
			bottom	= "|_ "
		)

	val Three: TwoDimensionalString =
		TwoDimensionalString(
			top		= " _ ",
			middle	= " _|",
			bottom	= " _|"
		)

	val Four: TwoDimensionalString =
		TwoDimensionalString(
			top		= "   ",
			middle	= "|_|",
			bottom	= "  |"
		)

	val Five: TwoDimensionalString =
		TwoDimensionalString(
			top		= " _ ",
			middle	= "|_ ",
			bottom	= " _|"
		)

	val Six: TwoDimensionalString =
		TwoDimensionalString(
			top		= " _ ",
			middle	= "|_ ",
			bottom	= "|_|"
		)

	val Seven: TwoDimensionalString =
		TwoDimensionalString(
			top		= " _ ",
			middle	= "  |",
			bottom	= "  |"
		)

	val Eight: TwoDimensionalString =
		TwoDimensionalString(
			top		= " _ ",
			middle	= "|_|",
			bottom	= "|_|"
		)

	val Nine: TwoDimensionalString =
		TwoDimensionalString(
			top		= " _ ",
			middle	= "|_|",
			bottom	= " _|"
		)

	def apply(digit: Int): TwoDimensionalString = digit match {
		case 0 => Zero
		case 1 => One
		case 2 => Two
		case 3 => Three
		case 4 => Four
		case 5 => Five
		case 6 => Six
		case 7 => Seven
		case 8 => Eight
		case 9 => Nine
		case _ => TwoDimensionalString.QuestionMarks
	}


}