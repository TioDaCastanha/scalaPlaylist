trait Device {
	def wattsPerSecond: Int

	private[this] var _isOn: Boolean = false
	
	// is On methods
	def isOn: Boolean = _isOn
	protected[this] def isOn_=(newValue: Boolean): Unit = {
		_isOn = newValue
	}

	// is Off methods
	def isOff: Boolean = !isOn
	protected[this] def isOff_=(newValue: Boolean): Unit = {
		_isOn = !newValue
	}

	// Turn on methods
	final def turnOn(): Unit = {
		if (isOff){
			isOn = true

			actuallyTurnOn()
		}
		else 
			sys.error("Already ON")
	}

	protected[this] def actuallyTurnOn(): Unit

	// Turn of methods
	final def turnOff(): Unit = {
		if (isOn) {
			isOff = true

			actuallyTurnOff()
		}
		else 
			sys.error("Already OFF")
	}

	protected[this] def actuallyTurnOff(): Unit
}

// private[this] 	=> only current instance
// private		 	=> any instance of current class
// protected[this]	=> only current instance and the sub class instance
// protected		=> any instance of the current class and any instance of any sub class


// Inheritance Keywords

// final			=> on a class means that it can't be extended
// final			=> on a trait is not allowed
// final			=> on any member means can't be overriden
// no keywords		=> on a class, can be extended
// no keywords		=> on a trait, can be extended or mixed in
// no keywords		=> on any member, means can be overriden
// abstract			=> on a class means can't be instantiated
// abstract			=> on any member is not allowed
// no keywords - = {} => must be overriden


// Combinations

// Not Allowed

// final abstract
// final trait
// private abstract def or val

// Order

// final override protected[this] def
