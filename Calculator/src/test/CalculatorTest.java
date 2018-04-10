package test;
import org.junit.jupiter.api.Test;
import main.Calculator;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CalculatorTest  {

	private static Calculator calculator = new Calculator(); 
	
	@Test
	public void testSum()//сложение двух положителных целых чисел
	{   
		assertEquals(10,calculator.sum(3,7));
	}
	
	@Test
	public void testSumNegative()//сложение двух отрицательных целых чисел
	{
	    assertEquals(-18, calculator.sum(-8,-10));
	}
	
	@Test
	void testSumNegativePositive()//сложение одного положительного и одного отрицательного  целых чисел
	{
		assertEquals(9, calculator.sum(16,-7));
	}
	
	@Test 
	void testSumFraction() //сложение двух дробных положительных чисел
	{
		assertEquals(6.0,calculator.sumFraction(2.5,3.5));
	}
	
	@Test
	void testMinus() //вычитание двух положительных целых  чисел
	{
		assertEquals(7, calculator.minus(10,3));
	}
	
	@Test
	void testMinusNegative() //вычитание двух отрицательных целых чисел
	{
		assertEquals(7, calculator.minus(-3,-10));
	}
	
	@Test
	void testMinusNegativePositive() //вычитание одного отрицательного и одного положительного числа
	{
		assertEquals(-9, calculator.minus(-6,3));
	}
	
	@Test 
	void testMinusFraction() //вычитание двух дробных положительных чисел
	{
		assertEquals(3.1, calculator.minusFraction(6.5,3.4));
	}

	@Test
	void testMultiply() //умножение двух целых положительных чисел
	{
		assertEquals(30,calculator.multiply(5,6));
	}
	
	@Test
	void testMultiplyNegative() //умножение двух целых отрицательных чисел
	{
		assertEquals(15,calculator.multiply(-3,-5));
	}
	
	@Test
	void testMultiplyNegativePositive() //умножение одного отрицательного и одного положительного целого числа
	{
		assertEquals(-16, calculator.multiply(-8,2));
	}
	
	@Test
	void  testMultiplyFraction() //умножение двух положительных дробных чисел
	{
		assertEquals(6.25, calculator.multiplyFraction(2.5,2.5));
	}
	@Test
	void testDivide() //деление двух целых положительных чисел
	{
		assertEquals(2, calculator.divide(8, 4));;
	}
	
	@Test
	void testDivideNegative() //деление двух целых отрицательных чисел
	{
		assertEquals(8, calculator.divide(-16, -2));;
	}
	
	@Test
	void testDivideNegativePositive() //деление одного положительного  и одного отрицательного целого  числа
	{
		assertEquals(-2, calculator.divide(10, -5));
	}
	
    @Test//деление числа на ноль
    public void testDivideByZero () {
    	Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divideByZero(5, 0);
        });
        assertEquals("Cannot division by zero", exception.getMessage());
    }
    
	@Test
	void testDivideZeroOnNumber() //деление 0 на число
	{
		assertEquals(0, calculator.divide(0,4));;
	}
	
	@Test 
	void  testDivideFraction() //деление двух дробных чисел
	{
		assertEquals(5.5, calculator.divideFraction(8.25,1.5));	
	}
	
	@Test 
	void  testPower() //возведение в степень положительного целого числа
	{
		assertEquals(4, calculator.power(2,2));	
	}
	@Test 
	void  testPowerNegativeNumber() //возведение в степень отрицательного целого числа
	{
		assertEquals(9, calculator.power(-3,2));	
	}
	
	@Test 
	void  testPowerFraction() //возведение в степень положительного дробного числа
	{
		assertEquals(15.625, calculator.powerFraction(2.5,3));	
	}
	
	@Test 
	void  testPowerNegativDegreee() //возведение в  отрицательную степень положительного целого числа
	{
		assertEquals(0.25,calculator.powerFraction(2,-2));	
	}
	
	@Test 
	void  testRoot()// корень из положительного целого числа
	{
		assertEquals(4, calculator.root(16));	
	}
	
	 @Test//корень из отрицательного числа
	    public void testRootNegativeNumber () {
	    	Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
	            calculator.rootNegativeNumber(-25);
	        });
	        assertEquals("Cannot get square root of negative number", exception.getMessage());
	    }
	@Test 
	void  testRootFraction() //корень из положительного дробнго числа
	{
		assertEquals(4.2, calculator.rootFraction(17.64));	
	}
	
}
