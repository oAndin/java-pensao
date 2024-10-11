
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initializing scanner
        Scanner sc = new Scanner(System.in);

        // Array with rooms quantity
        int roomsQuantity = 10;

        // Getting the data of how many rooms will be occupied
        System.out.println("Quantos estudantes irão alugar os quartos?");
        int n = sc.nextInt();

        Room[] roomsArray = new Room[roomsQuantity];

        // For loop for creating the class with parameters
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do inquilino: ");
            String tenant = sc.next();
            System.out.println("Digite o e-mail do inquilino: ");
            String email = sc.next();
            System.out.println("Digite o valor do aluguel: ");
            double price = sc.nextDouble();
            System.out.println("Digite o número do quarto: ");
            int roomsNumber = sc.nextInt();

            // Logic to check if the room is occupied or not
//            if(!roomsArray[sc.nextInt()].getOccupied()) {
//                 // not working !!!
//                    roomsNumber = sc.nextInt();
//            }
//            else {
//                System.out.println("O quarto está ocupado otario!");
//            }

            boolean occupied = true;

            Room room = new Room(occupied,price, roomsNumber, tenant, email);
            roomsArray[roomsNumber - 1] = room;
        }

        for (int i = 0; i < roomsQuantity; i++) {
            if (roomsArray[i] != null) {
                System.out.println("Quarto número " + (i + 1) + ", " + roomsArray[i]);
            }
//            System.out.println("Quarto número: " + i + " ," + roomsArray[i].getOccupied());
        }

        sc.close();
    }
}