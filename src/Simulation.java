import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    public static void main(String[] args)
    {
        System.out.println("Would you like to simulate packages(1) or calculate the cost of a package(2)?");
        Scanner input = new Scanner(System.in);
        int choice = Integer.parseInt(input.nextLine());
        while(choice != 1 && choice != 2)
        {
            System.out.println("Please input a correct option: ");
            choice = Integer.parseInt(input.nextLine());
        }
        if(choice == 1)
        {
            ArrayList<Package> all = new ArrayList<Package>();
            int[] zip = {11201,11202,11203,11204,11205,11206,11207,11208,11209,11210,11211,11212,11213,11214,11215,11216,11217,11218,11219,11220,11221,11222,11223,11224,11225,11226,11228,11229,11230,11231,11232,11233,11234,11235,11236,11237,11238,11239,11241,11242,11243,11245,11247,11249,11251,11252,11256};
            System.out.println("How many packages would you like to simulate?");
            Scanner i = new Scanner(System.in);
            int n = Integer.parseInt(i.nextLine());
            for(int num = 1; num <= n; num++)
            {
                int rand1 = (int)(Math.random() * zip.length);
                int rand2 = (int)(Math.random() * zip.length);
                Address e = new Address("1313 Mockingbird Lane Apt 6A, Brooklyn, NY " + zip[rand1]);
                Address f = new Address("1432 Mocking Lane, Brooklyn, NY " + zip[rand2]);
                double weight = (int)(Math.random() * 45 + 1);
                Package p = new Package(e,f,weight,10,20,30);
                all.add(p);
                System.out.println("Simulation " + num + ":");
                System.out.println("Ship from: " + p.getOrigin());
                System.out.println("Ship to: " + p.getDestination());
                System.out.println("Package Weight: " + p.getWeight());
                System.out.println("Package Dimensions: Length: " + p.getLength() + " Width: " + p.getWidth() + " Height: " + p.getHeight());
                System.out.println("Cost: " + PostageCalculator.calculatePostage(p));
                System.out.println("------------");
            }
        }
        else
        {
            System.out.println("What is the address you are shipping from?");
            System.out.println("Please input it in this format: Street number Street name Apt Number (optional), City, State Zip");
            Scanner i = new Scanner(System.in);
            String s = i.nextLine();
            Address a = new Address(s);
            System.out.println("What is the address you are shipping to?");
            String t = i.nextLine();
            Address b = new Address(t);
            System.out.println("How heavy is the package?");
            double w = i.nextDouble();
            if(w < .1)
            {
                while(w < .1)
                {
                    System.out.println("The weight must be greater than 0.1 pounds.");
                    w = i.nextDouble();
                }
            }
            System.out.println("What is the length of the package?");
            double len = i.nextDouble();
            if(len < 2)
            {
                while(len < 2)
                {
                    System.out.println("The length must be at least 2 inches.");
                    len = i.nextDouble();
                }
            }
            System.out.println("What is the width of the package?");
            double wid = i.nextDouble();
            if(wid < 2)
            {
                while(wid < 2)
                {
                    System.out.println("The width must be at least 2 inches.");
                    wid = i.nextDouble();
                }
            }
            System.out.println("What is the height of the package?");
            double height = i.nextDouble();
            if(height < 2)
            {
                while(height < 2)
                {
                    System.out.println("The height must be at least 2 inches.");
                    height = i.nextDouble();
                }
            }
            Package p = new Package(a,b,w,len,wid,height);
            System.out.println("Ship from: " + p.getOrigin());
            System.out.println("Ship to: " + p.getDestination());
            System.out.println("Package Weight: " + p.getWeight());
            System.out.println("Package Dimensions: Length: " + p.getLength() + " Width: " + p.getWidth() + " Height: " + p.getHeight());
            System.out.println("Cost: " + PostageCalculator.calculatePostage(p));
        }
    }

}
