package edge.http4s.poc

import org.http4s.HttpService

import org.http4s.dsl._

/**
 * @author medge
 */
object SimpleService {

	def apply() = HttpService {
		case GET -> Root =>
			Ok("Hello")
	}

}
