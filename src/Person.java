abstract class Person {
    public abstract void person();
}

class Teacher extends Person {
    public void person() {
        System.out.println("I am a teeeeaacccharrr!");
    }
}

class Pilot extends Person{
    public void person() {
        System.out.println("I am a pilot");
    }
}

class main {
    public static void main(String[] args) {
        Teacher larry = new Teacher();
        Pilot john = new Pilot();
        larry.person();
        john.person();
        System.out.println("");
        // Interface
        Cow cow = new Cow();
        Sparrow sparrow = new Sparrow();
        cow.makeSound();
        System.out.println("");
        sparrow.type();
        sparrow.makeSound();
    }
}
