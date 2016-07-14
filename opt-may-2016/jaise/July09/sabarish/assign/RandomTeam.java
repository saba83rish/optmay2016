package July09.sabarish.assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomTeam {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		List<Student> team1 = new ArrayList<>();
		List<Student> team2 = new ArrayList<>();
		list.add(new Student("Jaise", 1));
		list.add(new Student("Sooraj", 2));
		list.add(new Student("Abhilash", 3));
		list.add(new Student("Sankeerth", 4));
		list.add(new Student("Diana", 5));
		list.add(new Student("Anusha", 6));
		list.add(new Student("sharanya", 7));
		list.add(new Student("Kevin", 8));
		list.add(new Student("Nipul", 9));
		list.add(new Student("Venkatesh", 10));
		list.add(new Student("Roni", 11));
		list.add(new Student("Krishna", 12));
		Collections.shuffle(list);
		for (int i = 0; i <=list.size()-1; i++) {
			if (i % 2 == 0) {
				team1.add(list.get(i));
			}else
				team2.add(list.get(i));
			
		}
		System.out.println("team 1:\n");
		for (Student s : team1) {
			System.out.println(s);
		}
		System.out.println("\nteam 2:\n");
		for (Student s1 : team2) {
			System.out.println(s1);
		}

	}

}
