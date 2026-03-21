package g_enums;

import java.util.Scanner;

public class Main2 {
    static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the day of the week (MN, TS, WN, TH, FR, ST, SN): ");
            String response = sc.nextLine().toUpperCase();
            Day day = Day.valueOf(response); //KEY SYNTAX

            switch(day) {
                case MN,
                     TS,
                     WN,
                     TH,
                     FR -> System.out.println("It is a weekDAY");
                case ST,
                     SN -> System.out.println("It is a weekEND");
            }
        }
        catch(IllegalArgumentException e) { //Just handling the exception
            System.out.println("Invalid input");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
