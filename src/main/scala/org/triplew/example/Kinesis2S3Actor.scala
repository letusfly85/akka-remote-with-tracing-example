package org.triplew.example

import akka.actor.{Actor, ActorLogging, ActorSystem}
import com.github.levkhomich.akka.tracing.ActorTracing

class Kinesis2S3Actor extends Actor with ActorLogging with ActorTracing {
  val remoteActor = context.actorSelection("akka.tcp://Kinesis2S3@127.0.0.1:2553/user/ClientActor")

  val ts = MyTracer(context.system.name, System.currentTimeMillis().toString)
  def receive = {
    case UuidStatus(uuid, status) =>
      log.info(s"start trace of ${uuid}")
      trace.sample(ts, context.system.name)
      trace.record(ts, s"recording.....${uuid}")
      Thread.sleep(1000L)

      remoteActor ! uuid

    case uuid: String =>
      log.info(s"finish trace of ${uuid}")
      Thread.sleep(2000L)
      trace.finish(ts)

      sender ! uuid

    case _ => //do nothing
  }
}
