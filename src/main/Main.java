package main;

import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Main {

	public static void main(String[] args) {
		 
		Nurse nurse = new Nurse();
		Doctor doctor = new Doctor();
 
		nurse.record(new Patient("a","cut")); 
		 
		nurse.record(new Patient("c","stab")); 
		nurse.record(new Patient("d","cut")); 
		nurse.record(new Patient("e","cut")); 
		nurse.record(new Patient("c","stab")); 
		nurse.record(new Patient("f","broken")); 
		nurse.record(new Patient("s","shoot")); 
		nurse.record(new Patient("s","shoot")); 
		nurse.record(new Patient("h","broken"));
		nurse.record(new Patient("s","shoot")); 
		nurse.record(new Patient("c","stab")); ;
		nurse.record(new Patient("f1","broken")); 
		nurse.record(new Patient("cccc","stab")); ;
		nurse.record(new Patient("h","broken"));
		nurse.record(new Patient("s","shoot")); 
		nurse.record(new Patient("c","stab")); ;
		nurse.record(new Patient("f1","broken")); 
		nurse.record(new Patient("cccc","stab")); ;		nurse.record(new Patient("a","cut")); 
 
		nurse.record(new Patient("c","stab")); 
		nurse.record(new Patient("d","cut")); 
		nurse.record(new Patient("e","cut")); 
		nurse.record(new Patient("c","stab")); 
		nurse.record(new Patient("f","broken")); 
		nurse.record(new Patient("s","shoot")); 
		nurse.record(new Patient("s","shoot")); 
		nurse.record(new Patient("h","broken"));
		nurse.record(new Patient("s","shoot")); 
		nurse.record(new Patient("c","stab")); ;
		nurse.record(new Patient("f1","broken")); 
		nurse.record(new Patient("cccc","stab")); ;
		nurse.record(new Patient("h","broken"));
		nurse.record(new Patient("s","shoot")); 
		nurse.record(new Patient("c","stab")); ;
		nurse.record(new Patient("f1","broken")); 
		nurse.record(new Patient("cccc","stab")); ;		nurse.record(new Patient("a","cut")); 
 
		nurse.record(new Patient("c","stab")); 
		nurse.record(new Patient("d","cut")); 
		nurse.record(new Patient("e","cut")); 
		nurse.record(new Patient("c","stab")); 
		nurse.record(new Patient("f","broken")); 
		nurse.record(new Patient("s","shoot")); 
		nurse.record(new Patient("s","shoot")); 
		nurse.record(new Patient("h","broken"));
		nurse.record(new Patient("s","shoot")); 
		nurse.record(new Patient("c","stab")); ;
		nurse.record(new Patient("f1","broken")); 
		nurse.record(new Patient("cccc","stab")); ;
		nurse.record(new Patient("h","broken"));
		nurse.record(new Patient("s","shoot")); 
		nurse.record(new Patient("c","stab")); ;
		nurse.record(new Patient("f1","broken")); 
		nurse.record(new Patient("cccc","stab")); ;
 

		for(int i=0;i<18*3;i++){
			System.out.println( nurse.getPatient());
 
		}

		
	}
	 

}
/*
		*/