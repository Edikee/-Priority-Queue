package main;

import priorityqueue.PriorityQueue;

public class ThreadTest implements java.lang.Runnable {
	private String name;
	private PriorityQueue<Patient> pq;

	public ThreadTest(String name,PriorityQueue<Patient> r) {
		this.name = name;
		this.pq = r;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			String pName = name + i;
			pq.add(new Patient(pName,"baj"));
			System.out.println("add "+pName);
		}

	}

}
