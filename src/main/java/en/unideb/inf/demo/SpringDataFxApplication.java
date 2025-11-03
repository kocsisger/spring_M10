package en.unideb.inf.demo;

import en.unideb.inf.demo.model.Person;
import en.unideb.inf.demo.model.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataFxApplication implements CommandLineRunner {

	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataFxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person p = new Person();
		p.setName("John");
		p.setDateOfBirth(LocalDate.of(1990,1,1));

		personRepository.save(p);
	}
}
