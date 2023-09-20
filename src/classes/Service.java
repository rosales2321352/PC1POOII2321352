/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import strategy.MailSender;

/**
 *
 * @author alumno
 */
public class Service {

    MailSender mailSender;
  
    public Service(){}
    
    
    public void setMailSender(MailSender newSender){
        
        this.mailSender = newSender;
      
    }
    
    
    public void process(String Mail){
        
        this.mailSender.send(Mail);
        
    }
    
    
}
