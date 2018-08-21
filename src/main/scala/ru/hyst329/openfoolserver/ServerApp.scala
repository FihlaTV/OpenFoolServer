package ru.hyst329.openfoolserver
import org.eclipse.jetty.webapp.WebAppContext
import org.scalatra.servlet.ScalatraListener
import org.eclipse.jetty.server.{Server => JettyServer}

object ServerApp extends App {
  val port = 7894
  val server = new JettyServer(port)
  val context = new WebAppContext()
  context.setContextPath("/")
  context.setResourceBase("src/main/webapp")
  context.addEventListener(new ScalatraListener)
  context.addServlet(classOf[Server], "/")

  server.setHandler(context)

  server.start
  server.join

}
