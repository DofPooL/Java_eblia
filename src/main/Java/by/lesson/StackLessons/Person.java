package by.lesson.StackLessons;

import java.util.Objects;

public class Person {
    private Long id;
    private String firstName;
    private String secondName;
    private int age;

    public Person(Long id, String firstName, String secondName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}' +'\n';
    }

    public Long getId() {
        return id;
    }

}
