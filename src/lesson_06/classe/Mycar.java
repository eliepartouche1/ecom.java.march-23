package lesson_06.classe;

public class Mycar {
    public static void main(String[] args) {

        Car myCar = new Car("Tesla", 2023, true);


        myCar.brand = "Ilon Mask";

//        myCar.year = 2023;
//        myCar.isElectrical = true;

        System.out.println(myCar.brand + " " +myCar.year + " " + myCar.isElectrical);

        Car myBmw = new Car("BMW", 2019, false);

        Car generalCar = new Car("General", true);

        System.out.println(myBmw.brand + " " +myBmw.year + " " + myBmw.isElectrical);

    }
}