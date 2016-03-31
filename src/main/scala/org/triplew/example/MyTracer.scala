package org.triplew.example

import com.github.levkhomich.akka.tracing.TracingSupport

final case class MyTracer(actorName: String, timestamp: String) extends TracingSupport
