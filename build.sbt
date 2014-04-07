organization := "pl.japila"

scalaVersion in Global := "2.11.0-RC3"

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
 
libraryDependencies += "org.scalaz.stream" % "scalaz-stream_2.10" % "snapshot-0.4"
 
initialCommands in console := """
import scalaz.stream._
import scala.concurrent.duration._
val P = Process
"""