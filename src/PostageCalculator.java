public class PostageCalculator {

    public static double calculatePostage(int z1, int z2, double w)
    {
        double cost = 3.75;
        if(w > 40)
        {
            cost += (40/0.1) * .05;
            cost += ((w-40)/.1) * .1;
        }
        else
        {
            cost += (w/0.1) * .05;
        }
        String zip1 = z1 + "";
        String zip2 = z2 + "";
        cost += Math.abs(Integer.parseInt(zip1.substring(0,3)) - Integer.parseInt(zip2.substring(0,3)))/100.0;
        return cost;
    }

    public static double calculatePostage(Address a, Address b, double w)
    {
        double cost = 3.75;
        if(w > 40)
        {
            cost += (40/0.1) * .05;
            cost += ((w-40)/.1) * .1;
        }
        else
        {
            cost += (w/0.1) * .05;
        }
        String zip1 = a.getZipCode() + "";
        String zip2 = b.getZipCode() + "";
        cost += Math.abs(Integer.parseInt(zip1.substring(0,3)) - Integer.parseInt(zip2.substring(0,3)))/100.0;
        return cost;
    }

    public static double calculatePostage(Package a)
    {
        double cost = 3.75;
        if(a.getWeight() > 40)
        {
            cost += (40/0.1) * .05;
            cost += ((a.getWeight()-40)/.1) * .1;
        }
        else
        {
            cost += (a.getWeight()/0.1) * .05;
        }
        if(a.getLength() + a.getWidth() + a.getHeight() > 36)
        {
            cost += (a.getWidth() + a.getLength() + a.getHeight() - 36) * 0.1;
        }
        String zip1 = a.getOrigin().getZipCode() + "";
        String zip2 = a.getDestination().getZipCode() + "";
        cost += Math.abs(Integer.parseInt(zip1.substring(0,3)) - Integer.parseInt(zip2.substring(0,3)))/100.0;
        return cost;
    }

}
