public class Main {
    public static void main(String[] args) {
        // Task 6: Create more objects and test the methods
        Person p1 = new Person("Eda", "eda@gmail.com", "123-456-7890",20);
        p1.print();
        Person p2 = new Person("Hannah", "hannah@gmail.com", "404-899-9955",32);
        p2.print();

        p2.update("hannah32@gmail.com");
        p2.print();

    }
}

// Define the Person class here
class Person {
    // Instance variables
    private String name;
    private String email;
    private String phoneNumber;
    private int age;




    // Constructor: Initialize Person data
    public Person(String initName, String initEmail, String initPhone,int initage) { // Task 2: modify method signature to include your new attribute.
        name = initName;
        email = initEmail;
        phoneNumber = initPhone;
        age = initage;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Age: "+ age);


    }


    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getAge() {
        return age;
    }

    public void update(String newemail){
        email = newemail;

    }
   
}