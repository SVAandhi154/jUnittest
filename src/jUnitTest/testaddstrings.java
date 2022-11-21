package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstrings {

	@Test
	public void test() {
		jUnitfunctions Junit=new jUnitfunctions();
		String result=Junit.AddStrings("Shrajal","Varshney");
		assertEquals ("ShrajalVarshney",result);
	}

}