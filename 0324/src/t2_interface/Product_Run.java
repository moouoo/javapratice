package t2_interface;

public class Product_Run {
	public static void main(String[] args) {
		
		Product product = new Product();
		product.switchOn("TV");
		product.setVolume(5);
		product.setVolume(15);
		product.setVolume(-5);
		product.switchOff("TV");
		System.out.println("----------------");
	
		product.switchOn("오디오");
		product.setVolume(8);
		product.setVolume(19);
		product.setVolume(-2);
		product.switchOff("오디오");
		
	}
}
