package exxx;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exxx.exception.DomainException;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	// static pq vai precisar de apenas um
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut){
		
		
		 if( !checkOut.after(checkIn)){
				
				throw new DomainException ("A data de check-in é maior que a do check-out");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS); //Coverte o valor que esta no diff em milisegundos para dias 
	}
	public void updateDates(Date checkIn, Date checkOut) {
		
		Date now = new Date();
		
		if (checkIn.before(now) || checkOut.before(now)) {
			
			throw new DomainException( "Impossível, pois a data de reserva atualizada tem que ser futura a antiga data");
			
		} if( !checkOut.after(checkIn)){
			
			throw new DomainException ("A data de check-in é maior que a do check-out");
		}
		
		this.checkIn = checkIn;
		this.checkOut =checkOut; 
		
	}
	
	@Override
	public String toString() {
		
		return "Romm " 
		+ roomNumber 
		+ ", checkIn: " 
		+ sdf.format(checkIn) 
		+ ", checkOut: " 
		+ sdf.format(checkOut)
		+ ", " 
		+ duration() 
		+ " nights";
	}
	
	
	
}
