package base;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	
	@Test
	public void testisEven() {
		MyInteger x = new MyInteger(8);
		MyInteger y = new MyInteger(11);
		assertTrue(x.isEven());
		assertFalse(y.isEven());
	}
	
	@Test
	public void testisOdd() {
		MyInteger x = new MyInteger(11);
		MyInteger y = new MyInteger(14);
		assertTrue(x.isOdd());
		assertFalse(y.isOdd());
	}
	
	@Test
	public void testisPrime() {
		MyInteger x = new MyInteger(2);
		MyInteger y = new MyInteger(6);
		assertTrue(x.isPrime());
		assertFalse(y.isPrime());
	}
	
	@Test
	public void testStaticisEven() {
		assertTrue(MyInteger.isEven(4));
		assertFalse(MyInteger.isEven(5));
	}
	
	@Test
	public void testStaticisOdd() {
		assertTrue(MyInteger.isOdd(3));
		assertFalse(MyInteger.isOdd(6));
	}
	
	@Test
	public void testStaticisPrime() {
		assertTrue(MyInteger.isPrime(11));
		assertFalse(MyInteger.isPrime(6));
	}
	
	@Test
	public void testObjectisEven() {
		MyInteger x = new MyInteger(2);
		MyInteger y = new MyInteger(3);
		assertTrue(MyInteger.isEven(x));
		assertFalse(MyInteger.isEven(y));
	}
	
	@Test
	public void testObjectisOdd() {
		MyInteger x = new MyInteger(3);
		MyInteger y = new MyInteger(42);
		assertTrue(MyInteger.isOdd(x));
		assertFalse(MyInteger.isOdd(y));
	}
	
	@Test
	public void testObjectisPrime() {
		MyInteger x = new MyInteger(2);
		MyInteger y = new MyInteger(6);
		assertTrue(MyInteger.isPrime(x));
		assertFalse(MyInteger.isPrime(y));
	}
	
	@Test
	public void testintequals() {
		MyInteger x = new MyInteger(1);
		MyInteger y = new MyInteger(2);
		assertTrue(x.equals(1));
		assertFalse(y.equals(3));
	}
	
	@Test
	public void testobjectequals() {
		MyInteger a = new MyInteger(1);
		MyInteger b = new MyInteger(1);
		MyInteger c = new MyInteger(2);
		MyInteger d = new MyInteger(3);
		assertTrue(a.equals(b));
		assertFalse(c.equals(d));
	}

}
