package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private Integer id;

	private Client dataClient;

	private List<OrderItem> items = new ArrayList<>();

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Order() {

	}

	public Order(Client client, Date moment, OrderStatus status) {
		setMoment(moment);
		setStatus(status);
		dataClient = client;
	}
	public Order(int id, Date moment, OrderStatus status) {
		setMoment(moment);
		setStatus(status);
		this.id = id;
	}

	public List<OrderItem> getItem() {
		return items;
	}

	private void setItem(OrderItem item) {
		items.add(item);
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void addItem(OrderItem item) {
		setItem(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public double total() {
		double sum = 0;
		for (OrderItem i : items) {
			sum += i.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		return "ORDER SUMMARY:\n"
				+ " Order Moment: " + sdf.format(getMoment()) + "\n"
		        + " Order Status: " + getStatus() + "\n"
		        + " Client: " + dataClient.toString() + "\n"
		        + " Order Items:\n"
		        + "   " + items.toString()
		        +"Total Price: $" + total();
	}

}
