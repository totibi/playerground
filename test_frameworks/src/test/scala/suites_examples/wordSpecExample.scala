package suites_examples

import org.scalatest.WordSpec

/**
	* @author Alexander @date 23.09.19.
	*         WordSpec is very prescriptive in how text must be written,
	*         so a good fit for teams who want a high degree of discipline enforced upon their specification text.
	*/

class SetWordSpec extends WordSpec {

	"A Set" when {
		"empty" should {
			"have size 0" in {
				assert(Set.empty.size == 0)
			}

			"produce NoSuchElementException when head is invoked" in {
				assertThrows[NoSuchElementException] {
					Set.empty.head
				}
			}
		}
	}
}