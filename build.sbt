name := "OpenFoolServer"

version := "0.0.1"

scalaVersion := "2.12.6"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.6"
libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.6"
libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.6.0"
libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.6.3",
  "org.scalatra" %% "scalatra-atmosphere" % "2.6.3",
  "org.atmosphere" % "atmosphere-runtime" % "2.4.30"
)
libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-plus" % "9.4.12.RC2",
  "org.eclipse.jetty" % "jetty-webapp" % "9.4.12.RC2",
  "org.eclipse.jetty.websocket" % "websocket-server" % "9.4.12.RC2"
)
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
