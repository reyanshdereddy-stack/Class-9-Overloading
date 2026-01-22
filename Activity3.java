class Superclass {
    int number = 5;
}
class Subclass extends Superclass {
    int number = 8;
    public void show(){
        System.out.println(number);
    }
}
class Activity3 {
    public static void main(String[] args) {
        Subclass sub = new Subclass();
        sub.show();
    }
}