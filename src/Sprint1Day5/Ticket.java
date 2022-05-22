package Sprint1Day5;

public class Ticket {

	private int ticketId;
	private int price;
	private int ticketQty;
	static int availableTickets;
	
	public void setId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getId() {
		return ticketId;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setTickets(int ticketQty) {
		this.ticketQty = ticketQty;
	}
	public int getTickets() {
		return ticketQty;
	}
	
	public void AvailableTickets(int totalTicket) {
		if(totalTicket>0) {
			availableTickets = totalTicket;
		}
	}
	
	public void calculateTicketCost(int nooftickets) {
		
		if(ticketQty<availableTickets) {
			 int total = nooftickets*price;
			 nooftickets = availableTickets-ticketQty;
			 
			 System.out.println("Total amount:"+total);
			 System.out.println("Available ticket after booking:"+nooftickets);
		}
		
	}
}
