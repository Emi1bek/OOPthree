import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Parrot parrot = new Parrot();
        Scanner sc = new Scanner(System.in);
            cat.setNameCat("Tom");
            cat.setAgeCat(2);
            cat.setColorCat("yellow");
            cat.setBreedCat("Gavana");

            dog.setNameDog("Alabay");
            dog.setAgeDog(3);
            dog.setBreedDog("bul'dog");
            dog.setOwnerDog("Sapar");

            fish.setNameFish("Nemo");
            fish.setAgeFish(1);
            fish.setBreedFish("Vid Fish");
            fish.setOwnerFish("Nikolay");

            parrot.setNameParrot("Baltun");
            parrot.setAgeParrot(2);
            parrot.setBreedParrot("Sosna");
            parrot.setOwnerParrot("Sasha");



//
//            System.out.println(cat.getNameCat());
//            System.out.println(cat.getAgeCat());
//            System.out.println(cat.getColorCat());
//            System.out.println(cat.getBreedCat());


            System.out.println("Поиграем с котом да (д) или нет(н)\n");
            String a = sc.next();
            if (a.contains("д")) {
                System.out.println("выбирите от 1 до 4?");
                int b = sc.nextInt();
                switch (b) {
                    case 1:
                        System.out.print("Кот по имени "+cat.getNameCat()+" обшается ");
                        Cat.sayCat();
                        break;
                    case 2:
                        System.out.print("Собака по имени "+dog.getNameDog()+" обшается ");
                        Dog.sayDog();
                        break;
                    case 3:
                        System.out.println("Рыба по имени "+fish.getNameFish()+" обшается "+Fish.sayFish());
                        break;
                    case 4:
                        System.out.println("Попугай по имени "+parrot.getNameParrot()+" обшается "+Parrot.sayParrod());
                        break;
                    default:
                        System.out.println("Вы вышли из рамки от 1 до 4");
                        break;
                }
            } else if (a.contains("н")) {
                System.out.println("Поиграме в след раз!");
            }
             else {
                System.out.println("Вас не могу понять! ");
            }

        }


}