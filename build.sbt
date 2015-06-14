name := "SprayClient"

version := "1.0"

scalaVersion := "2.11.6"


resolvers += "spray repo" at "http://repo.spray.io"


libraryDependencies ++= {
  val sprayVersion = "1.3.3"
  val akkaVersion = "2.3.11"
  val sprayJsonVersion = "1.3.2"
  Seq(
    "io.spray" %% "spray-json"   % sprayJsonVersion,
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "io.spray" %%  "spray-client" % sprayVersion,
    "ch.qos.logback" % "logback-classic" % "1.0.7"
  )
}

