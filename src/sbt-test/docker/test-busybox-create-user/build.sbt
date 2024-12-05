enablePlugins(JavaAppPackaging)

scalaVersion := "2.12.20"

name := "test-busybox-create-user"

version := "0.1.0"

maintainer := "Boris Capitanu <borice@hotmail.com>"
dockerBaseImage := "anapsix/alpine-java:8"
Docker / daemonUserUid := Some("2000")
Docker / daemonUser := "appuser"
Docker / daemonGroupGid := Some("3000")
Docker / daemonGroup := "appgroup"
