import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClassTest {
	@Test
	public void testInverse(){
		String result = TestClass.inverse("Bero");
		assertEquals("oreB",result);
	}
}
