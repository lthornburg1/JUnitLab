import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.MemoUtil;
/**
 * @author lthor - lthornburg1
 * CIS175 - Fall 2022
 * Sep 6, 2022
 */
public class TestMemo2 {
	String memo = "Robert";
	MemoUtil memoUtil = new MemoUtil(memo);
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		String memoMessage = "Hi Robert!";
		assertEquals(memoMessage, memoUtil.greetings());
	}

}
