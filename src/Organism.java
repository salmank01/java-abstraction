interface Organism {
    // interface methods are public and abstract by default
    public void makeSound();
}
interface Bird {
    void type();
}

class Cow implements Organism {
    public void makeSound(){
        System.out.println("Cow says Mooo!!");
    }
} //Interfaces allow multiple inheritence
class Sparrow implements Organism, Bird {
    public void type(){
        System.out.println("This is a sparrow");
    }
    public void makeSound() {
        System.out.println("Sparrow says Chirrup Chirrup");
    }
}
