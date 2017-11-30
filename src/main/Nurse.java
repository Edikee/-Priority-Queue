package main;

import javax.swing.plaf.synth.SynthSplitPaneUI;

import priorityqueue.*;

public class Nurse extends Person implements Runnable {
	private PriorityQueue<Patient> prque;
	private int recordId;

	public Nurse(String name) {
		super(name);
		prque = new PriorityQueue<Patient>();
		recordId = 0;
	}

	public void record(Patient patient) {
		patient.setrecordId(recordId);
		int priority = 30;
		switch (patient.getComplain()) {
		case "shoot":
			priority = 5;
			break;
		case "broken":
			priority = 15;
			break;
		case "cut":
			priority = 20;
			break;
		case "stab":
			priority = 10;
			break;
		}

		prque.add(patient, priority);
		recordId++;
	}

	public Patient getPatient() {
		return prque.getFirst();
	}

	public void event(Patient patient, String event) {
		int newPriority = 0;

		switch (event) {
		case "collapse":
			newPriority = 2;
			break;
		case "stop breath":
			newPriority = 1;
			break;
		}
		Patient newPatient;
		newPatient = new Patient(patient.getPersonName(), event);
		newPatient.setrecordId(patient.recordId);
		prque.changePriority(patient, newPatient, newPriority);
	}

	public boolean isEmpty() {
		return prque.isEmpty();
	}

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {

			try {
				Thread.sleep(500);
				String complain = "";
				switch (recordId % 4) {
				case 0:
					complain = "shoot";
					break;
				case 1:
					complain = "cut";
					break;
				case 2:
					complain = "broken";
					break;
				case 3:
					complain = "stab";
					break;

				}
				Patient p = new Patient("patient " + recordId, complain);
				p.setrecordId(recordId);
				System.out.println("Nurse record " + p.getPersonName() + " with " + p.getComplain());
				this.record(p);
				if (i % 10 == 1) {
					this.event(p, "stop breath");
					System.out.println("Warning!!" + p.getPersonName() + " stop breath " + "Warning!!");
				}

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}
