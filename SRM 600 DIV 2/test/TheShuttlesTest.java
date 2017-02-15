import org.junit.Test;
import static org.junit.Assert.*;

public class TheShuttlesTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] cnt = new int[] {9};
		int baseCost = 30;
		int seatCost = 5;
		assertEquals(75, new TheShuttles().getLeastCost(cnt, baseCost, seatCost));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] cnt = new int[] {9, 4};
		int baseCost = 30;
		int seatCost = 5;
		assertEquals(150, new TheShuttles().getLeastCost(cnt, baseCost, seatCost));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] cnt = new int[] {9, 4};
		int baseCost = 10;
		int seatCost = 5;
		assertEquals(105, new TheShuttles().getLeastCost(cnt, baseCost, seatCost));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] cnt = new int[] {51, 1, 77, 14, 17, 10, 80};
		int baseCost = 32;
		int seatCost = 40;
		assertEquals(12096, new TheShuttles().getLeastCost(cnt, baseCost, seatCost));
	}
}
