package prerequisite_Opps_2;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Animal("M",23,78);
		Animal animal2 = new Animal("f",23,78);
		animal1.eat();
		animal2.sleep();
		
		Bird bird1 = new Bird("f",23,66);
		//bird1.fly();
		bird1.sleep();
		
//		Chicken chicken1 = new Chicken("m",23,66);
//		chicken1.fly();
		
		Sparrow sparrow1 = new Sparrow("m",2,6);
		sparrow1.move();
		
		Fish fish1 = new Fish("m",2,6);
		fish1.move();
		fish1.eat();
	}

}
