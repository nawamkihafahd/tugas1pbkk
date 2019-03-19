package com.dhafa.zoo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("XMLconfig.xml");
		Employee employee1 = (Employee) context.getBean("s1");
		System.out.println("Employee 1 task:");
		System.out.println(employee1.getEmployeeTask());
		System.out.println(employee1.toString());
		
		Employee employee2 = (Employee) context.getBean("cs1");
		System.out.println("Employee 2 task:");
		System.out.println(employee2.getEmployeeTask());
		System.out.println(employee2.toString());
		
		Employee employee3 = (Employee) context.getBean("c1");
		System.out.println("Employee 3 task:");
		System.out.println(employee3.getEmployeeTask());
		System.out.println("Taking care of:");
		System.out.println(((Caretaker)(employee3)).getAnimal().getAnimalType());
		System.out.println(employee3.toString());
		
		System.out.println("Animals in the zoo:");
		Animal animal1 = (Animal) context.getBean("f1");
		System.out.println(animal1.getAnimalType());
		System.out.println(animal1.toString());
		Animal animal2 = (Animal) context.getBean("m1");
		System.out.println(animal2.getAnimalType());
		System.out.println(animal2.toString());
		Animal animal3 = (Animal) context.getBean("b1");
		System.out.println(animal3.getAnimalType());
		System.out.println(animal3.toString());
		
		
		
		((AbstractApplicationContext) context).close();

	}
}
