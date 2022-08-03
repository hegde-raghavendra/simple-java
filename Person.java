public class Person {

    private String name;
    private int age;
    private Boolean isEmployed;

    public Person(String name, int age) {

        this.age = age;
        this.name = name;
        
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    
    public Boolean getIsEmployed() {
        return isEmployed;
    }

    public void setIsEmployed(Boolean isEmployed) {
        this.isEmployed = isEmployed;
    }

    public void celebrateBirthday() {
        this.age = this.age + 1;
    }

    
}
