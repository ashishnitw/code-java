package serialization;// package coreJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;	//marker interface

class EmployeeSerialize implements Serializable{
	private int id;
	private String name;
	private transient int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "serialization.EmployeeSerialize [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class JavaSerialization {
	public static void serialize(Object obj, String fileName) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		fos.close();
	}
	public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		ois.close();
		return obj;
	}
	public static void main(String[] args) throws Exception {
		String fileName="employee.ser";
		EmployeeSerialize emp = new EmployeeSerialize();
		emp.setId(100);
		emp.setName("Pankaj");
		emp.setSalary(5000);
		
		//serialize
		try {
			serialize(emp, fileName);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		//de-serialize
		EmployeeSerialize empNew = null;
		try {
			empNew = (EmployeeSerialize) deserialize(fileName);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("emp Object::"+emp);
		System.out.println("empNew Object::"+empNew);
		
		
		
		
		
		
	}
}
