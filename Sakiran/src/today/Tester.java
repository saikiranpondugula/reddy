package today;

public class Tester {

	public static void main(String[] args) {
		ShirtMaterial s = ShirtMaterial.cotton;
		
		Shirt dsf = new Shirt(16.5f, 42, ""+s);
		
		System.out.println(dsf.displaydetails());
		
	}
}
