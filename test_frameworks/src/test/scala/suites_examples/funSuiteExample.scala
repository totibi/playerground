package suites_examples
import org.scalatest.FunSuite

/**
	* @author Alexander @date 23.09.19.
	*         FunSuite makes it easy to write descriptive test names, natural to write focused tests,
	*         and generates specification-like output that can facilitate communication among stakeholders.
	*/
class SetSuite extends FunSuite {
	test("An empty Set should have size 0") {
		assert(Set.empty.size == 0)
	}
	test("Invoking head on an empty Set should produce NoSuchElementException") {
		assertThrows[NoSuchElementException] {
			Set.empty.head
		}
	}
}
