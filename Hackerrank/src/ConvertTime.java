import java.util.Scanner;


public class ConvertTime {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        StringBuilder sb = new StringBuilder();
        String[] tokens = time.split(":");
        String hours = tokens[0];
        String minutes = tokens[1];
        String sec = tokens[2];
        String seconds="";
        String AM_PM="";
        if(sec.contains("AM")){
        	seconds = sec.substring(0, sec.indexOf("AM"));
        	AM_PM = "AM";
        }
        
        else if(sec.contains("PM")){
        	seconds = sec.substring(0, sec.indexOf("PM"));
        	AM_PM = "PM";
        }
        if(AM_PM.equals("AM")){
            if(hours.equals("12")){
            	sb.append("00");
            }
            else{
            	sb.append(hours);
           
            }
         	sb.append(":");
        	sb.append(minutes);
        	sb.append(":");
        	sb.append(seconds);
        }
        else if(AM_PM.equals("PM")){
        	int hrs = Integer.parseInt(hours);
        	if(hr)
        	hrs = hrs+12;
        	sb.append(hrs);
        	sb.append(":");
        	sb.append(minutes);
        	sb.append(":");
        	sb.append(seconds);

        }
        
        System.out.println(sb.toString());
    }
}
