package com.dhafa.zoo;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AnnotationConfig.xml");
		
		Employee employee1 = (Employee) context.getBean("eSecurity");
		System.out.println("Employee 1 task:");
		System.out.println(employee1.getEmployeeTask());
		System.out.println(employee1.toString());
		
		Employee employee2 = (Employee) context.getBean("eCleaningService");
		System.out.println("Employee 2 task:");
		System.out.println(employee2.getEmployeeTask());
		System.out.println(employee2.toString());
		
		Employee employee3 = (Employee) context.getBean("eCaretaker");
		System.out.println("Employee 3 task:");
		System.out.println(employee3.getEmployeeTask());
		System.out.println("Taking care of:");
		System.out.println(((Caretaker)(employee3)).getAnimal().getAnimalType());
		System.out.println(employee3.toString());
		
		System.out.println("Animals in the zoo:");
		Animal animal1 = (Animal) context.getBean("aFish");
		System.out.println(animal1.getAnimalType());
		System.out.println(animal1.toString());
		Animal animal2 = (Animal) context.getBean("aBird");
		System.out.println(animal2.getAnimalType());
		System.out.println(animal2.toString());
		Animal animal3 = (Animal) context.getBean("aMammal");
		System.out.println(animal3.getAnimalType());
		System.out.println(animal3.toString());
		
		((AbstractApplicationContext) context).close();
	}

}
