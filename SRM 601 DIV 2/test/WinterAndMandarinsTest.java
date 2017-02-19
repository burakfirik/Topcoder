import org.junit.Test;
import static org.junit.Assert.*;

public class WinterAndMandarinsTest {
    @Test(timeout=2000)
    public void test0() {
        int[] bags = new int[] {4, 7, 4};
        int K = 3;
        assertEquals(3, new WinterAndMandarins().getNumber(bags, K));
    }
	@Test(timeout=2000)
	public void test1() {
		int[] bags = new int[] {10, 20, 30};
		int K = 2;
		assertEquals(10, new WinterAndMandarins().getNumber(bags, K));
	}
	

	
	@Test(timeout=2000)
	public void test2() {
		int[] bags = new int[] {4, 1, 2, 3};
		int K = 3;
		assertEquals(2, new WinterAndMandarins().getNumber(bags, K));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] bags = new int[] {5, 4, 6, 1, 9, 4, 2, 7, 5, 6};
		int K = 4;
		assertEquals(1, new WinterAndMandarins().getNumber(bags, K));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] bags = new int[] {47, 1000000000, 1, 74};
		int K = 2;
		assertEquals(27, new WinterAndMandarins().getNumber(bags, K));
	}
}
