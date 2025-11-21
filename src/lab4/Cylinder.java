package lab4;

public class Cylinder {
    double r;
    double h;
    static int noOfCylinder =0;

    Cylinder(double r, double h){
        this.r = r;
        this.h = h;
        noOfCylinder++;

    }
    Cylinder(){
        h = 4;
        r = 3;
        noOfCylinder++;
    }

    public int getNoOfCylinder(){
         return noOfCylinder;
    }

    double calculateBaseArea(){
        return Math.PI * r*r;
    }

    double calculateSurfaceArea(){
        return 2*Math.PI*r/(r+h);
    }
    double calculateVolume(){
       return Math.PI * r*r*h;
    }
    double calculateMass(double density){
         return calculateVolume()*density;
    }
}
