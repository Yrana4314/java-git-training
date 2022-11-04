package day1.bank;

public class CustomerAddress {
    //STATES

    private String streetNumAndName;
    private String aptNumber;
    private String city;
    private int zipCode;
    private String state;
    private String poBoxNum;


    public CustomerAddress(String streetNumAndName,
                           String aptNumber, String city, int zipCode, String state, String poBoxNum) {
        this.streetNumAndName = streetNumAndName;
        this.aptNumber = aptNumber;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
        this.poBoxNum = poBoxNum;
    }

    public void setStreetNumAndName(String streetNumAndName) {
        this.streetNumAndName = streetNumAndName;
    }

    public void setAptNumber(String aptNumber) {
        this.aptNumber = aptNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPoBoxNum(String poBoxNum) {
        this.poBoxNum = poBoxNum;
    }

    public String getStreetNumAndName() {
        return streetNumAndName;
    }

    public String getAptNumber() {
        return aptNumber;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getState() {
        return state;
    }

    public String getPoBoxNum() {
        return poBoxNum;
    }
}
