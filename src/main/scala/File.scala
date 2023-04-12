object File {
	/*def apply(location: String, name: String, extension: String): String =
		s"$location/$name.$extension"
*/
	def unapply(path: String): Option[(String, String, String)] = 
		if(path == null || path.isEmpty)
			None
		else {
			val lastIndexOfSlash = path.lastIndexOf("/")
			val lastIndexOfDot 	 = path.lastIndexOf(".")

			val location  = path.substring(0, lastIndexOfSlash) // Until the last slash
			val name	  = path.substring(lastIndexOfSlash + 1, lastIndexOfDot)	 // between the last slash and the last dot
			val extension = path.substring(lastIndexOfDot + 1) //after the last dot

			Some(
				 (
				 	location,
				 	name,
				 	extension
				 )
			)
		}
}

case class File(
	location: String,
	name: String,
	extension: String
) {
	override def toString: String =
		s"$location/$name.$extension"
}