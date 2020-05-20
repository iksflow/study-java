package training.utils;

public class TimeConvertUtil {
	/**
	 * @param minute
	 * @return 900 -> 15:00
	 */
	public static String changeMinuteToHourTime(int minute) {
		String time = "";
		String hour = String.format("%02d", minute/60);
		String min = String.format("%02d", minute%60);
		
		time = hour + ":" + min;
		 
		return time;
	}
	
	/**
	 * @param date 20200515
	 * @param minute 900
	 * @return 20200515150000(yyyyMMddHHmmss)
	 */
	public static String changeDateAndTimeToSchedulerDate(String date, int minute) {
		String schedulerFormattedDateTime = "";
		String hour = String.format("%02d", minute/60);
		String min = String.format("%02d00", minute%60);
		
		schedulerFormattedDateTime = date + hour + min;
		 
		return schedulerFormattedDateTime;
	}
}
