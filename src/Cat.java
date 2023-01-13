public class Cat {
    private Object  nameCat;
    private Object  ageCat;
    private Object  colorCat;
    private Object  breedCat;
    private Object  masterCat;


    public Object getMasterCat() {
        return masterCat;
    }

    public void setMasterCat(Object masterCat) {
        this.masterCat = masterCat;
    }

    public Object getNameCat() {
        if(nameCat instanceof String) {
            return ((String) nameCat).trim();
        }
        else {
            nameCat = "Дайте стринговое значение !";
        }
        return nameCat;
    }

    public void setNameCat(Object nameCat) {
        this.nameCat = nameCat;
    }

    public Object getAgeCat() {
        if(ageCat instanceof Integer && (int)ageCat <= 10) {
            return ageCat;
        }
        else {
            ageCat = "Дайте числовое значение или кошки так долго не живут !";
        }
        return ageCat;
    }

    public void setAgeCat(Object ageCat) {
        this.ageCat = ageCat;
    }

    public Object getColorCat() {
        if (colorCat instanceof String){
        return colorCat;
        }else {
            colorCat = "Дайте стринговое значение !";
        }
        return colorCat;
    }

    public void setColorCat(Object colorCat) {
        this.colorCat = colorCat;
    }

    public Object getBreedCat() {
        if (breedCat instanceof String){
            return breedCat;
        }else {
            breedCat = "Дайте стринговое значение !";
        }
        return breedCat;
    }

    public void setBreedCat(Object breedCat) {
        this.breedCat = breedCat;
    }
    static void sayCat(){
        System.out.println("мяу-мяу мяу-мяу");
    }
    static void runCat(){
        System.out.println("Кот бежит!");
    }
    static void sleepingCat(){
        System.out.println("Кот спит!");
    }
    static void eatingCat(){
        System.out.println("Кот есть!");
    }




}

