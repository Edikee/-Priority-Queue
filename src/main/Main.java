package main;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main {

	public static void main(String[] args) {
		 
		Nurse nurse = new Nurse();
		Doctor doctor = new Doctor();
 
		nurse.record(new Patient("a","cut")); 
		nurse.record(new Patient("a","broken")); 
		nurse.record(new Patient("a","stab")); 
		nurse.record(new Patient("a","cut")); 
		nurse.record(new Patient("a","cut")); 
		nurse.record(new Patient("a","broken")); 
		nurse.record(new Patient("a","stab")); 
		nurse.record(new Patient("aa","shot")); 
		nurse.record(new Patient("a","broken")); 
		nurse.record(new Patient("a","cut")); 
		nurse.record(new Patient("a","broken")); 
		nurse.record(new Patient("a","stab")); 
		nurse.record(new Patient("aa","shot")); 
		nurse.record(new Patient("a","stab")); 
		nurse.record(new Patient("aa","shot")); 
		nurse.record(new Patient("aa","shot")); 
		
		for(int i=0;i<5;i++){
			System.out.println(nurse.getPatient());
		}

		
	}
	 

}
/*
		*/