package by.lesson.StackLessons;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Person> stackPersons = new ArrayList<>();

    public void push(Person person) {
        checkPersonOnNull(person);
        if (stackPersons.contains(person)) {
            throw new IllegalArgumentException("Данный объект c ID " + person.getId() + " уже существует");
        }
        stackPersons.add(person);
    }


    public Person peek() {
        return stackPersons.get(indexSize());
    }

    public Person pop() {
        return stackPersons.remove(indexSize());
    }

    private int indexSize() {
        int size = stackPersons.size();
        return size - 1;
    }

    private void checkPersonOnNull(Person person) {
        if (person == null) {
            throw new IllegalArgumentException("Данный объект пуст");
        }
    }

    @Override
    public String toString() {
        return "Массив{" +
                "Персонажи=" + stackPersons +
                '}';
    }
}

