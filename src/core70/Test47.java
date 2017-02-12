package core70;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test47 {
	public static void checkAge(List<Person>list, Predicate<Person> predicate){		
		for(Person p: list){
			if(predicate.test(p)){
				System.out.println(p.name + " ");
			}
		}
	}

	public static void main(String[] args) {
		List<Person> iList = Arrays.asList(new Person("Hank", 45),
									new Person("Charlie",40),
									new Person("Smith",38));
		//p->p.getAge() >40
//		checkAge(iList, (t) -> t.getAge() >40); //
	}

}
