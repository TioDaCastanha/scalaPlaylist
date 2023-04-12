final case class Avatar(name: String, age: Int, isFemale: Boolean) {
	def isMale: Boolean = !isFemale
}