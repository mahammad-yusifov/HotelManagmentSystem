package com.dev.hoteldb.Main;

import ch.qos.logback.core.net.server.Client;
import com.dev.hoteldb.Dao.Entity.*;
import com.dev.hoteldb.Util.AbstractConnect;
import com.dev.hotelwebapp.Controllers.AddRequestModel;
import net.bytebuddy.implementation.bytecode.Throw;


import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class DBTalker extends AbstractConnect {

    public Payment searchPaymentByClientId(int clientId) {
        Payment payment = null;
        Connection conn;
        try {
            conn = connect();
            Statement stmt = conn.createStatement();
            String sql = "SELECT C.client_id,C.first_name,C.last_name, SUM(r.total_cost) AS cost " +
                    " FROM clients AS C" +
                    " INNER JOIN reservation AS r" +
                    " ON r.client_id = " + clientId +
                    " WHERE C.client_id = " + clientId +
                    " GROUP BY  C.client_id,C.first_name,C.last_name;";
            stmt.execute(sql);
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int client_id = rs.getInt("client_id");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String paymentMethod = rs.getString("payment_method");
                Double cost =  rs.getDouble("cost");
                payment = new Payment(client_id,first_name,last_name,paymentMethod,cost,5);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return payment;
    }
    public void insertIntoPayment(int clientId, String firstName, String lastName, int totalCost , String paymentMethod){
        Connection conn;
        try {
            conn = connect();

            String sql = "INSERT INTO payment(client_id,first_name,last_name,total_cost,payment_method) " +
                    "VALUES (?,?,?,?,?)";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setInt(1, clientId);
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setInt(4, totalCost);
            preparedStatement.setString(5, paymentMethod);

            preparedStatement.execute();
            ResultSet rs = preparedStatement.getResultSet();
//            while (rs.next()) {
//
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Payment> getAllPayments(){
        List<Payment> paymentList = new ArrayList<>();
        Connection conn;
        try {
            conn = connect();
            Statement stmt = conn.createStatement();
            stmt.execute("SELECT * FROM payment");
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int clientId = rs.getInt("client_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                int totalCost = rs.getInt("total_cost");


                paymentList.add(new Payment());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return paymentList;
    }

    public void deleteReservationByClient (int clientID){
        Connection conn;
        try {
            conn = connect();
            Statement statement = conn.createStatement();
            statement.execute("DELETE FROM reservation WHERE client_id = "+clientID);
            ResultSet rs = statement.getResultSet();
//            while (rs.next()){
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Clients> getAllClients() {
        List<Clients> clientsList = new ArrayList<>();

        Connection conn;
        try {
            conn = connect();
            Statement stmt = conn.createStatement();
            stmt.execute("SELECT * FROM clients");
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int clientId = rs.getInt("client_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                Date birthDate = rs.getDate("birth_date");
                String mobile = rs.getString("mobile");
                String passportNo = rs.getString("passport_no");
                String email = rs.getString("email");
                String gender = rs.getString("gender");
                clientsList.add(new Clients(clientId, firstName, lastName, birthDate, mobile, passportNo, email, gender));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return clientsList;
    }

    public List<BreakfastPrice> getBreakfastPrices() {
        List<BreakfastPrice> breakfastPriceList = new ArrayList<>();
        Connection conn;
        try {
            conn = connect();
            Statement st = conn.createStatement();
            st.execute("SELECT * FROM breakfast_price");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {

                //breakfastPriceList.add(();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return breakfastPriceList;

    }

    public List<RoomPrice> getAllRoomPrices() {
        List<RoomPrice> roomPricesList = new ArrayList<>();
        Connection conn;
        try {
            conn = connect();
            Statement stmt = conn.createStatement();
            stmt.execute("SELECT*FROM room_price");
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                int airConditioner = rs.getInt("air_conditioner");
                int smartTv = rs.getInt("smart_tv");
                int jacuzzi = rs.getInt("jacuzzi");
                int bedSingle = rs.getInt("bed_single");
                int bedDouble = rs.getInt("bed_double");
                int vip = rs.getInt("vip");
                roomPricesList.add(new RoomPrice(airConditioner, smartTv, jacuzzi, bedSingle, bedDouble, vip));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return roomPricesList;
    }


//    String sql = " INSERT INTO clients (client_id, check_in, check_out, room_type, bed, room_no, meal)  " +
//            "VALUES (?,?,?,?,?,?,?)";


    public void insertIntoReservation(AddRequestModel addRequestModel) {
        Connection conn;
        try {
            conn = connect();

            String sql = " INSERT INTO clients (client_id, check_in, check_out, room_type, bed, room_no, meal)  " +
                    "VALUES (?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, addRequestModel.getClientId());
            preparedStatement.setDate(2, addRequestModel.getCheckIn());
            preparedStatement.setDate(3, addRequestModel.getCheckOut());
            preparedStatement.setString(4, addRequestModel.getRoomType());
            preparedStatement.setString(5, addRequestModel.getBed());
            preparedStatement.setInt(6, addRequestModel.getRoomNo());
            preparedStatement.setString(7, mapRequestModelMealToStringMeal(addRequestModel));

            preparedStatement.execute();
            ResultSet rs = preparedStatement.getResultSet();
            while (rs.next()) {

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertIntoClients(Clients clients) {
        String firstName = clients.getFirstName();
        String lastName = clients.getLastName();
        Date birthDate = clients.getBirthDate();

        Integer clientId = clients.getClientId();
        String email = clients.getEmail();
        String gender = clients.getGender();
        String mobile = clients.getMobile();
        String passport = clients.getPassportNo();

        Connection conn;
        try {
            conn = connect();

            String sql = " INSERT INTO clients (first_name, last_name, birth_date, mobile, passport_no, email, gender)  " +
                    "VALUES (?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
//            preparedStatement.setInt(1, clientId);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setDate(3, birthDate);
            preparedStatement.setString(4, mobile);
            preparedStatement.setString(5, passport);
            preparedStatement.setString(6, email);
            preparedStatement.setString(7, gender);

            preparedStatement.execute();
//            ResultSet rs = preparedStatement.getResultSet();
//            while (rs.next()) {
//
//            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Inserted client to db");
    }

    public Reservation getReservationByClientId(int clientId) {
        Connection conn;
        Reservation r = null;
        try {
            conn = connect();
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM reservation WHERE client_id = " + clientId;
            stmt.execute(sql);
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                int clientIdFromDb = rs.getInt("client_id");
                Timestamp checkIn = rs.getTimestamp("check_in");
                Timestamp checkOut = rs.getTimestamp("check_out");
                String roomType = rs.getString("room_type");
                String bed = rs.getString("bed");
                int roomNo = rs.getInt("room_no");
                String meal = rs.getString("meal");

                r = new Reservation(clientIdFromDb, checkIn, checkOut, roomType, bed, roomNo, meal);

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return r;
    }

    public Clients getClientById(int clientId) {
        Connection conn;
        Clients client = null;
        try {
            conn = connect();
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM clients WHERE client_id = " + clientId;
            stmt.execute(sql);
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                int clientIdFromDb = rs.getInt("client_id");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                Date birth_date = rs.getDate("birth_date");
                String mobile = rs.getString("mobile");
                String passportNo = rs.getString("passport_no");
                String email = rs.getString("email");
                String gender = rs.getString("gender");

                client = new Clients(clientIdFromDb, first_name, last_name, birth_date, mobile, passportNo, email, gender);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return client;
    }

    public void updateClient(Clients client) {
        Connection conn;
        try {
            conn = connect();

            String sql = "UPDATE clients " +
                    "SET first_name = ? ," +
                    "last_name = ? ," +
                    "birth_date = ? ," +
                    "mobile = ? ," +
                    "passport_no = ? ," +
                    "email = ?  ," +
                    "gender = ?  " +
                    "WHERE client_id = ? ";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, client.getFirstName());
            preparedStatement.setString(2, client.getLastName());
            preparedStatement.setDate(3, client.getBirthDate());
            preparedStatement.setString(4, client.getMobile());
            preparedStatement.setString(5, client.getPassportNo());
            preparedStatement.setString(6, client.getEmail());
            preparedStatement.setString(7, client.getGender());
            preparedStatement.setInt(8, client.getClientId());

            preparedStatement.execute();
//            ResultSet rs = preparedStatement.getResultSet();
//            while (rs.next()) {
//
//            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Inserted client to db");
    }


    public void updateReservation(AddRequestModel addRequestModel) {
        Connection conn;
        try {
            conn = connect();
            mapRequestModelMealToStringMeal(addRequestModel);

            String sql = "UPDATE reservation " +
                    "SET check_in = ? ," +
                    "check_out = ? ," +
                    "room_type = ? ," +
                    "bed = ? ," +
                    "room_no = ? ," +
                    "meal = ?  " + "WHERE id = ? ";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setDate(1, addRequestModel.getCheckIn());
            preparedStatement.setDate(2, addRequestModel.getCheckOut());
            preparedStatement.setString(3, addRequestModel.getRoomType());
            preparedStatement.setString(4, addRequestModel.getBed());
            preparedStatement.setInt(5, addRequestModel.getRoomNo());
            preparedStatement.setString(6, mapRequestModelMealToStringMeal(addRequestModel));

            preparedStatement.execute();
//            ResultSet rs = preparedStatement.getResultSet();
//            while (rs.next()) {
//
//            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Inserted client to db");
    }

    public List<Reservation> getAllReservations() {
        Connection conn;
        List<Reservation> reservationList = new ArrayList<>();
        try {
            conn = connect();
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM reservation";
            stmt.execute(sql);
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                int clientIdFromDb = rs.getInt("client_id");
                Timestamp checkIn = rs.getTimestamp("check_in");
                Timestamp checkOut = rs.getTimestamp("check_out");
                String roomType = rs.getString("room_type");
                String bed = rs.getString("bed");
                int roomNo = rs.getInt("room_no");
                String meal = rs.getString("meal");

                reservationList.add(new Reservation(clientIdFromDb, checkIn, checkOut, roomType, bed, roomNo, meal));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return reservationList;
    }

    public void deleteClient(Integer clientId) throws Exception {
        Connection conn;
        conn = connect();

        String sql = "DELETE FROM clients WHERE client_id = ?";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, clientId);
        preparedStatement.execute();
    }

    public String ifTool(String meal, AddRequestModel addRequestModel) throws Exception {
        String s = "is" + meal;
        if ((boolean) addRequestModel.getClass().getField(s).get(addRequestModel)) {
            return meal.toLowerCase();
        }
        return "";
    }

    public String mapRequestModelMealToStringMeal(AddRequestModel addRequestModel) throws Exception {
//        ifTool("Bacon",addRequestModel);
//        ifTool("Muffin",addRequestModel);
//        ifTool("Egg",addRequestModel);
//        ifTool("Bread",addRequestModel);
//        ifTool("FiredBread",addRequestModel);
//        ifTool("Pancake",addRequestModel);
//        ifTool("Rice",addRequestModel);
//        ifTool("Chicken",addRequestModel);
//        ifTool("Burgers",addRequestModel);
//        ifTool("LobsterRolls",addRequestModel);
//        ifTool("Macaroni",addRequestModel);
//        ifTool("SloppyJoes",addRequestModel);
//        ifTool("Fish",addRequestModel);
//        ifTool("FriedPotatos",addRequestModel);
//        ifTool("Pizza",addRequestModel);
//        ifTool("Lule",addRequestModel);
//        ifTool("BigMac",addRequestModel);
//        ifTool("SpaghettiWithMeat",addRequestModel);
//        ifTool("Doner",addRequestModel);
//        ifTool("DolmaWithLeaf)",addRequestModel);
//        ifTool("Sushi",addRequestModel);
//        ifTool("Fish",addRequestModel);
//        ifTool("DolmaWithCabbage)",addRequestModel);
//        ifTool("Levengi",addRequestModel);
//        ifTool("Kabab",addRequestModel);
//        ifTool("MeatLoaf",addRequestModel);
//        ifTool("PorkChops",addRequestModel);

        List<String> mealsNames = Arrays.asList("Bacon", "Muffin", "Egg", "Bread", "FiredBread", "Pancake", "Rice"
                , "Chicken", "Burgers", "LobsterRolls", "Macaroni", "SloppyJoes", "FishForLunch", "FriedPotatos", "Pizza", "Lule", "BigMac", "SpaghettiWithMeat",
                "Doner", "DolmaWithLeaf", "Sushi", "FishForSupper", "DolmaWithCabbage", "Levengi", "Kabab", "MeatLoaf", "PorkChops");

        StringBuffer meals = new StringBuffer();

        for (int i = 0; i < 28; i++) {
            String temp = ifTool(mealsNames.get(i), addRequestModel);
            if (temp != "") {
                meals.append(temp + " ,");
            }
        }

        if (meals.charAt(meals.length()) == ',') {
            meals.deleteCharAt(meals.length());
        }

        return meals.toString();

    }

}