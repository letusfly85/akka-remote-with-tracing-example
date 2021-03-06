package org.triplew.example

import com.github.levkhomich.akka.tracing.TracingSupport

final case class UuidStatus(uuid: String, status: String) extends TracingSupport
