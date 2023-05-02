/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mysql;

/**
 *
 * @author EJAS
 */
public class Genre {
    private int genreId;
    private String genreName;
    
    public Genre() {}
    
    public Genre(int pId,String pName){
        this.genreId = pId;
        this.genreName = pName;
    }
    
    //setters---------------------
    void setName(String pName){
        this.genreName = pName;
    }
    
    void setId(int id){
        this.genreId = id;
    }
    
    //getters---------------------
    public int getGenreId() {
        return genreId;
    }

    public String getGenreName() {
        return genreName;
    }
    
    
}
