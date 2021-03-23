/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author santi
 */
public class nameHandler {
    
    private String  name;
    private String birth;
    private int edad, time;
    
    public nameHandler() {
        name = null;
        birth = null;
        time = Integer.parseInt(DateTimeFormatter.ofPattern("H").format(LocalTime.now()));
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public int getEdad() {
        
        return Period.between(LocalDate.parse(birth,DateTimeFormatter.ofPattern("d/M/y")),LocalDate.now()).getYears();
    }

    public int getTime() {
        return time;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }  
}

