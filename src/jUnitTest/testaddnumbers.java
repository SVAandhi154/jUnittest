package jUnitTest;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions,*;
import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		jUnitfunctions Junit=new jUnitfunctions();
		int result=Junit.AddNumbers(300,500);
		assertEquals (800,result);
	}

}
