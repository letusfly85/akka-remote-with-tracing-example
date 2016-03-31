name := "akka-remote-with-tracing-example"

organization := "org.triplew.example"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")


libraryDependencies ++= {
  val akkaV       = "2.4.2"
  Seq(
    "com.typesafe.akka" % "akka-actor_2.11" % akkaV,
    "com.typesafe.akka" %% "akka-remote" % akkaV,
    "com.github.levkhomich" %% "akka-tracing-core" % "0.4",
    "org.specs2" % "specs2_2.11" % "3.7" % "test",
    "commons-configuration" % "commons-configuration" % "1.10"
  )
}


Revolver.settings

wartremoverErrors ++= Seq(
  Wart.IsInstanceOf,
  Wart.Return,
  Wart.Any2StringAdd,
  Wart.OptionPartial,
  Wart.TryPartial,
  Wart.ListOps,
  Wart.Null,
  Wart.Product,
  Wart.Serializable,
  Wart.Nothing,
  Wart.Var,
  //Wart.Throw,
  Wart.Enumeration,
  Wart.ToString,
  Wart.FinalCaseClass,
  Wart.EitherProjectionPartial,
  Wart.ExplicitImplicitTypes,
  Wart.AsInstanceOf)
