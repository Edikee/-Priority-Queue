package main;

public class Patient extends Person {

	private String complain;
	public int recordId;

	public Patient(String name, String complain) {
		super(name);
		this.complain = complain;
	}

	public String getComplain() {
		return complain;
	}

	public void setrecordId(int id) {
		recordId = id;
	}

	@Override
	public String toString() {
		return personName + " " + complain + " " + recordId;
	}

	@Override
	public boolean equals(Object s) {
		if (this.toString().hashCode() == s.toString().hashCode()) {
			return true;
		}
		return false;
	}

}
