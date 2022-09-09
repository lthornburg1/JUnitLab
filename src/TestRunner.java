import org.junit.runner.JUnitCore;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author lthor - lthornburg1
 * CIS175 - Fall 2022
 * Sep 7, 2022
 */
public class TestRunner {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(AllTests.class);
			
			for (Failure failure : result.getFailures()) {
				System.out.println(failure.toString());
			}
			
			System.out.println(result.wasSuccessful());

	}

}
