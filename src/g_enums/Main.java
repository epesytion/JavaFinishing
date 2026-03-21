package g_enums;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // Enums = (Enumerations) A special kind of class that
        //         represents a fixed set of constants.
        //         They improve code readability and are easy to maintain.
        //         More efficient with switches when comparing Strings.
        //Create the new enums class



        //Usage
        Day day = Day.MN; //Syntax
        System.out.println(day);
        System.out.println(day.getDayOfWeek());

        //with switch

        switch(day) {
            case MN,
                 TS,
                 WN,
                 TH,
                 FR -> System.out.println("It is a weekDAY");
            case ST,
                 SN -> System.out.println("It is a weekEND");
        }
        //Try it with scanners (Main2)


    }
}
