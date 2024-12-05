enablePlugins(JavaAppPackaging)

scalaVersion := "2.12.20"

name := "docker-test"

version := "0.1.0"

maintainer := "Gary Coady <gary@lyranthe.org>"

dockerAliases ++= Seq(dockerAlias.value.withTag(Option("0.1")))

dockerUpdateLatest := true
