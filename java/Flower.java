public class Flower {
    String color;
    String name;
    double unitPrice;
    Flower(String color,String name,double unitPrice){
        this.color=color;
        this.name=name;
        this.unitPrice=unitPrice;
    }

    public String getName() {
        return name;
    }
    public String getColor(){
        return color;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice=unitPrice;
    }
}
