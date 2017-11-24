package main;
import priorityqueue.*;
public class Nurse {
	private PriorityQueue<Patient> prque;
	private int recordId;
	public Nurse(){
		prque = new PriorityQueue<Patient>();
		recordId=0;
	}
	public void record(Patient patient){
		patient.setrecordId(recordId);
		int priority = 0;
		switch(patient.getComplain()){
		case "shot": priority = 1;break;
		case "broken": priority = 3;break;
		case "cut": priority = 4;break;
		case "stab": priority = 2;break;
		}
		prque.add(patient,priority);
		recordId++;
	}
	public Patient getPatient(){
		return prque.getMin();
	}
	public void event(Patient patient, String event){
		
	}
}
