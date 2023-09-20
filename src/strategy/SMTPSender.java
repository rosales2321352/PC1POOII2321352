/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author alumno
 */
public class SMTPSender implements MailSender {
    
    
    @Override
    public void send(String Mail){
    
        System.out.println(Mail);
        
    }
    
}
