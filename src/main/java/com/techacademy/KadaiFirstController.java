package com.techacademy;



import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {


    @GetMapping("dayofweek/{yyyymmdd}")
        public String dispDayOfWeek() {

            Calendar cl=Calendar.getInstance();
            String str="yyyymmdd";
            String yyyy=str.substring(0,4);
            String mm=str.substring(4,6);
            String dd=str.substring(6,7);
            int year=Integer.parseInt(yyyy);
            int month=Integer.parseInt(mm);
            int date=Integer.parseInt(dd);
            cl.set(year,month,date);

            int dayofweek=cl.get(Calendar.DAY_OF_WEEK);
           switch(dayofweek) {
                case Calendar.SUNDAY:return "SUNDAY";
                case Calendar.MONDAY:return "MONDAY";
                case Calendar.TUESDAY:return "TUESDAY";
                case Calendar.WEDNESDAY:return "WEDNESDAY";
                case Calendar.THURSDAY:return "THURSDAY";
                case Calendar.FRIDAY:return "FRIDAY";
                case Calendar.SATURDAY:return "SATURDAY";

           }
            return "結果"+cl;

            }

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1,@PathVariable int val2) {
        int res=0;
        res=val1+val2;
        return "結果"+res;
    }
    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1,@PathVariable int val2) {
        int res=0;
        res=val1-val2;
        return "結果"+res;
    }
    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1,@PathVariable int val2) {
        int res=0;
        res=val1*val2;
        return "結果"+res;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1,@PathVariable int val2) {
        int res=0;
        res=val1/val2;
        return "結果"+res;
    }
        }


