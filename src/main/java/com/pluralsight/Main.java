package com.pluralsight;

import java.util.Scanner;

public class Main
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        int userSerialNumberInput = 0;
        String userModelInput = " ";
        String userCarrierInput = " ";
        String userPhoneNumberInput = " ";
        String userOwnerInput = " ";

        CellPhone cellphone1 = new CellPhone();

        System.out.println("""
                Cellphone application start!
                
                What is the phone's serial number? """);

        userSerialNumberInput = input.nextInt();
        cellphone1.setSerialNumber(userSerialNumberInput);
        input.nextLine();

        System.out.println("\nWhat model is the phone?" );
        userModelInput = input.nextLine();
        cellphone1.setModel(userModelInput);

        System.out.println("\nWhat is the carrier of the phone?" );
        userCarrierInput = input.nextLine();
        cellphone1.setCarrier(userCarrierInput);

        System.out.println("\nWhat is the phone number?" );
        userPhoneNumberInput = input.nextLine();
        cellphone1.setPhoneNumber(userPhoneNumberInput);

        System.out.println("\nWhat is the name of the owner of the phone?" );
        userOwnerInput = input.nextLine();
        cellphone1.setOwner(userOwnerInput);

        System.out.println("\n" + cellphone1.getSerialNumber());
        System.out.println(cellphone1.getModel());
        System.out.println(cellphone1.getCarrier());
        System.out.println(cellphone1.getPhoneNumber());
        System.out.println(cellphone1.getOwner());

    }
}
