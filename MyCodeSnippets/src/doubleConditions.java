public class doubleConditions {

	public static void main(String[] args) {
		Double a = 5.00;
		Double b = 5.00;
		if(a==b) {
			System.out.println("value is matching");
		} else {
			System.out.println("MISMATCH");
		}
		System.out.println(Double.compare(a, b));
	}
}
