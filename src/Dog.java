public class Dog {
    private String  nameDog;
    private int ageDog;
    private String breedDog;
    private String ownerDog;

    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }

    public void setAgeDog(int ageDog) {
        this.ageDog = ageDog;
    }

    public void setBreedDog(String breedDog) {
        this.breedDog = breedDog;
    }

    public void setOwnerDog(String ownerDog) {
        this.ownerDog = ownerDog;
    }

    public String getNameDog() {
        return nameDog;
    }

    public int getAgeDog() {
        return ageDog;
    }

    public String getBreedDog() {
        return breedDog;
    }

    public String getOwnerDog() {
        return ownerDog;
    }

    static void sayDog(){
        System.out.println("gaf-gaf-gaf-gaf");
    }
    String eatDog(){
        return "Собака есть!";
    }
    String runDog(){
        return "Собака бежить!";
    }
    String sleepDog(){
        return "Собака спит!";
    }
}
