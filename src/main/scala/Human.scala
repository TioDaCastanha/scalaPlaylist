final class Human (
	val name: String,
	val age: Int,
	val isFemale: Boolean	
) extends Product with Serializable {
	def isMale: Boolean = !isFemale

	def copy(
		name: String = this.name,
		age: Int = this.age,
		isFemale: Boolean = this.isFemale
	): Human = Human(name, age, isFemale)

	override def toString: String = 
		s"$productPrefix($name, $age, $isFemale)"

	override def equals(other: Any): Boolean = other match {
		case that: Human if that canEqual this =>
			this.name 	  == that.name 	&&  
			this.age 	  == that.age 	&&
			this.isFemale == that.isFemale
		case _ => false
	}

	override def hashCode: Int =
		41 * (
			41 * (
		 		41 + name.hashCode
		 	) + age.hashCode
		) + isFemale.hashCode

	// Members declared in scala.Equals
	override def canEqual(that: Any): Boolean = 
		that.isInstanceOf[Human]

	// Members declared in scala.Product
	override def productArity: Int = 3
	override def productElement(n: Int): Any = n match {
		case 0 => name
		case 1 => age
		case 2 => isFemale
		case _ => throw new IndexOutOfBoundsException(n.toString)
	}

	override def productPrefix: String =
		Human.toString


}

object Human extends ((String, Int, Boolean) => Human) {
	override def apply(
		name: String,
		age: Int,
		isFemale: Boolean
	): Human = new Human(name, age, isFemale) 

	override def toString: String = 
		"Human"

	type Answer[+A] = {
		def get: A
		def isEmpty: Boolean
	}

	def unapply(human: Human): Option[(String, Int, Boolean)] =
		if(human == null)
			None
		else 
			Some(
					(
					 human.name,
					 human.age,
					 human.isMale
					)
			)
}		