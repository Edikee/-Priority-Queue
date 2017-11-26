package main;

import java.lang.Thread;

public class Doctor extends Person implements Runnable {
	private Nurse nurse;

	public Doctor(String name, Nurse nurse) {
		super(name);
		this.nurse = nurse;

	}

	@Override
	public void run() {

		while (true) {
			synchronized (nurse) {
				if (nurse.isEmpty()) {
					System.out.println(this.getPersonName() + " there are no Patients");
				} else {
					heal(nurse.getPatient());
				}
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		}

	}

	public void heal(Patient p) {

		System.out
				.println(this.getPersonName() + " healed Mr/Mrs " + p.getPersonName() + " Problem: " + p.getComplain());
	}
}
