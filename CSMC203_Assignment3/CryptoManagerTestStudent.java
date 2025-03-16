/*
 * Class: CMSC203 
 * Instructor: Professor Khandan Monshi
 * Description: Takes plain text and key, checks if the ASCII is within the upper and lower bound then encrypt or decrypt it using its respective method.
 * Due: 03/17/2025
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Jin Ha Neul
*/
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CryptoManagerTestStudent {
	CryptoManager cryptoManager;

	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("HELLO"));
		assertTrue(CryptoManager.isStringInBounds("@TEST 123!"));
		assertFalse(CryptoManager.isStringInBounds("hello"));
		assertFalse(CryptoManager.isStringInBounds("~INVALID"));
		assertFalse(CryptoManager.isStringInBounds("THIS TEST SHOULD FAIL BECAUSE ~ IS OUT OF BOUNDS"));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("fail", 4));
		assertEquals("KHOOR", CryptoManager.caesarEncryption("HELLO", 3));
		assertEquals("@" , CryptoManager.caesarEncryption("A", 63));
		assertEquals(":25/'", CryptoManager.caesarEncryption("WORLD", 99));
		assertEquals("UIF!NFTTBHF", CryptoManager.caesarEncryption("THE MESSAGE", 1));
		assertEquals("YMNX%NX%FSTYMJW%YJXY", CryptoManager.caesarEncryption("THIS IS ANOTHER TEST", 5));
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals("THE MESSAGE", CryptoManager.caesarDecryption("UIF!NFTTBHF", 1));
		assertEquals("DATA", CryptoManager.caesarDecryption("IFYF", 5));
		assertEquals("SECURITY CHECK", CryptoManager.caesarDecryption("E75GD;FKR5:75=", 50));
		assertEquals("THIS IS ANOTHER TEST", CryptoManager.caesarDecryption("YMNX%NX%FSTYMJW%YJXY", 5));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("'TS(WL&^", CryptoManager.bellasoEncryption("SECURITY", "TOPSECRET"));
		assertEquals("^F_6R@PX,298", CryptoManager.bellasoEncryption("SAFE MESSAGE", "KEY123"));
		assertEquals("YVL%9Y'%OQ!-XYW.H*Z]$QS", CryptoManager.bellasoEncryption("THIS IS ANOTHER EXAMPLE", "ENCRYPT"));
	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("SECURITY", CryptoManager.bellasoDecryption("'TS(WL&^", "TOPSECRET"));
		assertEquals("SAFE MESSAGE", CryptoManager.bellasoDecryption("^F_6R@PX,298", "KEY123"));
		assertEquals("THIS IS ANOTHER EXAMPLE", CryptoManager.bellasoDecryption("YVL%9Y'%OQ!-XYW.H*Z]$QS", "ENCRYPT"));
	}
}