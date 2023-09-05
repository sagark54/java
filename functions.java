public class functions {
    public static void main(String[] args) {
        String name = "Sagar";
        int age = 25;
        String hobbies = "coding";
        introduce(name, age, hobbies);
    }

    static void introduce(String name, int age, String hobbies) {
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("my hobbies is " + hobbies);
    }

}
