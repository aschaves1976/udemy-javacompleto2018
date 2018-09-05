package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation() {
	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		setRoomNumber(roomNumber);
		setCheckin(checkin);
		setCheckout(checkout);
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	private void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	private void setCheckout(Date checkout) {
		this.checkout = checkout;
	}

	public long duration() {
		//long diff = getCheckout().getTime() - getCheckout().getTime();
		//return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		long diff = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

	}

	public void updateDates(Date checkin, Date checkout) {
		setCheckin(checkin);
		setCheckout(checkout);
	}

	@Override
	public String toString() {
		return "Room: " + getRoomNumber() + ", check-in: " + sdf.format(getCheckin()) + ", check-out: "
				+ sdf.format(getCheckout()) + ", duration: " + duration() + " nigths";
	}

}
