/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mysql;

/**
 *
 * @author EJAS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Mysql {
    public static void main(String[] args) {
        AdminGenre adminGenre = new AdminGenre();
        Genre newGenre = new Genre(7,"hiplife");
        
        try{
            // insert------------------------------
//          int rowsAffected = adminGenre.insertGenre(newGenre);
//          System.out.println(rowsAffected + " row(s) inserted.");
//          adminGenre.getAll();
            
            //update--------------------------------
//            newGenre.setName("Wildlive");
//            adminGenre.updateGenre(newGenre);
//            adminGenre.getAll();
            
            //delete--------------------------------
            newGenre.setId(6);
            adminGenre.deleteGenre(newGenre.getGenreId());
            adminGenre.getAll();
        }catch(SQLException e){
            System.err.println("Error: " + e.getMessage());
        }
             
//            // select-----------------------------------------------------
//            String query = "SELECT name FROM students";
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                String name = rs.getString("name");
//                System.out.println("Name: " + name);
//            }
//            
//            // insert-----------------------------------------------------
//            String insertQuery = "INSERT INTO students (name) VALUES ('Jorge')";
//            int rowsAffected = stmt.executeUpdate(insertQuery);
//            System.out.println(rowsAffected + " row(s) inserted.");
        
        
    }
}
