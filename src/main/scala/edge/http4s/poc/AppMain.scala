package edge.http4s.poc

import com.codahale.metrics.MetricRegistry
import org.http4s.server.ServerApp
import org.http4s.server.jetty.JettyBuilder

object AppMain extends ServerApp {
	val metrics = new MetricRegistry

	def server(args: List[String]) =
		JettyBuilder
			.bindHttp(8080)
			.withMetricRegistry(metrics)
			.mountService(SimpleService(), "/")
			// .mountServlet(new MetricsServlet(metrics), "/metrics/*") // TODO needs additional dependency?
			.start
}