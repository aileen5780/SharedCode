package ex121;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import javax.sound.midi.Sequence;

class Student{
	int rollnumber;
	String name;
	List cources = new ArrayList();
	List l = new Vector();
	//
	Student(int i, String name, List cs){
		this.rollnumber = i;
		this.name = name;
		this.cources = cs;
	}
	
	@Override
	public String toString(){
		return rollnumber + ":"  + name + ":"+ cources;
	}
}

public class Test158 {

	public static void main(String[] args) {
		List cs = new ArrayList();
		cs.add("Java");
		cs.add("C");
		Student s = new Student(123, "Fred",cs);
		System.out.println(s);

	}

}
