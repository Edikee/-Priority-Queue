package main;

public class Patient {
	
	private String name;
	private String complaint;
	private int id;
	
	public Patient(String name,String complain){
		this.name = name;
		this.complaint = complain;
	}
	public String getComplain(){
		return complaint;
	}
	public String getName(){
		return name;
	}
}
