package javabasics;

public class DomesticAnimal extends Animal{

	@Override
	public void sounds(String animal) {
		// TODO Auto-generated method stub
		super.sounds(animal);
	}
	
	@Override
	public void foodType(String animal) {
		// TODO Auto-generated method stub
		super.foodType(animal);
	}
	public DomesticAnimal(String foodType) {
		
		super();
		super.foodType(foodType);
	}
	
	public DomesticAnimal() {
		this("Herbivores");
	}
	
	
	
	
	
}
