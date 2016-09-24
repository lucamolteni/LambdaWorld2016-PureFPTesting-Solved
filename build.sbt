lazy val root = (project in file(".")).
  settings(
    name := "hello",
    version := "1.0",
    scalaVersion := "2.11.8"
  )

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.8.4" % "test")

scalacOptions in Test ++= Seq("-Yrangepos")
