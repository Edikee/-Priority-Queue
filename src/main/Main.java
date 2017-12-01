package main;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

		Nurse nurse = new Nurse("Nurse");
		Doctor doctor = new Doctor("Doctor", nurse);
		(new Thread(doctor)).start();
		(new Thread(nurse)).start();

	}

}
