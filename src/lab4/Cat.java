package lab4;

public class Cat {
    int x;
    double direction;
    String name;


    Cat(){
        x =0;
        direction = 180.0;
        name = "Sofya";

    }
    Cat(int x, double direction, String name){
        this.name = name;
        this.x =x;
        this.direction = direction;
    }

    void  move(){
        x +=20;
    }
    void moveTwo(int a){
        x +=a;
    }
    void turn(double angle){
        direction += angle;
    }
    void status(){
        System.out.println("X: " + x + " " + "direction: " + direction + " "+ "name: " + name);
    }
}

