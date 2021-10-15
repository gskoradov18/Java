package gesha;

import java.util.GregorianCalendar;

public class AudioVideo extends Item {
	private final int MAX_BORROW_DAY = 7;

	public int getMAX_BORROW_DAY() {
		return MAX_BORROW_DAY;
	}

	public void dueDate(GregorianCalendar borrowDate) {
	};
}
