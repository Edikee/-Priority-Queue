package main;

import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Main {

	public static void main(String[] args) {
		 
		Nurse nurse = new Nurse("Nurse");
		Doctor doctor = new Doctor("Doctor");
		int length = 40;
		Patient[] p = new Patient[length];
		
		for(int i=0;i<length;i++){
			String complain="";
			String name = "patient " + i;
			switch(i%4){
				case  0 : complain = "shoot";break;
				case  1 : complain = "stab";break;
				case  2 : complain = "broken";break;
				case  3 : complain = "cut";break;
			}
			p[i] = new Patient(name,complain);
			nurse.record(p[i]);
			if(i%5==0){
				nurse.event(p[i], "stop breath");
			}
		}
 
		for(int i=0;i<length;i++){
			doctor.heal(nurse.getPatient());
		}
		
   
		


		
	}
	 

}
/*
		*/