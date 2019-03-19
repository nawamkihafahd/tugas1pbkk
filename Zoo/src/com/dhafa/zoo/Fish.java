package com.dhafa.zoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aFish")
public class Fish implements Animal {
	@Autowired
	@Value("Shark")
	private String name;
	@Value("Saltwater")
	private String watertype;
	@Override
	public String getAnimalType() {
		// TODO Auto-generated method stub
		return "Fish";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWatertype() {
		return watertype;
	}
	public void setWatertype(String watertype) {
		this.watertype = watertype;
	}
	public Fish(String name, String watertype) {
		this.name = name;
		this.watertype = watertype;
	}
	public Fish() {
	}
	@Override
	public String toString() {
		return "Fish [name=" + name + ", watertype=" + watertype + "]";
	}
	
	
}
