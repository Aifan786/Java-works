package Sprint1Day5;

public class TicketMain {

	public static void main(String[] args) {
		
		Ticket t1 = new Ticket();
		int ticket = 5;
		t1.setId(243);
		t1.setPrice(100);
		t1.setTickets(ticket);
		t1.AvailableTickets(20);
		
		t1.calculateTicketCost(ticket);
		
	}
}
