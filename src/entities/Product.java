package entities;

public class Product {
    private String name;
    private Double price;
    private Integer quantyti;

    public Product(String name, Double price, Integer quantyti) {
        this.name = name;
        this.price = price;
        this.quantyti = quantyti;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantyti() {
        return quantyti;
    }

    public void setQuantyti(Integer quantyti) {
        this.quantyti = quantyti;
    }
    public double total(){
        return price * quantyti;

    }

}
