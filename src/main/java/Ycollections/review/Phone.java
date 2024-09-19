package Ycollections.review;

public class Phone {
    private String serialNumber;
    private String model;

    public Phone(String serialNumber, String model) {
        this.serialNumber = serialNumber;
        this.model = model;
    }

    // se x.equals(y) == true, logo, x.hashCode() == y.hashCode()
    // y.hashCode() == x.hashCode(), nao necessariamento y.equals(x) tem que ser true
    // x.equals(y) == false, hashCode() serao !=
    // y.hashCode() != x.hashCode() serao false
    @Override
    public int hashCode() {
        return serialNumber == null? 0 : this.serialNumber.hashCode();
    }

    //Reflexive x.equals(x) == true x!=null
    //symetric x.equals(y) == true, logo y.equals(x) == true x!=null
    // transitive x, y ,z != null
    //Consistent x.equals(x) sempre true, x!= null
    // x!=null, x.equals(null) == false
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return  false;
        if(this == obj) return true;
        if(this.getClass() == obj.getClass());
        Phone phone = (Phone) obj;

        return serialNumber != null && serialNumber.equals(phone.serialNumber);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
