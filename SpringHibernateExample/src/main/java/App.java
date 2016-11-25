import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.momentum.example3.dao.PersonDAO;
import com.momentum.example3.model.Person;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		
		Person person = new Person();
		person.setName("Juan");
		person.setCountry("Colmbie");
		personDAO.save(person);
		
		System.out.println("Person: "+person);
		
		List<Person> list = personDAO.list();
		
		for (Person person2 : list) {
			System.out.println("Person List: "+person2);
		}
		
		context.close();
	}

}
