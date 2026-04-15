package com.pluralsight;

import java.util.Scanner;

public class Main
{
    static Scanner input = new Scanner(System.in);

    static CellPhone cellphone1 = new CellPhone();

    public static void main(String[] args)
    {
        promptUser();
    }

    public static void promptUser()
    {
        //int userSerialNumberInput = 0;
        String userModelInput = " ";
        String userCarrierInput = " ";
        String userPhoneNumberInput = " ";
        String userOwnerInput = " ";

        //CellPhone cellphone1 = new CellPhone();

        System.out.println("""
                Cellphone application start!
                
                What is the phone's serial number? """);

        //userSerialNumberInput = input.nextInt();
        //cellphone1.setSerialNumber(userSerialNumberInput);
        //input.nextLine();
        theExceptionPreventer9000();

        System.out.println("\nWhat model is the phone?" );
        userModelInput = input.nextLine();
        cellphone1.setModel(userModelInput);

        System.out.println("\nWhat is the carrier of the phone?" );
        userCarrierInput = input.nextLine();
        cellphone1.setCarrier(userCarrierInput);

        System.out.println("\nWhat is the phone number?" );
        userPhoneNumberInput = input.nextLine();
        cellphone1.setPhoneNumber(userPhoneNumberInput);

        System.out.println("\nWhat is the first and last name of the owner of the phone?" );
        userOwnerInput = input.nextLine();
        cellphone1.setOwner(userOwnerInput);

        System.out.println("\n" + cellphone1.getSerialNumber());
        System.out.println(cellphone1.getModel());
        System.out.println(cellphone1.getCarrier());
        System.out.println(cellphone1.getPhoneNumber());
        System.out.println(cellphone1.getOwner());
    }

    public static void theExceptionPreventer9000()
    {
        while (true)
        {
            try
            {
                int userSerialNumberInput = input.nextInt();
                cellphone1.setSerialNumber(userSerialNumberInput);
                input.nextLine();
                break;
            }
            catch (Exception e)
            {
                System.out.println("\nPlease enter a valid serial number. ");
                input.nextLine();
            }

        }
    }

}
