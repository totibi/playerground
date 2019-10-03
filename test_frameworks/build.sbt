scalaVersion := "2.12.8"
name := "test_frameworks"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.8"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"
resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"
logBuffered in Test := false
