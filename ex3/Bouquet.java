package senla.tsk3.ex3;

public class Bouquet {
	
	protected int packPrice;
	protected int n_flow = 0;
	protected flower[] flowers;
	
	
	public Bouquet(int packPrice,int size) {
		flowers = new flower[size];
		this.packPrice = packPrice;
		
	}
	
	public void AddFlower(flower item) {
		if (n_flow<(flowers.length -1)) {
			flowers[n_flow] = item;
			n_flow++;
		}
	}
	
	public int getTotalPrice() {
		int sum = 0;
		int n = flowers.length;
		for(int i = 0;i<n;i++) {
			sum+=flowers[i].GetPrice();
		}
		sum+=packPrice;
		return(sum);
		
	}
	
	public void PrintInfo() {
		int n = flowers.length;
		for(int i = 0;i<n;i++) {
			System.out.println(flowers[i].GetInfo());
		}
		System.out.println("Pack price: ".concat(String.valueOf(packPrice)));
		System.out.println("Total price: ".concat(String.valueOf(getTotalPrice())));
	}

}
