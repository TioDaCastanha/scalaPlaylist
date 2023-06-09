import scala.concurrent.duration._
import Constants._

/*object TickUntilEnterIsPressed {
	def main(args: Array[String]): Unit = {
		Clock.TickUntilEnterIsPressed(Interval){
			Terminal.clearCanvas()
			Terminal.goUp(LinesToGoUp)

			TwoDimensionalTime.showCurrent(TimePattern)
		}
	}
}


object Video14Clock{
	def main(args: Array[String]): Unit = {
		Clock.loop(times = FewSeconds) {
			Terminal.clearCanvas()
			Terminal.goUp(LinesToGoUp)

			TwoDimensionalTime.showCurrent(TimePattern)

			Clock.wait(Interval)
		}

		println()
	}
}*/

object Constants {
	val FewSeconds: Int = 20
	val Interval: FiniteDuration = 1.second
	val LinesToGoUp: Int = Int.MaxValue
	val TimePattern: String = "HH:mm:ss"
}
