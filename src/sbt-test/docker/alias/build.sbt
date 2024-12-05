enablePlugins(JavaAppPackaging)

scalaVersion := "2.12.20"

name := "docker-alias-test"

version := "0.1.0"

dockerAlias := DockerAlias(None, None, "docker-alias-test", Option("0.1.0"))
