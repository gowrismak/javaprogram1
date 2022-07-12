/* Generic Program -1*/
public class TestProgram {

	public static void main(String[] args) {
		String[] strArray= {"one","two","three","four"};
		Integer[] intArray= {1,2,3,4};
		Double[] doubleArray= {1.0,2.0,3.0,4.0};
		/*displayStringArray(strArray);
		displayIntegerArray(intArray);
		displayDoubleArray(doubleArray);*/
		displayArray(strArray);
		displayArray(intArray);
		displayArray(doubleArray);

	}
/*	public static void displayStringArray(String[] strArray)
	{
		for(String s:strArray)
		{
			System.out.println(s);
		}
	}
	public static void displayIntegerArray(Integer[] intArray)
	{
		for(Integer i:intArray)
		{
			System.out.println(i);
		}
	}
	public static void displayDoubleArray(Double[] doubleArray)
	{
		for(Double d:doubleArray)
		{
			System.out.println(d);
		}
	}*/
	
	public static <T> void displayArray(T[] array)
	{
		for(T t:array)
			System.out.println(t);
	}

}
