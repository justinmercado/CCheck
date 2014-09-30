import static org.junit.Assert.*;

import org.junit.Test;


public class CheckDigitTest extends CheckDigit{

	@Test
	public void test() {
		assertEquals(LengthCheck("1111111111111"), true);
		assertEquals(LengthCheck("11111111111111"), true);
		assertEquals(LengthCheck("111111111111111"), true);
		assertEquals(LengthCheck("1111111111111111"), true);
		assertEquals(LengthCheck("111111111111"), false);
		assertEquals(ValidCard("4123232"), true);
		assertEquals(ValidCard("5123232"),true);
		assertEquals(ValidCard("37123232"), true);
		assertEquals(ValidCard("623232"), true);
		assertEquals(ValidCard("123232"), false);
		assertEquals(checkDigits("4388576018410707"), true);
		assertEquals(checkDigits("4388576018402626"), false);
		
	}

}
