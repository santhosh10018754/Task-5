package task5;

import java.util.Scanner;

		public class HotelTariff {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the month (1-12): ");
		        int month = scanner.nextInt();

		        System.out.println("Enter the room rent per day: ");
		        double rentPerDay = scanner.nextDouble();

		        System.out.println("Enter the number of days: ");
		        int numDays = scanner.nextInt();

		        double tariff = calculateTariff(month, rentPerDay, numDays);

		        System.out.printf("Hotel Tariff: %.2f%n", tariff);

		    }

		    private static double calculateTariff(int month, double rentPerDay, int numDays) {
		        double tariff;

		        switch (month) {
		            case 4:
		            case 5:
		            case 6:
		            case 11:
		            case 12:
		                tariff = rentPerDay * numDays * 1.2;
		                break;
		            default:
		                tariff = rentPerDay * numDays;
		        }

		        return tariff;
		    }
		}




	


