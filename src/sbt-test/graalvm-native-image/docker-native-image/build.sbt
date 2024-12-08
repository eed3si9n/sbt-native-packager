enablePlugins(GraalVMNativeImagePlugin)

scalaVersion := "2.12.20"

name := "docker-test"
version := "0.1.0"
graalVMNativeImageGraalVersion := Some("22.3.3")
