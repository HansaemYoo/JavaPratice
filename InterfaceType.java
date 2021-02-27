package interFace;

import java.util.ArrayList;

//6. 인터페이스와 ArrayList
public class InterfaceType {

	public static void main(String[] args) {
		ArrayList<Orderable> list = new ArrayList<Orderable>();
		
		Orderable f = new Food("족발", 19800);
		Orderable e = new Electronics("에어팟", 199000);
		Orderable c = new Clothing("셔츠", 49900);

		list.add(f);
		list.add(e);
		list.add(c);
		
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
		Orderable o = list.get(i);
		sum += o.discountedPrice();
		}
		
		System.out.printf("총합: %d원", sum);
	}

}

interface Orderable {
	public int discountedPrice();
}

class Food implements Orderable {
	private String name;
	private int price;
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int discountedPrice() {
		return (int)(price * 0.9);
	}
}

class Electronics implements Orderable {
	private String name;
	private int price;
	
	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int discountedPrice() {
		return (int)(price * 0.8);
	}
}

class Clothing implements Orderable {
	private String name;
	private int price;
	
	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int discountedPrice() {
		return (int) (price * 0.7);
	}
}