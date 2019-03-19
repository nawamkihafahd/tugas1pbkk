package com.dhafa.zoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eCaretaker")
public class Caretaker implements Employee {
	@Autowired
	@Qualifier("aMammal")
	private Animal animal;
	@Value("Nawamkih Afahd")
	private String name;
	@Value("32")
	private int ID;
	@Override
	public String getEmployeeTask() {
		// TODO Auto-generated method stub
		return "Feed and clean the animals";
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
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
	public Caretaker(Animal animal, String name, int iD) {
		this.animal = animal;
		this.name = name;
		ID = iD;
	}
	public Caretaker() {
	}
	@Override
	public String toString() {
		return "Caretaker [animal=" + animal + ", name=" + name + ", ID=" + ID + "]";
	}
	
	
	
}
