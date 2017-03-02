/**
 * Created by Radershan on 02.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Person person = new Person();
        person.setName("Radershan");
        person.setEmail("Radershan@gmail.com");
        System.out.println(main.savePerson(person));
    }

    public Person savePerson(Person person){
        if (person==null){
            throw new IllegalArgumentException();
        }
        else{
            person.setId("P100");
            return person;
        }
    }
}
