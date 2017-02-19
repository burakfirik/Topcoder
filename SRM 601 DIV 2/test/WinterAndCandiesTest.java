import org.junit.Test;
import static org.junit.Assert.*;

public class WinterAndCandiesTest {

    @Test(timeout=2000)
    public void test0() {
        int[] type = new int[] {1,3,2};
        assertEquals(3, new WinterAndCandies().getNumber(type));

    }

	@Test(timeout=2000)
	public void test10() {
		int[] type = new int[] {24, 15, 42, 12, 4, 19, 48, 45, 13, 8, 38, 10, 24, 42, 30, 29, 17, 36, 41, 43, 39, 7, 41, 43, 15, 49, 47, 6, 41, 30, 21, 1, 7, 2};
		assertEquals(2, new WinterAndCandies().getNumber(type));
	}

	
	@Test(timeout=2000)
	public void test1() {
		int[] type = new int[] {1, 1, 2};
		assertEquals(4, new WinterAndCandies().getNumber(type));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] type = new int[] {1, 3, 2, 5, 7, 4, 5, 4};
		assertEquals(9, new WinterAndCandies().getNumber(type));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] type = new int[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		assertEquals(62, new WinterAndCandies().getNumber(type));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] type = new int[] {2};
		assertEquals(0, new WinterAndCandies().getNumber(type));
	}
}
