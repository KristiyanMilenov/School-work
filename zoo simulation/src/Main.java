public class Main {

    public static void main(String[] args) {
        zoo z1 = new zoo();
        z1.addAnimal();
        z1.addAnimal1();
        z1.addAnimal2();
        z1.addAnimal3();
        z1.addStaff();
        z1.addStaff1();
        z1.addStaff2();
        z1.addStaff3();
        z1.diplayinfo();


    }
}
class Animal{
    private String name;
    private String species;
    private int age;
    private Habitat habitat;

    public Animal(String name, String species, int age, Habitat habitat ){
        this.name = name;
        this.species=species;
        this.age = age;
        this.habitat=habitat;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void eat(String food,Staff staff) {

    }




}
class Habitat{
    private String type;
    private int size;
    private double temp;

    public Habitat(String type,int size,double temp){
        this.type = type;
        this.size = size;
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}

class Staff{
    private String name;
    private String role;
    private Habitat assignedhabitat;


    public Staff(String name,String role,Habitat assignedhabitat){
        this.name=name;
        this.role = role;
        this.assignedhabitat=assignedhabitat;
    }



    public String getName() {
        return name;
    }

    public Habitat getAssignedhabitat() {
        return assignedhabitat;
    }

    public String getRole() {
        return role;
    }

    }


class zoo{
    private Animal a1;
    private Animal a2;
    private Animal a3;
    private Animal a4;
    private Staff s1;
    private Staff s2;
    private Staff s3;
    private Staff s4;

   void addAnimal(){
       a1 = new Animal("leo","lion",5,new Habitat("Savannah",100,30.2));
   }
   void addAnimal1(){
       a2 = new Animal("cat","tiger",4,new Habitat("Savannah",70,31.4));
   }
   void addAnimal2(){
       a3 = new Animal("big","elephant",7,new Habitat("Desesrt",150,35.1));
   }
   void addAnimal3(){
       a4 = new Animal("bird","parrot",5,new Habitat("Rainforest",50,26.5));
   }
   void addStaff(){
       s1 = new Staff("John","Zookepeer",new Habitat("Savannah",100,30.2));
   }
   void addStaff1(){
       s2 = new Staff("Bob","Specialist",new Habitat("Savannah",70,31.4));
   }
   void addStaff2(){
       s3 = new Staff("Rob","Cleaner",new Habitat("Desesrt",150,35.1));
   }
   void addStaff3(){
       s4 = new Staff("Mat","Zookepeer",new Habitat("Rainforest",50,26.5));
   }

    public void diplayinfo(){
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

    public Animal getA1() {
        return a1;
    }

    public Animal getA2() {
        return a2;
    }

    public Animal getA3() {
        return a3;
    }

    public Animal getA4() {
        return a4;
    }

    public Staff getS1() {
        return s1;
    }

    public Staff getS2() {
        return s2;
    }

    public Staff getS3() {
        return s3;
    }

    public Staff getS4() {
        return s4;
    }
}

