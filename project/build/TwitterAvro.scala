import sbt._

class TwitterAvro(info: ProjectInfo) extends DefaultProject(info) with AutoCompilerPlugins
{
  val radlabRepo = "Radlab Repository" at "http://scads.knowsql.org/nexus/content/groups/public/"
  val avroScala = compilerPlugin("com.googlecode" % "avro-scala-compiler-plugin" % "1.1-SNAPSHOT")
  val pluginRuntime = "com.googlecode" % "avro-scala-compiler-plugin" % "1.1-SNAPSHOT"
  val avro = "org.apache.hadoop" % "avro" % "1.3.3"
}

