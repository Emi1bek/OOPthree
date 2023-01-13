public class CatTwo {
    private String  nameCat;
    private int  ageCat;
    private double  weight;
    private String  owner;
    private Person  person;
//weight, owner, Person person);


    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public void setAgeCat(int ageCat) {
        this.ageCat = ageCat;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    public String getNameCat() {
        return nameCat;
    }

    public int getAgeCat() {
        return ageCat;
    }

    public Object getWeight() {
        return weight;
    }

    public Object getOwner() {
        return owner;
    }

    public Person getPerson() {
        return person;
    }
}
