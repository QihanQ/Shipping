public class Test {
    public static void main(String[] args)
    {
        System.out.println("Test 1: ");
        Address a = new Address("1313 Mockingbird Lane Apt 6A, Springfield, MO 65123");
        Address b = new Address("1313 Mockingbird Lane, Springfield, MO 65123");
        double w = 36;
        System.out.println("Ship from: " + a.toString());
        System.out.println("Ship to: " + b.toString());
        System.out.println("Package Weight: " + w);
        System.out.println("Actual cost: " + PostageCalculator.calculatePostage(a,b,w));
        System.out.println("Expected cost: 21.75");

        System.out.println("--------");

        System.out.println("Test 2: ");
        Address c = new Address("1313 Mockingbird Lane Apt 6A, Springfield, MO 65123");
        Address d = new Address("1432 Mocking Lane, Springfield, MO 60123");
        double w2 = 45;
        System.out.println("Ship from: " + c.toString());
        System.out.println("Ship to: " + d.toString());
        System.out.println("Package Weight: " + w2);
        System.out.println("Actual cost: " + PostageCalculator.calculatePostage(c,d,w2));
        System.out.println("Expected cost: 29.25");

        System.out.println("--------");

        System.out.println("Test 3: ");
        Address e = new Address("1313 Mockingbird Lane Apt 6A, Springfield, MO 65123");
        Address f = new Address("1432 Mocking Lane, Springfield, MO 60123");
        double w3 = 45;
        Package p = new Package(e,f,w3,10,15,20);
        System.out.println("Ship from: " + p.getOrigin());
        System.out.println("Ship to: " + p.getDestination());
        System.out.println("Package Weight: " + p.getWeight());
        System.out.println("package Dimensions: Length: " + p.getLength() + " Width: " + p.getWidth() + " Height: " + p.getHeight());
        System.out.println("Actual cost: " + PostageCalculator.calculatePostage(p));
        System.out.println("Expected cost: 30.15");
    }
}
