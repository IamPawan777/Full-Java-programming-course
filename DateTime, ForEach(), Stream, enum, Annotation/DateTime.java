// //...old version use the java.util.Date package..........sql Date depand on util Date

// import java.util.Date;
// // import java.sql.Date;

// public class DateTime {
//     public static void main(String[] args) {
//         Date dt = new Date();                   //..gives day, month, date, time, zone, year
//         System.out.println(dt);             

//         long ti = dt.getTime();

//         java.sql.Date dt2 = new java.sql.Date(ti);          //..gives only date
//         System.out.println(dt2);
//     }
// }








// //.....new version java.Time package.....

// import java.time.*;

// class DateTime {
//     public static void main(String[] args) {
//         LocalDate date = LocalDate.now();                 //..return the date
//         System.out.println(date);
//           int day = date.getDayOfMonth();
//           Month month = date.getMonth();
//           int year = date.getYear();
//           System.out.println("Date: "+day+" || Month: "+month+" || Year: "+year);


//         LocalTime time = LocalTime.now();                    //..return the time
//         System.out.println(time);
//           int hour = time.getHour();
//           int minute = time.getMinute();
//           int sec = time.getSecond();
//           int nano = time.getNano();
//           System.out.println("Hour: "+hour+" || Min: "+minute+" || Sec: "+sec+" || NonoSec: "+nano);
//     }
// }






//...........formate (MM/DD/YYYY)......

import java.time.*;
import java.time.format.DateTimeFormatter;

class DateTime {
  public static void main(String[] args) {
    LocalDate ld = LocalDate.of(2023, 12, 01);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    String str = ld.format(dtf);

    System.out.println(str);
  }
}