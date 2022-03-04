public class Address {
    private String streetName;
    private String streetNumber;
    private String apartmentNumber = "";
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
        streetNumber = s.substring(0 , s.indexOf(" "));
        s = s.substring(s.indexOf(" ") + 1);
        if(s.indexOf("Apt") != -1)
        {
            streetName = s.substring(0 , s.indexOf("Apt") - 1);
            s = s.substring(s.indexOf("Apt"));
            apartmentNumber = s.substring(s.indexOf(" ") + 1 , s.indexOf(","));
            s = s.substring(s.indexOf(",") + 2);
        }
        else
        {
            streetName = s.substring(0 , s.indexOf(","));
            s = s.substring(s.indexOf(",") + 2);
        }
        city = s.substring(0, s.indexOf(","));
        s = s.substring(s.indexOf(",") + 2);
        state  = s.substring(0, s.indexOf(" "));
        s = s.substring(s.indexOf(" ") + 1);
        zipCode = Integer.parseInt(s);
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

    public boolean compareAddress(Address a)
    {
        if(streetName != a.getStreetName())
        {
            return false;
        }
        if(streetNumber != a.getStreetNumber())
        {
            return false;
        }
        if(apartmentNumber != a.getApartmentNumber())
        {
            return false;
        }
        if(city != a.getCity())
        {
            return false;
        }
        if(state != a.getState())
        {
            return false;
        }
        if(zipCode != a.getZipCode())
        {
            return false;
        }
        return true;

    }

    public String toString()
    {
        String f = streetNumber + " " + streetName;
        if(apartmentNumber != "")
        {
            f += " Apt " + apartmentNumber;
        }
        f+= ", " + city + ", " + state + " " + zipCode;
        return f;
    }

}

