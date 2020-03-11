import java.awt.*;

public class Main {


    public static void main(String []args){
        Phone myPhone = new Phone("Nokia 3310", 3.0, 666);
        myPhone.sendMessage("lol",666);

        Car myCar = new Car ("Maliuk",Color.pink, 1.0);

        String CarBrand = myCar.getBrand();
        System.out.println(CarBrand);
        Color carColor = myCar.getCarColor();
        System.out.println(carColor);
        Double carEngineCap = myCar.getEngineCapacity();
        System.out.println(carEngineCap);

        myCar.changeEngineCap(3.0);
        myCar.isHighSpeed();



    }
}
