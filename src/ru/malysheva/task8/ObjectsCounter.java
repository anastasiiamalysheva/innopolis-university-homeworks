package ru.malysheva.task8;

public class ObjectsCounter {

    static int counter = 0;

    public ObjectsCounter() {
        counter++;
    }

    public static void main(String[] args) {

        ObjectsCounter object1 = new ObjectsCounter();
        ObjectsCounter object2 = new ObjectsCounter();
        ObjectsCounter object3 = new ObjectsCounter();

        System.out.println(ObjectsCounter.counter);
    }

}
