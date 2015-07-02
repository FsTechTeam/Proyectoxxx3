/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Toshiba
 */
@Entity
public class Articulo implements Serializable {
    private int id;
    private String des;
    private int pco;
    private int por;
    private int pve;
    private int can;
    private Tipo tipo;
    

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPco() {
        return pco;
    }

    public void setPco(int pco) {
        this.pco = pco;
    }

    public int getPor() {
        return por;
    }

    public void setPor(int por) {
        this.por = por;
    }

    public int getPve() {
        return pve;
    }

    public void setPve(int pve) {
        this.pve = pve;
    }

    @ManyToOne
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
       
    
}
