package io.vertx.scala.support

import java.lang.Exception
import scala.util.{Failure, Success, Try}

object HandlerInvoker {

  def invokeStringHandler(f: PartialFunction[String, Unit]) {
    println("WUUAUARGH")
    f("callback_value")
  }
//
//  def invokeStringHandlerFirstParam(Handler<String> handler, String other) {
//    handler.handle(other);
//  }
//
//  def invokeStringHandlerLastParam(String other, Handler<String> handler) {
//    handler.handle(other);
//  }
//
  def invokeAsyncResultHandlerSuccess(f: PartialFunction[Try[String], Unit]) {
    f(Success("hello"))
  }

  def invokeAsyncResultHandlerFailure(f: PartialFunction[Try[String], Unit]) {
    f(Failure(new Exception("oh no")))
  }
}