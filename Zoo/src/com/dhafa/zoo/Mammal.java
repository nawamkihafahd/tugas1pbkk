package com.dhafa.zoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aMammal")
public class Mammal implements Animal {
	@Autowired
	@Value("Dog")
	private String name;
	@Value("4")
	private int limbamount;
	@Override
	public String getAnimalType() {
		// TODO Auto-generated method stub
		return "Mammal";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLimbamount() {
		return limbamount;
	}
	public void setLimbamount(int limbamount) {
		this.limbamount = limbamount;
	}
	public Mammal(String name, int limbamount) {
		this.name = name;
		this.limbamount = limbamount;
	}
	public Mammal() {
	}
	@Override
	public String toString() {
		return "Mammal [name=" + name + ", limbamount=" + limbamount + "]";
	}
	
	
}
