package printing;

public class Getwholeandfractional {

	public static void main(String[] args) {
		int x = 10;
		double y = 10.4;
		
		double value = 10.4;
		
		double fractional_part = value % 1;
		
		double integral_part = value - fractional_part;
		
		System.out.println(fractional_part);
		System.out.println(integral_part);
		
		}

}
