package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation() {
	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		if (!checkout.after(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
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
		// long diff = getCheckout().getTime() - getCheckout().getTime();
		// return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		long diff = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

	}

	public void updateDates(Date checkin, Date checkout) {
		Date now = new Date();

		if (checkin.before(now) || checkout.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if (!checkout.after(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		setCheckin(checkin);
		setCheckout(checkout);
	}

	@Override
	public String toString() {
		return "Room: " + getRoomNumber() + ", check-in: " + sdf.format(getCheckin()) + ", check-out: "
				+ sdf.format(getCheckout()) + ", duration: " + duration() + " nigths";
	}

}
