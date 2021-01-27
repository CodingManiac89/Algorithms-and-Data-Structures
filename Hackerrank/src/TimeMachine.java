import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class TimeMachine {
	public static void main(String[] args) throws ParseException {
		int y = 2016;
        SimpleDateFormat dateFormat = new SimpleDateFormat( "dd.MM.yyyy" );
        String baseDate = "01.01."+String.valueOf(y);
        Calendar cal = Calendar.getInstance();
        cal.setTime( dateFormat.parse( baseDate ) );
        cal.add(Calendar.DAY_OF_YEAR, 255);
        
        System.out.println(dateFormat.format(cal.getTime()));
	}
}
