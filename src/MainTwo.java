import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        CatTwo cat = new CatTwo();
        Person person = new Person();
        cat.setNameCat("Sasha");
        cat.setAgeCat(9);
        cat.setWeight(22.2);
        cat.setOwner("Эмилбек");


        person.setNamePerson("Эмилбек");
       person.setlastPerson("Эргешали уулу");


        if (person.getNamePerson() == cat.getOwner()) {
            System.out.println(person.getNamePerson()+" хозяин "+" этого кота "+cat.getNameCat());
        }else{
            System.out.println("Бездомный! ");
        }



    }
    void PersonCat(){
    }
}
