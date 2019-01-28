name := "DemoScala"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.0"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

libraryDependencies ++= Seq("junit" % "junit" % "4.8.1" % "test")
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"

libraryDependencies += "org.scalajs" %% "jquery" % "1.2"


libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "2.35.0" % "test"


libraryDependencies += "org.scala-js" %% "scalajs-dom" % "0.9.6"



resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.3")
