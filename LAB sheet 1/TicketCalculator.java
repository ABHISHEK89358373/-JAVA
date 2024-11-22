import java.util.*;

class TheatreProfit {
    double ticketPrice = 5.0;
    double fixedPerformanceCost = 20.0;
    double attendeeCost = 0.50;
    int attendees;

    TheatreProfit(int attendees) {
        this.attendees = attendees;
    }

    double calculateProfit() {
        double totalIncome = attendees * ticketPrice;
        double totalCost = attendees * attendeeCost + fixedPerformanceCost;
        return totalIncome - totalCost;
    }
}

public class TicketCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter attendees in the theatre of the show: ");
        int totalAttendees = sc.nextInt();
        TheatreProfit theatre = new TheatreProfit(totalAttendees);
        double profit = theatre.calculateProfit();
        System.out.println("Total Profit" + profit);
    }
}
