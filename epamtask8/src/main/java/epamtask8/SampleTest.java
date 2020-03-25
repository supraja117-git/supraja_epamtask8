package epamtask8;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SampleTest {
	/*
	 * 	Ex: 
	 * 	“ABCD” => “BCD”   	test1stPositionChar		success
 		“AACD” => “CD”		testFirst2Chars			success
 		“BACD” => “BCD”		test2ndPositionChar		success
 		“BBAA” => “BBAA”	test2CharsWithoutA		success
 		“AABAA” => “BAA”	testFirst2Chars			success
 		"AA" => ""			testFirst2Chars			success
 		"" => ""			testEmptyChar			success
 		"A" => ""			testWhenLengthIs1		success
 		"CCDD" => "CCDD"	testNoChange4			success
 		"B" => "B"			testIfLengthIs1			success
	 */
	@Test
	void test1stPositionChar() {
		RemoveAFromFirst2Characters removeaFromfirst2characters = new RemoveAFromFirst2Characters();
		assertEquals("BCD",removeaFromfirst2characters.remove("ABCD"));
	}
	
	@Test
	void test2ndPositionChar() {
		RemoveAFromFirst2Characters removeaFromfirst2characters = new RemoveAFromFirst2Characters();
		assertEquals("BCD",removeaFromfirst2characters.remove("BACD"));
	}
	
	@Test
	void testFirst2Chars() {
		RemoveAFromFirst2Characters removeaFromfirst2characters = new RemoveAFromFirst2Characters();
		assertEquals("CD",removeaFromfirst2characters.remove("AACD"));
	}
	
	@Test
	void test2CharsWithoutA() {
		RemoveAFromFirst2Characters removeaFromfirst2characters = new RemoveAFromFirst2Characters();
		assertEquals("BBAA",removeaFromfirst2characters.remove("AABBAA"));
	}
	
	@Test
	void testEmptyChar() {
		RemoveAFromFirst2Characters removeaFromfirst2characters = new RemoveAFromFirst2Characters();
		assertEquals("",removeaFromfirst2characters.remove(""));
	}
	
	@Test
	void testWhenLengthIs1() {
		RemoveAFromFirst2Characters removeaFromfirst2characters = new RemoveAFromFirst2Characters();
		assertEquals("",removeaFromfirst2characters.remove("A"));
	}
	
	@Test
	void testNoChange() {
		RemoveAFromFirst2Characters removeaFromfirst2characters = new RemoveAFromFirst2Characters();
		assertEquals("CCDD",removeaFromfirst2characters.remove("CCDD"));
	}
	
	@Test
	void testIfLengthIs1() {
		RemoveAFromFirst2Characters removeaFromfirst2characters = new RemoveAFromFirst2Characters();
		assertEquals("B",removeaFromfirst2characters.remove("B"));
	}
}
