public class Fish {

    private String  nameFish;
    private int ageFish;
    private String breedFish;
    private String ownerFish;

    public String getNameFish() {
        return nameFish;
    }

    public int getAgeFish() {
        return ageFish;
    }

    public String getBreedFish() {
        return breedFish;
    }

    public String getOwnerFish() {
        return ownerFish;
    }

    public void setNameFish(String nameFish) {
        this.nameFish = nameFish;
    }

    public void setAgeFish(int ageFish) {
        this.ageFish = ageFish;
    }

    public void setBreedFish(String breedFish) {
        this.breedFish = breedFish;
    }

    public void setOwnerFish(String ownerFish) {
        this.ownerFish = ownerFish;
    }
    static String sayFish(){
        return "bruk-bruk, bruk-bruk";
    }
}
