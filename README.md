# scalajs-bundler::fastOptJS sourcemap bug reproduction
1. run `sbt clean fastOptJS` first time
2. check generated source map file `./target/scala-2.11/scalajs-bundler/main/scalajs-bundler-wrongsourcemap-fastopt.js.map`, there is such path to source file:
```
"../../../src/main/scala/ru/lmars/bundler/Application.scala"
```
3. run `sbt clean fastOptJS` second, third... etc. time
4. path to source file will be different:
```
"../../../../src/main/scala/ru/lmars/bundler/Application.scala"
```
and this is right path!
# Realtive Vs Absolute
I don't know why, but scalajs-bundler version of fastOptJS generates relative paths to source files in sourcemap file, original scalajs version of fastOptJS generates absolute paths like this:
```
"file:///C:/somedir/somedir2/scalajs-bundler-wrongsourcemap/src/main/scala/ru/lmars/bundler/Application.scala"
```
(you can check this by remove `enablePlugins(ScalaJSBundlerPlugin)` line from `build.sbt`, run `sbt clean fastOptJS` and check `./target/scala-2.11/scalajs-bundler-wrongsourcemap-fastopt.js.map`)
