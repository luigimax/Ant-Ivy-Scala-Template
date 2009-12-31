/*
 * GrepTest.scala
 *
 * Example from: http://www.scalatest.org
 * 
 */

package ldc.unfuse

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import scala.collection.mutable.Stack


class GrepTest extends Spec with ShouldMatchers{
    describe("A Stack") {

    describe("(when empty)") {

      val stack = new Stack[Int]

      it("should be empty") {
        stack should be ('empty)
      }

      it("should complain when popped") {
        evaluating { stack.pop() } should produce [NoSuchElementException]
      }
    }
  }

}
