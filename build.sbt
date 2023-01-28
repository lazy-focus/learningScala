ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "learningScala"
  )

// https://mvnrepository.com/artifact/org.apache.poi/poi
libraryDependencies += "org.apache.poi" % "poi" % "5.2.3"
