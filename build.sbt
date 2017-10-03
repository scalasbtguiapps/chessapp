
name := "chessapp"

organization := "chessappmaker"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.11"

resolvers := Resolver.jcenterRepo +: resolvers.value

resolvers := ("Atlassian Releases" at "https://maven.atlassian.com/public/") +: resolvers.value

libraryDependencies ++= Seq(
  "com.mohiva" %% "play-silhouette" % "4.0.0",
  "com.mohiva" %% "play-silhouette-password-bcrypt" % "4.0.0",
  "com.mohiva" %% "play-silhouette-persistence" % "4.0.0",
  "com.mohiva" %% "play-silhouette-crypto-jca" % "4.0.0",  
  "net.codingwell" %% "scala-guice" % "4.0.1",
  "com.iheart" %% "ficus" % "1.2.6",
  "com.typesafe.play" %% "play-mailer" % "5.0.0",
  "com.enragedginger" %% "akka-quartz-scheduler" % "1.5.0-akka-2.4.x",  
  "com.mohiva" %% "play-silhouette-testkit" % "4.0.0" % "test",
  "org.reactivemongo" %% "play2-reactivemongo" % "0.12.3" excludeAll(ExclusionRule("com.typesafe.play", "play-iteratees_2.11")),
  "com.mohiva" %% "play-silhouette-persistence-reactivemongo" % "4.0.0",
  "com.lihaoyi" %% "upickle" % "0.4.3",
  "commons-lang" % "commons-lang" % "2.6",
  "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test,
  specs2 % Test,
  cache,
  filters
)

routesGenerator := InjectedRoutesGenerator

routesImport += "utils.route.Binders._"

enablePlugins(PlayScala)
