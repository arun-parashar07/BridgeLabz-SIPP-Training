import java.util.*;

class Ticket {
    String ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    Ticket(String ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }
}

public class OnlineTicketReservationCLL {
    static Ticket head = null;

    public static void addTicket(String ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            newTicket.next = head;
        } else {
            Ticket temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }
    }

    public static void removeTicket(String ticketId) {
        if (head == null) return;
        Ticket curr = head, prev = null;

        do {
            if (curr.ticketId.equals(ticketId)) {
                if (prev == null) { // head needs to be removed
                    Ticket last = head;
                    while (last.next != head) last = last.next;
                    if (head == head.next) head = null;
                    else {
                        head = head.next;
                        last.next = head;
                    }
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Ticket " + ticketId + " cancelled.");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Ticket ID not found.");
    }

    public static void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Ticket temp = head;
        System.out.println("Current Bookings:");
        do {
            System.out.printf("ID: %s | Name: %s | Movie: %s | Seat: %s | Time: %s\n",
                    temp.ticketId, temp.customerName, temp.movieName, temp.seatNumber, temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    public static void searchTicket(String keyword) {
        if (head == null) return;
        Ticket temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Found: " + temp.ticketId + " - " + temp.customerName + " - " + temp.movieName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No matching ticket found.");
    }

    public static void totalTickets() {
        if (head == null) {
            System.out.println("Total Tickets: 0");
            return;
        }
        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Total Tickets: " + count);
    }

    public static void main(String[] args) {
        addTicket("T001", "Alice", "Inception", "A1", "10:00AM");
        addTicket("T002", "Bob", "Inception", "A2", "10:00AM");
        addTicket("T003", "Charlie", "Oppenheimer", "B1", "12:00PM");

        displayTickets();
        searchTicket("Inception");
        totalTickets();
        removeTicket("T002");
        displayTickets();
        totalTickets();
    }
}
