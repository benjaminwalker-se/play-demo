name := """example-app"""

version := "1.1-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

enablePlugins(DebianPlugin)
maintainer := "Benjamin Walker benjamin.walker@appdynamics.com"
packageSummary := "My custom package"
packageDescription := "Package"
