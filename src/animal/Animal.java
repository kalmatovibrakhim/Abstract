package animal;

public abstract class Animal {
    private int weight;
    private int age;
    private String gender;
    private String nickname;

    public Animal() {
    }

    public Animal(int weight, int age, String gender, String nickname) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
