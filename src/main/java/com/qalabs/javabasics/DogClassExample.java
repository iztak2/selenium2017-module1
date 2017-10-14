package com.qalabs.javabasics;
class Dog {
    private String name;
    private int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return String.format("%s has %d years", this.name, this.age);
    }

    public int ageToDogYear(int HumanAge){
        int DogAge;
        DogAge = HumanAge/7;
        return DogAge;
    }
}




public class DogClassExample {

    public static void main (String[] args) {
        Dog myDog = new Dog("Patches", 4);
        //myDog.getAge();
        System.out.println("El Nombre de my perro es.-" + myDog.getName());
        System.out.println("Sus años en perro son.-" + myDog.getAge());
        //System.out.println(myDog.toString());
    }
}
