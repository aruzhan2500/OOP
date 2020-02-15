package Intranet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;


public class Database implements Serializable{
	public static Vector<User> users = new Vector<User>();
	public static Vector<Student> students = new Vector<Student>();
	public static Vector<Teacher> teachers = new Vector<Teacher>();
	public static Vector<Manager> managers = new Vector<Manager>();
	public static Vector<Admin> admins = new Vector<Admin>();
	public static Vector<Discipline> disciplines = new Vector<Discipline>();
	public static Vector<TechGuy> techGuys = new Vector<TechGuy>();
	public static Vector<File> files = new Vector<File>();
	public static Vector<News> news = new Vector<News>();
	public static Vector<Order> orders = new Vector<Order>();
	static FileInputStream fis;
	static FileOutputStream fos;
	static ObjectOutputStream oos;
	static ObjectInputStream oin;
	
	public  static void desStudents() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("students.out");
		oin = new ObjectInputStream(fis);
		students = (Vector<Student>) oin.readObject();
		oin.close();
		fis.close();
	}
	
	public static void serStudents()throws IOException{
		fos = new FileOutputStream("students.out");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(students);
		oos.close();
	}
	
	public  static void desTeachers() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("teachers.out");
		oin = new ObjectInputStream(fis);
		teachers = (Vector<Teacher>) oin.readObject();
	}
	
	public static void serTeachers()throws IOException{
		fos = new FileOutputStream("teachers.out");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(teachers);
		oos.close();
	}
	public  static void desManagers() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("managers.out");
		oin = new ObjectInputStream(fis);
		managers = (Vector<Manager>) oin.readObject();
	}
	
	public static void serManagers()throws IOException{
		fos = new FileOutputStream("managers.out");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(managers);
		oos.close();
	}
	
	public static void desAdmins() throws IOException,ClassNotFoundException{
		fis = new FileInputStream("admins.out");
		oin = new ObjectInputStream(fis);
		admins = (Vector<Admin>) oin.readObject();	
	}
	
	public static void serAdmins()throws IOException{
		fos = new FileOutputStream("admins.out");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(admins);
		oos.close();
	}
	
	public static void desDisciplines() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("disciplines.out");
		oin = new ObjectInputStream(fis);
		disciplines = (Vector<Discipline>) oin.readObject();
	}
	public static void serDisciplines()throws IOException{
		fos = new FileOutputStream("disciplines.out");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(disciplines);
		oos.close();
	}
	
	public static void desTechGuys() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("techGuys.out");
		oin = new ObjectInputStream(fis);
		techGuys = (Vector<TechGuy>) oin.readObject();
	}
	public static void serTechGuys()throws IOException{
		fos = new FileOutputStream("techGuys.out");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(techGuys);
		oos.close();
	}
	
	public static void desFiles() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("files.out");
		oin = new ObjectInputStream(fis);
		files = (Vector<File>) oin.readObject();
	}
	public static void serFiles()throws IOException{
		fos = new FileOutputStream("files.out");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(files);
		oos.close();
	}
	public static void desNews() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("news.out");
		oin = new ObjectInputStream(fis);
		news = (Vector<News>) oin.readObject();
	}
	public static void serNews()throws IOException{
		fos = new FileOutputStream("news.out");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(news);
		oos.close();
	}
	public static void desOrders() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("orders.out");
		oin = new ObjectInputStream(fis);
		orders = (Vector<Order>) oin.readObject();
	}
	public static void serOrders()throws IOException{
		fos = new FileOutputStream("orders.out");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(orders);
		oos.close();
	}

}
