class Animal {
    public void speak() {
        System.out.println("Animal makes a generic sound");
    }
    //This is overloading becuase it uses the same method with different parameters. This is how overloading works.
    public void speak(String soundType) { 
        System.out.println("Animal makes a specific sound: " + soundType);
    }
    public void walk() {
        System.out.println("Animal is walking");
    }
}
class Dog extends Animal {
    @Override 
    //This is overriding because it overrides the "Dog" code and only runs the "Animal" code. This is how overriding works.
    public void walk() {
        System.out.println("Dog is running");
    }
}
class Afterclassproject {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        a.speak(); 
        a.speak("growl"); 
        a.walk();
        d.walk();
        d.speak();
    }
}
