package edu.berkeley.cs.scads.twitter

import java.io.{FileInputStream, InputStreamReader, BufferedReader, File}
import com.googlecode.avro.runtime._

object Convert {
  def main(args: Array[String]): Unit = {
    org.apache.log4j.BasicConfigurator.configure()

    args.foreach(filename => {
      val infile = new BufferedReader(new InputStreamReader(new FileInputStream(filename)))
      val outfile = AvroOutFile[Tweet](new File(filename + ".avro"))
      var line = infile.readLine()

      while(line != null) {
        val tweet = try new Tweet().parseJson(line.replaceFirst("^START:", "")) catch {
          case e => {println("parsing failed"); null}
        }
        try {
          tweet.toBytes //HACK: if you attempt to append an invalid tweet to the file it causes corruption.
          outfile append tweet
        } catch {
          case e => println("bad tweet due to " + e + " " + line)
        }
        line = infile.readLine()
      }
      outfile.close()
    })
  }
}
