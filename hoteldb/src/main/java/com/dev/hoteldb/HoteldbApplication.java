package com.dev.hoteldb;

import com.dev.hoteldb.Dao.Entity.BreakfastPrice;
import com.dev.hoteldb.Dao.Entity.Clients;
import com.dev.hoteldb.Dao.Entity.Payment;
import com.dev.hoteldb.Dao.Entity.RoomPrice;
import com.dev.hoteldb.Main.DBTalker;
import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class HoteldbApplication {

    public static void main(String[] args) {
        SpringApplication.run(HoteldbApplication.class, args);

        DBTalker dbTalker = new DBTalker();
        Payment payment =  dbTalker.searchPaymentByClientId(58);
//        dbTalker.insertIntoPayment(58,"Mateo","Kovacic",65000,"credit");

//        List<Clients> list = dbTalker.getAllClients();
//
//        for (int i = 0; i <= list.size() - 1; i++) {
//            Clients c = new Clients();
//            c = list.get(i);
//            JSONObject jsonObject = new JSONObject(c);
//            System.out.println(jsonObject.toString());
//        }

//        Date birth_date = new Date();
//        Timestamp tms = new Timestamp(birth_date.getTime());
//        Clients client  = new Clients(1004,"Jeff", "Bezos",tms,"+994-51-551-11-51","772912","Male");

//        String date = "10/14/1998";
//
//        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
//        try {
//            Date parsed = (Date) format.parse(date);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//       //parsed-->Timestamp
//
//        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        Clients client = new Clients(1004, "Bill", "Gates", timestamp, "+994-55-775-35-55", "125662", "acqarik@gmail.com", "Male");
//
//        dbTalker.insertIntoClients(client);

    }

}
