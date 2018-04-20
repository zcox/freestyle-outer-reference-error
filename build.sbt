scalaVersion := "2.12.4"

addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M10" cross CrossVersion.full)

libraryDependencies += "io.frees" %% "frees-core" % "0.8.0"

scalacOptions ++= Seq("-feature", "-unchecked", "-language:higherKinds", "-Xfatal-warnings")
