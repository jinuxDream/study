package com.jiangyunpeng.mode.threadmodels.future.concurrent;

import java.util.Calendar;

/**
 * Created by user on 2018/3/1.
 */
public class Test {

    public static void main(String[] args) {
        DateTestFactory factory = new DateTestFactory();
        DateTest[] dateTests = new DateTest[10];

        for (int i=0;i<dateTests.length;i++){
            dateTests[i] = factory.getProxyInstance();
        }

        for (DateTest dateTest : dateTests){
            System.out.println(dateTest.getDate());
        }
    }
}


interface DateTest{
    String getDate();
}

class DateImpl implements DateTest{

    private String date = null;

    public DateImpl() {
        try {
            date = Calendar.getInstance().getTime().toString();
            Thread.sleep(5000);
        }catch (InterruptedException e){
        }
    }

    @Override
    public String getDate() {
        return "date : " + date;
    }
}

class DateTestFactory extends FutureProxy<DateTest>{

    @Override
    protected DateTest createInstance() {
        return new DateImpl();
    }

    @Override
    protected Class<? extends DateTest> getInterface() {
        return DateTest.class;
    }
}
