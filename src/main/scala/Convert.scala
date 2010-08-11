package edu.berkeley.cs.scads.twitter

import java.io.{FileInputStream, InputStreamReader, BufferedReader, File}
import com.googlecode.avro.runtime._

object Convert {
  def main(args: Array[String]): Unit = {
    args.foreach(filename => {
      val infile = new BufferedReader(new InputStreamReader(new FileInputStream(args)))
      val outfile = AvroOutFile[Tweet](new File(filename + ".avro"))
      var line = infile.readLine()

      while(line != null) {
        outfile append new Tweet().parseJson(line) 
        line = infile.readLine()
      }

    })
  }
}
