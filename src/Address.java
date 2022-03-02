public class Address {
    private String streetName;
    private String streetNumber;
    private String apartmentNumber;
    private String city;
    private String state;
    private int zipCode;

    public Address(Address a)
    {
        streetName = a.getStreetName();
        streetNumber = a.getStreetNumber();
    }

    public String getStreetName()
    {
        return streetName;
    }

    public String getStreetNumber()
    {
        return streetNumber;
    }

    public String getApartmentNumber()
    {
        return apartmentNumber;
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

    public int getZipCode()
    {
        return zipCode;
    }
}

