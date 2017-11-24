package main;

public class Patient {
	
	private String name;
	private String complain;
	public int nurse_id;
	
	public Patient(String name,String complain){
		this.name = name;
		this.complain = complain;
	}
	public String getComplain(){
		return complain;
	}
	public void setNurseId(int id){
		nurse_id = id;
	}
	@Override
	public String toString(){
		return name + " " + complain + " " + nurse_id;
	}
	@Override
	public boolean equals(Object s){
		if(this.toString().hashCode() == s.toString().hashCode())
			return true;
		return false;	
	}
	
 
}
