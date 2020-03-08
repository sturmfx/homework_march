
import java.util.Random;

public class Person
{
    static Random r = new Random();

    static String[] names = {};
    static String[] second_names = {};

    String name;
    String second_name;
    String email;

    public Person()
    {
        this.name = names[r.nextInt(names.length)];
        this.second_name = second_names[r.nextInt(second_names.length)];
        this.email = this.name + "." + this.second_name + r.nextInt(1000) + "@gmail.com";
    }
}
