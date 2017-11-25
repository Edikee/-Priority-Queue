package main;

public class Person  {
	protected String personName;
	public Person(String name){
		this.personName = name;
	}
	public void setPersonName(String newName){
		this.personName = newName;
	}
	public String getPersonName(){
		return this.personName;
	}
 
}
