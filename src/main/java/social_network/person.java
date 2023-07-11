package social_network;

public class person {
    private String  name;
    private int age;
    private gender gender;

    public person(String name, int age, social_network.gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public social_network.gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
