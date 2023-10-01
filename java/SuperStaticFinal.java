//Write a java program to illustrate the keywords i)super ii)static iii)final
class Animal {
    String color = "red";
    int num = 10;

}
class Rabbit extends Animal {
    String color = "green";
    int num  = 20;


    void display(){
        System.out.println("Color: " + super.color);
    }
}

class Students{
    static String name = "Rohin";
    static final int num = 10;
    static void names(){
        System.out.println(name);
    }

}



public class SuperStaticFinal  extends Students{
    public static void main(String[] args) {
        Rabbit obj1 = new Rabbit();
        obj1.display();
        names();        
    
}
}
