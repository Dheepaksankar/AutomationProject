package package2;

import org.testng.Assert;
import org.testng.annotations.Test;


import package1.WordCount;

public class WordcountTest {
	
	WordCount obj1;
 
	public WordcountTest() {
		obj1 = new WordCount();
		
	}

	
	@Test
	public void Verifyingwrdcnt() {
		obj1.productbtn();
		obj1.dropdown();
		
		Assert.assertTrue(obj1.wordscount()<100);
	}
	
	
}
