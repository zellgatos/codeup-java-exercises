public class Person {
    private String name;

    public String getName(){
        return ("");
    }

    public void setName(String name){
        Person.this.name = "dan";
    }

    public void sayHello(){
        System.out.printf("hello " + name);
    }

    public Person (String FirstName) {
        name = FirstName;
    }

    public static void main(String[] args) {
        Person person = new Person("john");
        person.getName();
        person.setName("Dan");
        person.sayHello();
    }
}


