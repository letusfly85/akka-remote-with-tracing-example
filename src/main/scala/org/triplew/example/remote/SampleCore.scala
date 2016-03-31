package org.triplew.example.remote

import akka.actor.{ActorSystem, Props}
import org.triplew.example.Kinesis2S3Actor

object SampleCore {
  implicit val actorSystem = ActorSystem("SampleCore")

  def main(args: Array[String]): Unit = {
    actorSystem.actorOf(Props[Kinesis2S3Actor], "Kinesis2S3")
  }

}

