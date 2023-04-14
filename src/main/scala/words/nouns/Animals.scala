package words
package nouns

object Animals{
	val dog = "Dog"

	def demonstrate(): Unit = {
		println(s"A ${Animals.dog} is travelling on a ${Transports.car}")
	}
}