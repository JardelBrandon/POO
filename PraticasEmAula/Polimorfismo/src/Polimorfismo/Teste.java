package Polimorfismo;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animal;
		animal = new Animal[5];
		
		animal[0] = new Cachorro();
		animal[1] = new Gato();
		animal[2] = new Vaca();
		animal[3] = new Cavalo();
		animal[4] = new Onca();
		
		
		
		for(int i = 0; i < 5; i++){
			animal[i].Som();
		}
	}

}
