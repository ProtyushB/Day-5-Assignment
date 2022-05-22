import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of Bookings: ");
        int bookings = sc.nextInt();

        System.out.print("Enter The Available Tickets: ");
        Ticket.setAvailableTickets(sc.nextInt());

        System.out.println("********************************");

        for (int i=0;i<bookings;i++){

            booking();

        }

    }

    public static void booking(){

        Ticket tc = new Ticket();
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the Ticket ID: ");
        tc.setTicketId(sc.nextInt());

        System.out.print("Enter The Price: ");
        tc.setPrice(sc.nextInt());

        System.out.print("Enter The No Of Tickets: ");
        int tickets = sc.nextInt();

        System.out.println("--------------------------------");

        System.out.println("Available Tickets: "+Ticket.getAvailableTickets());

        System.out.println("Total Amount: "+tc.calculateTicketCost(tickets));

        System.out.println("Available Tickets After Booking: "+Ticket.getAvailableTickets());

        System.out.println("--------------------------------");
    }
}
