package main;

public class Doctor  extends Person {

	public Doctor(String name) {
		super(name);
	 
	}

	public void heal(Patient p) {

		System.out.println(this.getName()+" healed Mr/Mrs " +p.getName() +" Problem: "+p.getComplain());
	}
}
