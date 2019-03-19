package com.dhafa.zoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eCleaningService")
public class CleaningService implements Employee {
	@Autowired
	@Value("Afahd")
	private String name;
	@Value("22")
	private int ID;
	@Value("Gates")
	private String cleaningarea;
	@Override
	public String getEmployeeTask() {
		// TODO Auto-generated method stub
		return "Clean the zoo";
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
	public String getCleaningarea() {
		return cleaningarea;
	}
	public void setCleaningarea(String cleaningarea) {
		this.cleaningarea = cleaningarea;
	}
	public CleaningService(String name, int iD, String cleaningarea) {
		this.name = name;
		ID = iD;
		this.cleaningarea = cleaningarea;
	}
	public CleaningService() {
	}
	@Override
	public String toString() {
		return "CleaningService [name=" + name + ", ID=" + ID + ", cleaningarea=" + cleaningarea + "]";
	}
	
	
}
