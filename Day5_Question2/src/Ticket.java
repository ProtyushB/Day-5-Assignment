public class Ticket {
    private int ticketId;
    private int price;
    private static int availableTickets;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        if(ticketId>0){
            this.ticketId = ticketId;
        }
        else{
            System.out.println("Only Positive Values Are Allowed");
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price>0){
            this.price = price;
        }
        else {
            System.out.println("Only Positive Values Are Allowed");
        }
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        if(availableTickets>0){
            Ticket.availableTickets = availableTickets;
        }
        else {
            System.out.println("Only Positive Values Are Allowed");
        }
    }
    
    public int calculateTicketCost(int nooftickets){


        if(Ticket.getAvailableTickets()>0){
            Ticket.setAvailableTickets(Ticket.getAvailableTickets() - nooftickets);
            return nooftickets*getPrice();
        }
        else{
            return -1;
        }
    }
}
