import java.util.Scanner;

public class Hotel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int floors =3;
        int roomsPerFloor = 5;
        boolean[][] hotel = new boolean[floors][roomsPerFloor];

        int choice;
        do {
            System.out.println(" Hotel Room Booking System");
            System.out.println("1. View Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Room Status :");
                    for (int i = 0; i < floors; i++) {
                        System.out.print("Floor " + (i + 1) + ": ");
                        for (int j = 0; j < roomsPerFloor; j++) {
                            if (hotel[i][j]) {
                                System.out.print("Room is Booked");
                            } else {
                                System.out.print("Room is  available ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Enter floor number (1-" + floors + "): ");
                    int floor = sc.nextInt() - 1;
                    System.out.print("Enter room number (1-" + roomsPerFloor + "): ");
                    int room = sc.nextInt() - 1;

                    if (floor >= 0 && floor < floors && room >= 0 && room < roomsPerFloor) {
                        if (!hotel[floor][room]) {
                            hotel[floor][room] = true;
                            System.out.println("Room booked successfully!");
                        } else {
                            System.out.println("Sorry, that room is already booked.");
                        }
                    } else {
                        System.out.println("Invalid floor or room number.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting system. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}
