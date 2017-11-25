package main;

public class Main {

	public static void main(String[] args) {

		Nurse nurse = new Nurse("Nurse");
		Doctor doctor = new Doctor("Doctor", nurse);
		Doctor doctor2 = new Doctor("Doctor2", nurse);
		(new Thread(doctor2)).start();
		(new Thread(nurse)).start();

	}

}
