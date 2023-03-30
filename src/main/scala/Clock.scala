import java.util._
import scala.concurrent.duration._

object Clock {
	def TickUntilEnterIsPressed(interval: FiniteDuration)(someCode: => Unit): Unit = {
		val timer: Timer = new Timer

		val delayInMilliseconds: Long = 0
		val periodInMilliseconds: Long = interval.toMillis

		val timerTask: TimerTask = new TimerTask {
			def run(): Unit = {
				someCode
			}
		}

		timer.scheduleAtFixedRate(
			timerTask,
			delayInMilliseconds,
			periodInMilliseconds
		)

		io.StdIn.readLine //block current Thread until ENTER is pressed
		timer.cancel()
	}

	def loop(times: Int)(someCode: => Unit): Unit = {
		1 to times foreach { _ =>
			someCode
		}
	}

	def wait(delay: FiniteDuration): Unit = {
		Thread.sleep(delay.toMillis)
	}
}