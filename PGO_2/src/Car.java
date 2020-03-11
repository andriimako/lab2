import java.awt.*;
import java.util.Scanner;

public class Car {
    String Brand;
    Color carColor;
    double engineCapacity;

    public Car (String Brand, Color carColor, double engineCapacity){
        this.Brand = Brand;
        this.carColor = carColor;
        this.engineCapacity = engineCapacity;
    }

    public String getBrand(){
        return this.Brand;
    }

    public Double getEngineCapacity(){
        return this.engineCapacity;
    }

    public Color getCarColor() {
        return carColor;
    }


    public void changeEngineCap(double engineCapacity){
        this.engineCapacity=engineCapacity;
    }

    public void isHighSpeed(){
        if (this.engineCapacity > 2.0){
             System.out.println("Yes");
         }
    }
}
