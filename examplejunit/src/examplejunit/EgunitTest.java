package examplejunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EgunitTest {

	@Test
	public void test() {
		Egunit a=new Egunit();
		/*
		 * String result=a.string("jayu","maha"); assertEquals("jayumaha",result);
		 */
		int actual=a.add(5,7);
		int excepted=12;
		assertEquals(excepted,actual);
		
	}
	

}
