import java.util.ArrayList;
import java.util.Iterator;

public abstract class Animal implements AnimalInterface {

	public Animal() {

	}
	
	protected ArrayList<Animal> acquiredAnimals = new ArrayList<Animal>();
	protected Object Dual;
	
	

	public void setAcquiredAnimals(ArrayList <Animal> acquiredAnimals) {
		this.acquiredAnimals = acquiredAnimals;
	}
	public ArrayList getAcquiredAnimals() {
		return acquiredAnimals;
	}
	public void store() {
	}

	public long calcScore() throws InedibleException {
		long totScore = 0;
		return totScore;
	}
	
	}
	
	 
		


