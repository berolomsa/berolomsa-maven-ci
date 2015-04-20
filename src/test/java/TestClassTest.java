import org.junit.Test;
import static org.junit.Assert.*;

public class TestClassTest {
	@Test
	public void testInverse(){
		String result = TestClass.inverse("Bero");
		assertEquals("oreB",result);
	}
}
