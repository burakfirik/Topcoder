import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeMatrixDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		String[] A = new String[] {"0000"
,"1000"
,"1100"
,"1110"};
		int rowCount = 2;
		int columnCount = 2;
		assertEquals(1, new PalindromeMatrixDiv2().minChange(A, rowCount, columnCount));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] A = new String[] {"0000"
,"1000"
,"1100"
,"1110"};
		int rowCount = 3;
		int columnCount = 2;
		assertEquals(3, new PalindromeMatrixDiv2().minChange(A, rowCount, columnCount));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] A = new String[] {"01"
,"10"};
		int rowCount = 1;
		int columnCount = 1;
		assertEquals(1, new PalindromeMatrixDiv2().minChange(A, rowCount, columnCount));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] A = new String[] {"1110"
,"0001"};
		int rowCount = 0;
		int columnCount = 0;
		assertEquals(0, new PalindromeMatrixDiv2().minChange(A, rowCount, columnCount));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] A = new String[] {"01010101"
,"01010101"
,"01010101"
,"01010101"
,"01010101"
,"01010101"
,"01010101"
,"01010101"};
		int rowCount = 2;
		int columnCount = 2;
		assertEquals(8, new PalindromeMatrixDiv2().minChange(A, rowCount, columnCount));
	}
}
