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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(id, magazine.id) && Objects.equals(name, magazine.name) && Objects.equals(price, magazine.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Magazine o) {
        // negativo se o this < o
        // se this == o, return 0
        // positivo se this > o
//        if(this.id < o.getId()){
//            return -1;
//        } else if(this.id.equals(o.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }

        // sortById
        //return this.id.compareTo(o.getId());

        // sortByName
        return this.name.compareTo(o.getName());

        // sortByPrice
        //return Double.valueOf(this.price).compareTo(o.getPrice());

    }
}
