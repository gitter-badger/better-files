resolvers ++= Seq(
  Resolver.typesafeRepo("releases"),
  Resolver.jcenterRepo
)

resolvers += Resolver.url("scoverage-bintray", url("https://dl.bintray.com/sksamuel/sbt-plugins/"))(Resolver.ivyStylePatterns) //TODO: Remove this

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.1.9") //TODO: Add version-eye-sbt
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.0")
addSbtPlugin("com.codacy" % "sbt-codacy-coverage" % "1.2.0")
