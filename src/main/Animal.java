package main;

public class Animal {
	public enum typeAnimal
	{
	oiseaux,
	mammifere,
	reptile
	};
	
public static void main(String args[]){
	for(typeAnimal race : typeAnimal.values()){
		if(typeAnimal.oiseaux.equals(race)){
			System.out.println("je vole");}
			else 
				if(typeAnimal.mammifere.equals(race)){
					System.out.println("je marche");
					
			}
				else if(typeAnimal.reptile.equals(race)){
			System.out.println("je rempe");
			
			
		}
				else System.out.println("je suis un " +race);
	}
}

	
	

}
