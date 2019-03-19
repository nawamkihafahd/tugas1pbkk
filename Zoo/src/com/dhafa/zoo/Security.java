package com.dhafa.zoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eSecurity")
public class Security implements Employee {
	@Autowired
	@Value("Western Gate")
	private String gate;
	@Value("Western Sector")
	private String patrolsector;
	@Value("Nawamkih")
	private String name;
	@Value("12")
	private int ID;
	@Override
	public String getEmployeeTask() {
		// TODO Auto-generated method stub
		return "Patrol the zoo and keep eye on the gate";
	}
	public String getGate() {
		return gate;
	}
	public void setGate(String gate) {
		this.gate = gate;
	}
	public String getPatrolsector() {
		return patrolsector;
	}
	public void setPatrolsector(String patrolsector) {
		this.patrolsector = patrolsector;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Security(String gate, String patrolsector, String name, int iD) {
		this.gate = gate;
		this.patrolsector = patrolsector;
		this.name = name;
		ID = iD;
	}
	public Security() {
	}
	@Override
	public String toString() {
		return "Security [gate=" + gate + ", patrolsector=" + patrolsector + ", name=" + name + ", ID=" + ID + "]";
	}
	
	
}
