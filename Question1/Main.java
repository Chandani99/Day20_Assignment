package Question1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Question3.Student;

public class Main {

	public static void main(String[] args) {
		List <Student> stls= new ArrayList<>();
		stls.add(new Student(12,"Van",950));
		stls.add(new Student(15,"Ch",780));
		stls.add(new Student(13,"Aati",630));
		stls.add(new Student(10,"Brijesh",710));
		stls.add(new Student(19,"Anubhav",810));

		List <Student> stNewList=stls.stream().filter(s->s.getMarks()<800).collect(Collectors.toList());
		
		for(Student stu:stNewList) {
			System.out.println(stu);
		}
	}

}
