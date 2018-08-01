package reverseEngineering;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RoadSignsTest {

	@Test
	void test() {

		
		String[] a = { "You matter.", "Don't give up." };
		String solA = "You don't matter. Give up.";

		String[] b = { "Don't open", "Dead inside" };
		String solB = "Don't dead open inside";

		String[] c = { "Nothing sense we're", "Makes when apart" };
		String solC = "Nothing makes sense when we're apart";

		String[] d = { "Jeez", "!", "Punctuation sure is annoying,", "what do you think?" };
		String solD = "Jeez! Punctuation what sure do is you annoying, think?";

		String[] e = { "Hm that's quite strange.", "Indeed.", "Interesting for sure." };
		String solE = "Hm indeed. Interesting that's for quite sure. Strange.";

		RoadSigns test = new RoadSigns();
		
		if(!test.roadSigns(a).contains(solA)) {
			fail("Missed test case A");
		}
		if(!test.roadSigns(b).contains(solB)) {
			fail("Missed test case B");
		}
		if(!test.roadSigns(c).contains(solC)) {
			fail("Missed test case C");
		}
		if(!test.roadSigns(d).contains(solD)) {
			fail("Missed test case D");
		}
		if(!test.roadSigns(e).contains(solE)) {
			fail("Missed test case E");
		}
		

		
	}

}
