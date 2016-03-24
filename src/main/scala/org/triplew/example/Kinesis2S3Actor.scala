package org.triplew.example

import akka.actor.{Actor, ActorLogging}

class Kinesis2S3Actor extends Actor with ActorLogging {
  def receive = {
    case uuid =>
      log.info(s"get ${uuid}")
      sender ! uuid

    case _ => //do nothing
  }
}
