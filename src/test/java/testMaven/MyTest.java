package testMaven;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MyTest extends TestCase{
	public void testPrint(){
		MyClass myC=new MyClass();
		myC.print(100);
		
	}
	public void testQ1(){
		MyClass myC=new MyClass();
		
		Assert.assertEquals(myC.testQuestion(3), false);
	}
	
	public void testQ2(){
		MyClass myC=new MyClass();
		
		Assert.assertEquals(myC.testQuestion(5), false);
	}
}
