package main;

public class Person {
	protected String name;
	public Person(String name){
		this.name = name;
	}
	public void setName(String newName){
		this.name = newName;
	}
	public String getName(){
		return this.name;
	}
}
