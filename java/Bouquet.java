public class Bouquet {
    String theme;
    Flower flower;
    int numOfFlowers;

    Bouquet(String theme, Flower flower, int numOfFlowers) {
        this.flower = flower;
        this.numOfFlowers = numOfFlowers;
        this.theme = theme;
    }

    public Flower getFlower() {
        return flower;
    }

    public int getNumOfFlowers() {
        return numOfFlowers;
    }

    public String getTheme() {
        return theme;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public void setNumOfFlowers(int numOfFlowers) {
        this.numOfFlowers = numOfFlowers;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public double getCost() {
        return flower.getUnitPrice() * getNumOfFlowers();

    }
}
