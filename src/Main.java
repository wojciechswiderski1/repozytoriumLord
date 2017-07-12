import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by RENT on 2017-07-10.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList (
                new Person("Bartek", "Wolniak", 23, 1.8f, "trochę mądry" ),
                new Person("Wojtek", "Kowalski", 20, 1.7f, "ma zeza" ),
                new Person("Adam", "Nowak", 29, 1.9f, "mądry" ),
                new Person("Erwin", "Żebro", 21, 1.8f, "mało mądry" )
        );

        Optional<Person> optionalPerson = persons.stream()
                .filter(s -> s.getName().equals("Adam") && s.getSurname().equals("Nowak"))
                .findFirst();
        System.out.println(optionalPerson.toString());

        if(optionalPerson.isPresent()) {
            System.out.println(optionalPerson.get());
        }

        boolean elementIsPresent = persons.stream()
                .anyMatch(s -> s.getSurname().equals("Kowalski"));
        System.out.println("Czy w liście osób jest nazwisko Kowalski? " +elementIsPresent);

        boolean elementIsPresent2 = persons.stream()
                .allMatch(s -> s.getHeight() < 2.f);
        System.out.println("Czy w liście osób jest nazwisko Kowalski? " +elementIsPresent2);

        List <Person> sortedPerson = persons.stream()
                .sorted((p1, p2) ->
                p1.getSurname().compareTo(p2.getSurname())
                ).collect(Collectors.toList());
        sortedPerson.stream().forEach(p -> System.out.println(p));



    }
    
    public String () {
        
    }
}
