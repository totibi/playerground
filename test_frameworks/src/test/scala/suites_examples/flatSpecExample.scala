package suites_examples

import org.scalatest.FlatSpec

import scala.collection.mutable

/**
	* @author Alexander @date 23.09.19.
	*         FlatSpec's structure is flat like xUnit, so simple and familiar, but the test names must be written in a specification style:
	*         "X should Y," "A must B," etc.
	*/

class SetSpec extends FlatSpec {

	"An empty Set" should "have size 0" in {
		assert(Set.empty.size == 0)
	}

	it should "produce NoSuchElementException when head is invoked" in {
		assertThrows[NoSuchElementException] {
			Set.empty.head
		}

	}


}

class StachSpec extends FlatSpec {
	"A Stack" should "pop values in last-in-first-out order" in {
		val stack = new mutable.Stack[Int]
		stack.push(1)
		stack.push(2)
		assert(stack.pop() === 2)
		assert(stack.pop() === 1)
	}
	it should "throw NoSuchElementException if an empty stack is popped" in {
		val emptyStack = new mutable.Stack[String]
		assertThrows[NoSuchElementException] {
			emptyStack.pop()
		}
	}
}