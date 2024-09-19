package Ycollections.dominio;

import java.util.Comparator;
import java.util.Objects;

public class Magazine implements Comparable<Magazine> {
    private Long id;
    private String name;
    private Double price;

    public Magazine(Long id, String name, Double price) {
        Objects.requireNonNull(id, "ID cannot be null");
        Objects.requireNonNull(name, "Name cannot be null");
        Objects.requireNonNull(price, "Price cannot be null");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Magazine magazineObj = (Magazine) obj;
        return Objects.equals(id, magazineObj.id) &&
                Objects.equals(name, magazineObj.name) &&
                Objects.equals(price, magazineObj.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price) ;
    }

    @Override
    public int compareTo(Magazine o) {
        // sortByPrice
        //return this.price.compareTo(o.getPrice());

        // sortByName
        return this.name.compareTo(o.getName());

        // sortById
        //return this.id.compareTo(o.getId());
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
