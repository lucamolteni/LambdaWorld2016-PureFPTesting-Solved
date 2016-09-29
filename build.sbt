javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")


lazy val root = (project in file(".")).settings(
  name := "LambdaWorld2016-Solved",
  version := "1.0",
  scalaVersion := "2.11.8"
)

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.8.4" % "test",
  "org.specs2" %% "specs2-mock" % "3.8.4" % "test",
  "org.scalacheck" %% "scalacheck" % "1.13.2" % "test"
)

scalacOptions in Test ++= Seq("-Yrangepos")
