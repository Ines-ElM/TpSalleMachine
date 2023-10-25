/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author elmeh
 */

import java.io.Serializable;

public class Salle implements Serializable{
    
    private int id;
    private String sCode;
 

    public Salle() {
    }

    public Salle(String code) {
        this.sCode = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return sCode;
    }

    public void setCode(String code) {
        this.sCode = code;
    }

   
    @Override
    public String toString() {
        return  sCode ;
    }
}