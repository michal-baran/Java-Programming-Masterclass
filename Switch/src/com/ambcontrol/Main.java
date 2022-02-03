package com.ambcontrol;

public class Main {

    public static void main(String[] args) {
//        int value = 2;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else {
//            if (value == 2) {
//                System.out.println("Value was 2");
//            } else {
//                System.out.println("Was not 1 or 2");
//            }

        char switchValue = 'D';
        switch (switchValue) {
            case 'A':
                System.out.println("Wybrano literę A");
                break;

            case 'B':
                System.out.println("Wybrano literę B");
                break;

            case 'C':
                System.out.println("Wybrano literę C");
                break;

            case 'D':
                System.out.println("Wybrano literę D");
                break;

            case 'E':
                System.out.println("Wybrano literę E");
                break;

            default:
                System.out.println("Nic nie wybrano");
                break;
        }

        String month = "JaNuAry";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Styczeń");
                break;

            case "february":
                System.out.println("Luty");
                break;

            case "march":
                System.out.println("Marzec");
                break;

            case "april":
                System.out.println("Kwiecień");
                break;

            default:
                System.out.println("Nie wybrano miesiąca");
        }
    }
}
