package basictest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

public class BasicTest {

	@Test
	public void basictest() {
//		assertArrayEquals(a,b) 배열 a와 b가 일치함을 확인
		/*
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {1,2,3,4,6};
		assertArrayEquals(array1, array2);
		*/
//		assertEquals(a,b) 객체 a와 b가 일치함을 확인
		/*
		int a = 10;
		assertEquals(a, 10);
		*/
		
//		assertSame(a,b) 객체 a와 b가 같은 객체임을 확인
		/*
		String s1="12345";
		String s2=s1;
		String s3="aaa";
		assertSame(s1, s3);
		*/
		
//		assertTrue(a) a값이 참인지 확인
		/*
		boolean bool = true;
		//assertTrue(bool);
		assertTrue(booltest(10));
		*/
		
//		assertNotNull(a) 객체 a가 null이 아님을 확인
		Date date1 = new Date();
		Date date2;
		assertNotNull(date1);
	}
	
	static public boolean booltest(int input) {
		if(input>0) {
			return true;
		}else {
			return false;
		}
	}
}
