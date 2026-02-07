package Application;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World");
        String name;
        int age;
        boolean female;

        name = "Luisa";
        age = 31;
        female = true;

        System.out.println("my nameis " + name);
        System.out.println( "I am " + age + " years old");
        System.out.println( "Am I female? " + female);

        final int CURRENTYEAR= 2026;
        int birthYear = 1995; //Mayuscula por ser una constante e inicia por final
        int calculateAge= CURRENTYEAR - birthYear;
        System.out.println( "Calculated age: " + calculateAge);

        for (int i = 1; i<= 10;i++ ) {
            System.out.println("Itineration: " + i);
        }



    }
}
