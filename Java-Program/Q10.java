//Question:
Fix the missing constructor issue.

class Person {
    String name;
}
public class ConstructorError {
    public static void main(String[] args) {
        Person p = new Person("John");
        System.out.println(p.name);
    }
}

//Expected Output:
    John
