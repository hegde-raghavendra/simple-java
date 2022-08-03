public class Family {

    public static void main(String[] args) {
        
        Person medha = new Person("Medha", 10);

        Person arya = new Person("Arya", 4);

        System.out.println(medha.getAge());
        
        System.out.println(arya.getAge());

        arya.celebrateBirthday();

        System.out.println(arya.getAge());

        medha.celebrateBirthday();

        System.out.println("setting isEmployed to null");
        medha.setIsEmployed(null);
        System.out.println("after settting isEmployed");

        System.out.println(medha.getAge());


    }
    
}
