public class Package {
    private Address origin;
    private Address destination;
    private double weight;
    private double length;
    private double width;
    private double height;

    public Package(Address o, Address d, double w , double len, double wid, double hei)
    {
        origin = o;
        destination = d;
        weight = w;
        length = len;
        width = wid;
        height = hei;
    }

    public Address getOrigin()
    {
        return origin;
    }

    public Address getDestination()
    {
        return destination;
    }

    public double getWeight()
    {
        return weight;
    }

    public double getLength()
    {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
