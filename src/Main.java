import animal.Animal;
import animal.Cow;
import animal.Horse;
import animal.Sheep;
import farm.Farm;

public class Main {
    public static void main(String args[]){
        Animal sheep1 = new Sheep(30,2,"male","nick");
        Animal sheep2 = new Sheep(31,2,"female","barbara");
        Animal sheep3 = new Sheep(35,3,"male","john");
        Animal sheep4 = new Sheep(30,3,"female","jessy");
        Animal cow1 = new Cow(60,1,"male","pete");
        Animal cow2 = new Cow(75,2,"female","lucy");
        Animal cow3 = new Cow(85,4,"female","annie");
        Animal cow4 = new Cow(74,3,"male","paul");
        Animal cow5 = new Cow(78,3,"female","julie");
        Animal cow6 = new Cow(80,4,"female","sunny");
        Animal horse1 = new Horse(80,3,"female","anna");
        Animal horse2 = new Horse(89,4,"male","maksimus");
        Animal horse3 = new Horse(85,3,"female","kristine");
        Cow[] cows1 ={(Cow) cow1, (Cow) cow2, (Cow) cow3, (Cow) cow4, (Cow) cow5};
        Horse[] horses1 = {(Horse) horse1, (Horse) horse2};
        Sheep[] sheeps1 = {(Sheep) sheep1, (Sheep) sheep2, (Sheep) sheep3};


        Farm farm1 = new Farm("adress1",cows1,horses1,sheeps1,"OWNER1");
        Farm farm2 = new Farm("adress2",new Cow[]{(Cow) cow6},new Horse[]{(Horse) horse3},new Sheep[]{(Sheep) sheep4},"OWNER2");
        System.out.println(farm2);
        System.out.println(farm1);
    }
}

