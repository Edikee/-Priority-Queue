package main;
import javax.swing.plaf.synth.SynthSplitPaneUI;

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
		int priority = 30;
		switch(patient.getComplain()){
			case "shot": priority = 3;break;
			case "broken": priority = 10;break;
			case "cut": priority = 20;break;
			case "stab": priority = 5;break;
		}
	 
		prque.add(patient,priority);
		recordId++;
	}
	public Patient getPatient(){
		return prque.getMin();
	}
	public void kiir(){
		prque.kiir();
	}
	public void event(Patient patient, String event){
		int newPriority = 0;
		switch(event){
			case "collapse" : newPriority = 2;break;
			case "stop breath" : newPriority = 1;break;
		}
		prque.changePriority(patient, newPriority);
	}
}
