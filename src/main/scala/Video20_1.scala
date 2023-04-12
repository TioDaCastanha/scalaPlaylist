object Video20_1{
	/*def main(args: Array[String]): Unit = {
		println("-"*50)

		code(args)

		println("-"*50)
	}*/

	def code(args: Array[String]): Unit = {
		// val tuple: Tuple3[String, Int, Boolean] = 
		// 	new Tuple3[String, Int, Boolean]("Favorite Number", 369, true)
		// val tuple = new Tuple3("Favorite Number", 369, true)
		// val tuple = Tuple3("Favorite Number", 369, true)
		val tuple = new T3("Favorite Number", 369, true)

		println(tuple._2)
		println(tuple.productArity)
		println(tuple.productElement(1))

		val iterator: Iterator[Any] = tuple.productIterator

		println()

		iterator foreach println

		// tuple match {
			// case t => println(tuple._2)
			// case Tuple3(_, number, _) => println(number)
			// case (_, number, _) => println(number)	
		// }
	}
}


// Tuples Are
// immutable heterogeneous sequences of fixed length
// 1) immutable means that they can't be changed (also applied to types)
// 2) heterogeneuous means that every element may have a different type
// 3) sequence means that there is an order
// 4) fixed length means 3 and it also can't be changed

// trait Equals extends Any
// trait Product extends Equals
// trait Product3[+T1, +T2, +T3] extends Product
// final case class Tuple3[+T1, +T2, +T3] extends Product[+T1, +T2, +T3]

class T3(
	override val _1: String,
	override val _2: Int,
	override val _3: Boolean
) extends P3

trait P3 extends Product{
   	// Members declared in scala.Equals
   	def canEqual(that: Any): Boolean =
		that.isInstanceOf[P3]

   	// Members declared in scala.Product
   	def productArity: Int = 3
   	def productElement(n: Int): Any = n match {
   		case 0 => _1
   		case 1 => _2
   		case 2 => _3
   		case _ => throw new IndexOutOfBoundsException(n.toString) 
   	}

   	def _1: String
   	def _2: Int
   	def _3: Boolean
}