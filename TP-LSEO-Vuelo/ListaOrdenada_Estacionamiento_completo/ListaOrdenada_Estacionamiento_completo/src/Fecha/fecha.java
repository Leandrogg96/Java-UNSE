/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fecha;

import java.time.LocalDate;

/**
 *
 * @author Kelly Zarco
 */
import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class fecha {
    private int dia;
    private int mes;
    private int año;
    LocalDate date;
    Locale l = new Locale("es","AR");
    
    public fecha(int dia, int mes, int anio) {
        this.dia=dia;
        this.mes=mes;
        this.año=anio;
    }
   public fecha()
    {
       date = LocalDate.now(); 
    }
   
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
    public static fecha fechaActual()
    {
        LocalDate actual = LocalDate.now();
        return new fecha(actual.getDayOfMonth(),actual.getMonth().getValue(),actual.getYear());
        
    }
  public String getNombreMes()
    {
        return  date.getMonth().getDisplayName(TextStyle.FULL,l);
    }
  
    public int getAño() {
        return año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }
     public String toString()
    {
        return getDia()+" "+getMes()+ " "+getAño();
    }
      
}
