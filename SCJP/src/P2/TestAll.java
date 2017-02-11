package P2;

public class TestAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a=new Animal(2);
		Animal aHorse=new Horse();
		Horse h=new Horse();
		TestAll t=new TestAll();
		
		
	/*	t.testAnimals(a);
		t.testAnimals(h);
		t.testAnimals(aHorse);*/
		
	}
	
	public void anotherM()
	{
		testAnimals(new Horse());
	}
	
	public void testAnimals(Animal obj)
	{
		obj.sendAnimal();
	}

}
