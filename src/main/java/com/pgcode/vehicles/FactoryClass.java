package com.pgcode.vehicles;

import java.util.Scanner;

public class FactoryClass
{
    public static Vehicle getInstance(String str)
    {
        Scanner sc = new Scanner(System.in);

        if(str.equals("Car"))
        {
            System.out.println("Enter Car Number");
            String car_no = sc.nextLine();
            System.out.println("Enter Car colour");
            String car_colour = sc.nextLine();



            return new Car(car_no , car_colour);
        } else if (str.equals("Bus")) {

            return new Bus();
        }else if (str.equals("Bicycle")) {
            return new Bicycle();
        }
        else {
            return null;
        }
    }
}
