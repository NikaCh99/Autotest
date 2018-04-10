package main;

public class Calculator {
	
	  
	
	public int sum(int a, int b) //сложение двух  целых чисел
	{
		return a + b;
	}
	
	public Object sumFraction(double a, double b) //сложение двух дробных  чисел
	{
		
		return a + b;
	}

	public int minus(int a, int b) //вычитание двух целых  чисел
	{
		return a - b;  
	}
	
	public Object minusFraction(double a, double b) //вычитание двух дробных  чисел
	{
		return a - b;
	}

	
	public int multiply(int a, int b) //умножение двух целых  чисел
	{
		return a * b;
	}
	
	public Object multiplyFraction(double a, double b) //умножение двух  дробных чисел
	{
		return a * b;
	}
	
	public int divide(int a, int b) //деление двух целых чисел
	{
		return a / b;
	}
	
	public Object divideFraction(double a, double b) //деление двух дробных чисел
	{
		return a / b;
	}

	public int divideByZero(int a, int b) //деление на 0
	{
		if (b == 0) {
	        throw new IllegalArgumentException("Cannot division by zero");
	    } else {
	        return a / b;
	    }
	}
	public int power(int a, int b) //возведение целого числа в степень
	{
		return (int) Math.pow(a, b);
	}
	
	public Object powerFraction(double a, double b) //возведение дробного числа в степень
	{
		return (double) Math.pow(a, b);
	}
	
	public int root(int a) //корень из  целого числа
	{
		return (int) Math.sqrt(a);
	}
	
	public int rootNegativeNumber(int a) //корень из отрицательного числа
	{
		if (a<0) {
	        throw new IllegalArgumentException("Cannot get square root of negative number");
	    } else {
	        return (int) Math.sqrt(a);
	    }
	}
	public Object rootFraction(double a) //корень из дробного числа
	{
		return (double) Math.sqrt(a);
	}
}
