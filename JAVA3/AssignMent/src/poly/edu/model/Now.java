/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author user
 */
public class Now extends Thread{
    public String baygio;
    @Override
    public void run() {
        while(true){
            LocalDateTime now = LocalDateTime.now();
            int gio = now.getHour();
            int phut = now.getMinute();
            baygio = gio +" pm : " + phut;
//            System.out.printf("%d : %d \n", gio, phut);
            try {
                Thread.sleep(60000);
            } catch (Exception e) {
                break;
            }
        }
        
         
    }
    
}
