
package Function;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CheckDate {
    public void check_date(){
        int day,month,year;
        int second,minute,hour;
        GregorianCalendar date = new GregorianCalendar();
        
        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);
        
        second=date.get(Calendar.SECOND);
        minute=date.get(Calendar.MINUTE);
        hour=date.get(Calendar.HOUR);
        
        
        System.out.println("Current Date Is: "+(month+1)+"/"+day+"/"+year);  
        System.out.println("Current Time Is: "+hour+":"+minute+":"+second);
    }

    public CheckDate() {
        check_date();
    }
    public static void main(String[] args) {
        new CheckDate();
    }
    
}
