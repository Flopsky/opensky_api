val scala3Version = "3.2.2"
val http4sVersion = "0.23.18"

lazy val root = project
  .in(file("."))
  .settings(
    name := "OpenSkyApi",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
  libraryDependencies ++= Seq(
  "com.lihaoyi" %% "requests" % "0.8.0",
  "org.scalameta" %% "munit" % "0.7.29" % Test
  )

  )
