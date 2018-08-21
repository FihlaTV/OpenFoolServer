package ru.hyst329.openfoolserver
import java.util.{Date, TimeZone}

import org.json4s.{DateFormat, DefaultFormats, Formats}
import org.scalatra.{ScalatraServlet, SessionSupport}
import org.scalatra.atmosphere._
import org.scalatra.json.JacksonJsonSupport

import scala.concurrent.ExecutionContext.Implicits.global

class Server extends ScalatraServlet with SessionSupport with JacksonJsonSupport with AtmosphereSupport {
  implicit override protected def jsonFormats: Formats = DefaultFormats

  atmosphere("/tables") {
    new AtmosphereClient {
      override def receive: AtmoReceive = {
        case Connected                               =>
        case Disconnected(disconnector, Some(error)) =>
        case Error(Some(error))                      =>
        case TextMessage(text)                       => send("ECHO: " + text)
        case JsonMessage(json)                       => broadcast(json)
      }
    }
  }
}
