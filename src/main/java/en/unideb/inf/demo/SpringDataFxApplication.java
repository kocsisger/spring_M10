package en.unideb.inf.demo;

import en.unideb.inf.demo.model.Person;
import en.unideb.inf.demo.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataFxApplication implements CommandLineRunner {

	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataFxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person p = new Person();
		p.setName("John");
		p.setDateOfBirth(LocalDate.of(1990,1,1));

		Person p2 = Person.builder()
				.name("Anna")
				.dateOfBirth(LocalDate.of(2003,11,03))
				.build();

		personRepository.save(p);
		personRepository.save(p2);
	}

	public void printPersons(){
		for (Person p : personRepository.findAll()){
			System.out.println(p);
		}
	}
}
