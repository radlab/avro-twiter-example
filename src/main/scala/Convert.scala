package edu.berkeley.cs.scads.twitter

import java.io.{FileInputStream, InputStreamReader, BufferedReader, File}
import com.googlecode.avro.runtime._

object Convert {
  def main(args: Array[String]): Unit = {
    org.apache.log4j.BasicConfigurator.configure

    args.foreach(filename => {
      val infile = new BufferedReader(new InputStreamReader(new FileInputStream(filename)))
      val outfile = AvroOutFile[Tweet](new File(filename + ".avro"))
      var line = infile.readLine()

      while(line != null) {
        if(line contains "text")
          line.replaceFirst("^START:", "").toAvro[Tweet].foreach(outfile.append)
        line = infile.readLine()
      }
      outfile.close()
    })
  }
}
