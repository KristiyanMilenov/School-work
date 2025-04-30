class Human {
    String name;

    Human(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println(name + " says: Hello");
    }

    void displayDetails() {
        System.out.println("Name: " + name);
    }
}
class American extends Human {
    American(String name) {
        super(name);
    }

    @Override
    void sayHello() {
        System.out.println(name + " says: Hello");
    }

    @Override
    void displayDetails() {
        System.out.println("American Name: " + name);
    }
}

class French extends Human {
    French(String name) {
        super(name);
    }

    @Override
    void sayHello() {
        System.out.println(name + " says: Bonjour");
    }

    @Override
    void displayDetails() {
        System.out.println("French Name: " + name);
    }
}

class Japanese extends Human {
    Japanese(String name) {
        super(name);
    }

    @Override
    void sayHello() {
        System.out.println(name + " says: Konnichiwa");
    }

    @Override
    void displayDetails() {
        System.out.println("Japanese Name: " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        Human[] people = new Human[3];
        people[0] = new American("John");
        people[1] = new French("Marie");
        people[2] = new Japanese("Hiro");


        for (Human person : people) {
            person.displayDetails();
            person.sayHello();
            System.out.println();
        }
    }
}