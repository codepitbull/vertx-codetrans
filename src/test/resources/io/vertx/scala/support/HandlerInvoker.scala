package io.vertx.scala.support

import java.lang.Exception
import scala.util.{Failure, Success, Try}

object HandlerInvoker {

  def invokeStringHandler(handler:String => Unit) {
    handler("callback_value")
  }
//
  def invokeStringHandlerFirstParam(handler:String => Unit, other: String) {
    handler(other)
  }
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