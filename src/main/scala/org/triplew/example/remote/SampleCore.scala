package org.triplew.example.remote

import akka.actor.{ActorSystem, Props}
import org.triplew.example.Kinesis2S3Actor

object SampleCore {

  def main(args: Array[String]): Unit = {
    val system = ActorSystem("SampleCore")
    val actor  = system.actorOf(Props[Kinesis2S3Actor], "Kinesis2S3")
    system.log.info("start actor")
  }

}
