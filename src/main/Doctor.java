package main;

public class Doctor extends Thread{

	public void heal(Patient p){
	
		System.out.println("The doctor healed Mr/Mrs " + p.toString());
	}
}
