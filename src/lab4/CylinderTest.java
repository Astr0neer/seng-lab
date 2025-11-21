package lab4;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.r + " " +cylinder.h);
        Cylinder cylinder1 = new Cylinder(10,20);
        System.out.println(cylinder1.r + " " +cylinder1.h);

        System.out.printf("Base Area: %.2f  Volume: %.2f  Surface Area: %.2f%n",
                cylinder1.calculateBaseArea(),
                cylinder1.calculateVolume(),
                cylinder1.calculateSurfaceArea());

        System.out.printf("Mass: %.2f%n", cylinder1.calculateMass(5.12));


        System.out.println(cylinder.getNoOfCylinder());
        System.out.println(cylinder1.getNoOfCylinder());



    }



}
