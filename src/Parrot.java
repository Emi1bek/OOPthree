public class Parrot {


    private String  nameParrot;
    private int ageParrot;
    private String breedParrot;
    private String ownerParrot;

    public String getNameParrot() {
        return nameParrot;
    }

    public int getAgeParrot() {
        return ageParrot;
    }

    public String getBreedParrot() {
        return breedParrot;
    }

    public String getOwnerParrot() {
        return ownerParrot;
    }

    public void setNameParrot(String nameParrot) {
        this.nameParrot = nameParrot;
    }

    public void setAgeParrot(int ageParrot) {
        this.ageParrot = ageParrot;
    }

    public void setBreedParrot(String breedParrot) {
        this.breedParrot = breedParrot;
    }

    public void setOwnerParrot(String ownerParrot) {
        this.ownerParrot = ownerParrot;
    }

   static String sayParrod(){
        return "Kruk-Kruk, kruk-kruk";
    }
}
