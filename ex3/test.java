package senla.tsk3.ex3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bouquet item = new Bouquet(50,5);
		
		item.AddFlower(new PinkRose());
		item.AddFlower(new WhiteRose());
		item.AddFlower(new PinkRose());
		item.AddFlower(new rose());
		item.AddFlower(new Tulip());
		//item.AddFlower(new Tulip());
		
		item.PrintInfo();

	}

}
