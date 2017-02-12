package ex041;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test64 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(21);
		list.add(13);
		list.add(30);
		list.add(11);
		list.removeIf(m->m%2 != 0);
		list.removeIf(new Predicate<Integer>(){

			@Override
			public boolean test(Integer m) {
				// TODO Auto-generated method stub
				return m%2!=0;
			}
			
		});
		System.out.println(list);

	}

}
