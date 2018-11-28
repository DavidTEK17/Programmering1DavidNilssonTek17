package printing;

public class ReverseAnIntegerNumber {

	public int getReverseInt(int value) {
		int x = 0;
		for (int i = value; i !=0; i/= 10) {
			x = x * 10 + i % 10;
			
		}
		return x;

}
	
}
