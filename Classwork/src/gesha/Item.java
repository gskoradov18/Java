package gesha;

public class Item {
	String title;
	boolean borrowed;
	int year;
	int month;
	int dayOfMonth;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isBorrowed() {
		return borrowed;
	}

	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	public int getTime() {
		return year + ' ' + month + ' ' + dayOfMonth;
	};

	public void borrowDate(int year, int month, int day) {
	};

	public void print() {
		System.out.println(title);
		System.out.println(borrowed);
		System.out.println(year);
		System.out.println(month);
		System.out.println(dayOfMonth);

	};
}
