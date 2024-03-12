package Encapsulation; 

public class Main {
    public static void main(String[] args) {

        //Encapsulation = atributes of the class will be private or hidden
        //Can only be accessed with methods, the getters and setters
        
        //Gun Object With Attributes
        Gun gun1 = new Gun("Vandal", "Rifle","Sentinels of Light", 25, 50);

        //Gun Object With no Attributes 
        Gun gun2 = new Gun(null, null, null, 0, 0);

        //Get Attributes of Gun 1
        System.out.println("Gun 1:");
        System.out.println(gun1.getName());
        System.out.println(gun1.getType());
        System.out.println(gun1.getSkin());
        System.out.println(gun1.getBullets());
        System.out.println(gun1.getSpare());

        //Spacing
        System.out.println();
        
        //Set Attribute
        gun2.setName("Odin");
        gun2.setType("Machine Gun");
        gun2.setSkin("Prime");
        gun2.setBullets(100);
        gun2.setSpare(200);

        //Get Attributes of Gun2
        System.out.println("Gun 2:");
        System.out.println(gun2.getName());
        System.out.println(gun2.getType());
        System.out.println(gun2.getSkin());
        System.out.println(gun2.getBullets());
        System.out.println(gun2.getSpare());
    }
}
