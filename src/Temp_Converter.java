import java.util.Scanner;

public class Temp_Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempC = -273.15; //The lowest possible celsius is -273.15
        double tempF;
        String trash = "";
        String playAgain = "";
        do {

            do {

                System.out.println("Input the temperature in celsius that you'll like to convert to fahrenheit: ");
                if (in.hasNextDouble()) {
                    tempC = in.nextDouble();
                    tempF = (9 * tempC) / 5 + 32;
                    if (tempC >= -273.15 && tempC != 100 && tempC != 0) {
                        System.out.println(tempC + " celsius in fahrenheit is: " + tempF);
                        in.nextLine();
                    } else if (tempC == 100) {
                        System.out.println(tempC + " celsius in fahrenheit is " + tempF + ". \nThis is also the boiling point of water.");
                        in.nextLine();
                    } else if (tempC == 0) {
                        System.out.println(tempC + " celsius in fahrenheit is " + tempF + ". \nThis is also the freezing point of water.");
                        in.nextLine();
                    } else {
                        System.out.println(tempC + " is lower than the lowest possible Celsius temperature. Please input a different temperature again.");
                    }
                } else {
                    trash = in.nextLine();
                    System.out.println(trash + " is not a temperature. Try again.");
                }
            } while (tempC <= -273.15);

        System.out.println("Press Y to convert a different celsius to fahrenheit.");
        playAgain = in.nextLine();
        }while(playAgain.equalsIgnoreCase("Y"));
    }
  }