package com.dhafa.zoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aBird")
public class Bird implements Animal {
	@Autowired
	@Value("Woodpecker")
	private String name;
	@Value("Red")
	private String wingcolor;
	@Override
	public String getAnimalType() {
		// TODO Auto-generated method stub
		return "Bird";
	}
	public Bird(String name, String wingcolor) {
		this.name = name;
		this.wingcolor = wingcolor;
	}
	public Bird() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWingcolor() {
		return wingcolor;
	}
	public void setWingcolor(String wingcolor) {
		this.wingcolor = wingcolor;
	}
	@Override
	public String toString() {
		return "Bird [name=" + name + ", wingcolor=" + wingcolor + "]";
	}

}
