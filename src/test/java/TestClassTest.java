import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class TestClassTest {
	@Test
	public void testInverse(){
		TestClass test = new TestClass();
		String result = test.inverse("Bero");
		assertEquals("oreB",result);
	}
	@Test
	public void test1()  {
		TestClass test = mock(TestClass.class);
		// define return value for method getUniqueId()
		when(test.inverse("Bero")).thenReturn("Lomsadze");
		assertEquals(test.inverse("Bero"),"Lomsadze");
	}
}
