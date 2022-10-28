package ua.com.hrv.task_2;

public class Person {
    private String name;
    private int age;

    public Person( int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        Person.this.age = 27;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
