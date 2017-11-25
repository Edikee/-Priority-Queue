package main;

public class Patient {
	
	private String name;
	private String complain;
	public int recordId;
	
	public Patient(String name,String complain){
		this.name = name;
		this.complain = complain;
	}
	public String getComplain(){
		return complain;
	}
	public void setrecordId(int id){
		recordId = id;
	}
	@Override
	public String toString(){
		return name + " Problem: " + complain + " Recordid: " + recordId;
	}
	@Override
	public boolean equals(Object s){
		if(this.toString().hashCode() == s.toString().hashCode())
			return true;
		return false;	
	}
	
 
}
