ThisBuild / scalaVersion := "2.13.10"

ThisBuild / version      := "0.1.0-SNAPSHOT"

ThisBuild / watchTriggeredMessage := Watch.clearScreenOnTrigger

ThisBuild / reColors := Revolver.noColors

ThisBuild / scalacOptions ++= Seq(
	"-deprecation"
)