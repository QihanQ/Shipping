public class Address {
    private String streetName;
    private String streetNumber;
    private String apartmentNumber;
    private String city;
    private String state;
    private int zipCode;
    
    public Address(String sNa, String sNu, String aN, String c, String s, int z)
    {
        streetName = sNa;
        streetNumber = sNu;
        apartmentNumber = aN;
        city = c;
        state = s;
        zipCode = z;
    }
    
    public Address(Address a)
    {
        streetName = a.getStreetName();
        streetNumber = a.getStreetNumber();
        apartmentNumber = a.getApartmentNumber();
        city = a.getCity();
        state = a.getState();
        zipCode = a.getZipCode();
    }
    
    public Address(String s)
    {
        streetNumber = s.substring(0 , s.indexOf(" ");
        s = s.substring(s.indexOf(" ") + 1);
        if(s.indexOf("Apt") != -1)
        {
            streetName = s.substring(0 , s.indexOf("Apt));
            s = s.substring(s.indexOf("Apt"));
            apartmentNumber = s.substring(s.indexOf(" ") + 1 , s.indexOf(","));
            s = s.substring(s.indexOf(",") + 1);
        }
        else
        {
            streetName = s.substring(0 , s.indexOf(","));
            s = s.substring(s.indexOf(",") + 1);
        }
        
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

