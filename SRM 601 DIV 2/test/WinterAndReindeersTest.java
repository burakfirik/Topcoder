import org.junit.Test;
import static org.junit.Assert.*;

public class WinterAndReindeersTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] allA = new String[] {"X"};
		String[] allB = new String[] {"X", "Y"};
		String[] allC = new String[] {"X"};
		assertEquals(1, new WinterAndReindeers().getNumber(allA, allB, allC));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] allA = new String[] {"ABCXD"};
		String[] allB = new String[] {"BCDEF"};
		String[] allC = new String[] {"CD"};
		assertEquals(3, new WinterAndReindeers().getNumber(allA, allB, allC));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] allA = new String[] {"WE", "LOVE"};
		String[] allB = new String[] {"WORKING", "FOR", "SANTA"};
		String[] allC = new String[] {"JK"};
		assertEquals(0, new WinterAndReindeers().getNumber(allA, allB, allC));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] allA = new String[] {"ABCDE"};
		String[] allB = new String[] {"CDEAB"};
		String[] allC = new String[] {"B"};
		assertEquals(2, new WinterAndReindeers().getNumber(allA, allB, allC));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] allA = new String[] {"ABCABDEGAXAHDJBAAHFJDXBB", "ABHFHCDALFDJDBBA", "BABBAXAXXX"};
		String[] allB = new String[] {"ABLOCBAXBAHAJDXBIJKA", "JBABCDAHKFIUDALPJAH", "AABACX"};
		String[] allC = new String[] {"AXBADXBBAB", "CDD"};
		assertEquals(23, new WinterAndReindeers().getNumber(allA, allB, allC));
	}
}
