
package io.vertx.groovy.support

import io.vertx.core.json.JsonArray
import io.vertx.core.json.JsonObject
import scala.collection.JavaConverters._

/**
 * @author <a href="mailto:jochen.mader@codecentric.de">Jochen Mader</a>
 */
object JsonConverter {

  def toJsonObject(obj: Map[String, Object]) = {
    new JsonObject(obj.asJava)
  }

  def toJsonArray(arr: List[Object]) = {
    new JsonArray(arr.asJava)
  }

//  def fromJsonObject(obj: JsonObject) = {
//    def m = new
//    obj.forEach { entry ->
//      if (entry.value instanceof JsonObject) {
//        m[entry.key] = fromJsonObject(entry.value)
//      } else if (entry.value instanceof JsonArray) {
//        m[entry.key] = fromJsonArray(entry.value)
//      } else {
//        m[entry.key] = entry.value
//      }
//    }
//    return m;
//  }
//
//  def fromJsonArray(arr: JsonArray) = {
//    def m = [];
//    arr.forEach { value ->
//      if (value instanceof JsonObject) {
//        m << fromJsonObject(value)
//      } else if (value instanceof JsonArray) {
//        m << fromJsonArray(value)
//      } else {
//        m << value
//      }
//    }
//    return m;
//  }
}
