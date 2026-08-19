class Person {
    String name;
    int age;

    void walk() {
        System.out.println(name + " is walking");
    }
}

class Student extends Person {
}

interface Sport {
    void play();
}

class SportStudent extends Student implements Sport {

    public void play() {
        System.out.println(name + " is playing");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        SportStudent s = new SportStudent();

        s.name = "Mrunmayee";
        s.age = 18;

        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);

        s.walk();
        s.play();
    }
}