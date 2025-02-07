
package Function;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class Check_Date {
    void CheckData(){
        int day,month,year;
        int hour,minute,second;
        
        GregorianCalendar date = new GregorianCalendar();
        day=date.get(Calendar.DAY_OF_MONTH);
        month=date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);
        
        hour=date.get(Calendar.HOUR);
        minute = date.get(Calendar.MINUTE);
        second= date.get(Calendar.SECOND);
        
        System.out.println("Date : "+(month+1)+"/"+day+"/"+year);
        System.out.println("Time : "+hour+":"+minute+":"+second);   
        
    }
    
    

    public Check_Date() {
        CheckData();
    }
    
    public static void main(String[] args) {
       new Check_Date();
    }
    
}
