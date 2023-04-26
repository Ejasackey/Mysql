/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mysql;
import java.sql.*;

/**
 *
 * @author EJAS
 */
public class AdminGenre {
    Statement stmt;
    Connection conn;
    String url = "jdbc:mysql://localhost/music";
    String username = "root";
    String password = "ejas";
    
    public AdminGenre(){
        try{
            this.conn = DriverManager.getConnection(url, username, password);
            System.out.println("Coonection successful");
            this.stmt = conn.createStatement();
        } catch(SQLException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    public int insertGenre(Genre genre)throws SQLException {
        try{
            String insertQuery = String.format("INSERT INTO genres (genre_name) VALUES ('%s')", genre.genreName);
            int rowsAffected = stmt.executeUpdate(insertQuery);
            return rowsAffected;
        } catch(SQLException e){
            throw e;
//            System.err.println("Error: " + e.getMessage());
        }
    }
    
    public void updateGenre(Genre genre){
        try{
            String updateQuery = String.format("UPDATE genres SET name = '%s' WHERE id = %d",genre.genreName, genre.genreId);
            int rowsAffected = stmt.executeUpdate(updateQuery);
            System.out.println(rowsAffected + " row(s) inserted.");
        } catch(SQLException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    public void deleteGenre(int genreId) {
        try{
            String deleteQuery = String.format("DELETE FROM genres WHERE id = %d", genreId);
            int rowsAffected = stmt.executeUpdate(deleteQuery);
            System.out.println(rowsAffected + " row(s) deleted.");
        } catch(SQLException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    public void getAll(){
        try{
            String query = "SELECT * FROM genres";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("genre_name");
                System.out.println("Name: " + name);
            }
        } catch(SQLException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    void closeConnection(){
        try{
            this.conn.close();
        } catch(SQLException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}
