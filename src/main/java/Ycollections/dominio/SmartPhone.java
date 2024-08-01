package Ycollections.dominio;

public class SmartPhone {

    private String serialNumber;
    private String model;

    public SmartPhone(String serialNumber, String model){
        this.serialNumber = serialNumber;
        this.model = model;
    }

    // 1 Reflexivo: x.equals(x) true, para tudo que for diferente de null
    // 2 Simetrico: para x e y != de null, se x.equals(y) == true logo, y.equals(x) == true
    // 3 Transitividade: para x, y e z != nulll, se x.equals(y) == true, y.equals(z) == true, logo, x.equals(z) == true
    // 4 Consistente: x.equals(x) sempre retorna true se x != null
    // para x != null, se x.equals(null) == false
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        SmartPhone smartPhone = (SmartPhone) obj;
        return serialNumber != null && serialNumber.equals(smartPhone.serialNumber);

    }

    // se x.equals(y) == true, y.hashCode() == x.hashCode() true
    // y.hashCode() = x.hashCode() NAO necessariamento o y.equals(x) será true
    // x.equals(y) == false -> hachCode sera !=
    // y.hashCode() != x.hashCode() x.equals(y) sera false
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
