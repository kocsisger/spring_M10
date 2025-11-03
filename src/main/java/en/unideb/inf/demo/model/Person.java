package en.unideb.inf.demo.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Person {
    long id;
    String name;
    LocalDate dateOfBirth;
}
