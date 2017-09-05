enablePlugins(ScalaJSPlugin)
enablePlugins(ScalaJSBundlerPlugin)

organization := "ru.lmars"
scalaVersion := "2.11.8"

scalacOptions += "-P:scalajs:sjsDefinedByDefault"
scalaJSUseMainModuleInitializer := true