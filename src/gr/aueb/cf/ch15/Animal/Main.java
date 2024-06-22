package gr.aueb.cf.ch15.Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Jack", 3, "York");
        // this is an instance of a dog

        dog.makeSound();
        dog.searchForFood();

        System.out.println("Name: " + dog.getName()
                + "Age: " +dog.getAge()
                + "Breed: " +dog.getBreed());



    }
}
