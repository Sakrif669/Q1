public class Address extends Object {

    private String street;
    private String city;
    private String county;

    public Address(String street, String city, String county) {
        setStreet(street);
        setCity(city);
        setCounty(county);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public String toString() {
        return "Address [street=" + street + ", city=" + city + ", county=" + county + "]";
    }
}