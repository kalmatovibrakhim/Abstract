package animal;

public class Horse extends Animal {
    public Horse() {
    }
    public Horse(int weigth,int age, String gender ,String nickname) {
        super(weigth,age,gender,nickname);
    }

    @Override
    public String getNickname() {
        return super.getNickname();
    }

    @Override
    public void setNickname(String nickname) {
        super.setNickname(nickname);
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public String toString() {
        return "Horse{" +super.getWeight()+"\t"+super.getAge()+"\t"+super.getGender()+"\t"+super.getNickname()+"}";
    }

}
