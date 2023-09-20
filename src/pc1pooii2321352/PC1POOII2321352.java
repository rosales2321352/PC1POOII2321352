/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pc1pooii2321352;

import classes.Service;
import strategy.SMTPSender;

/**
 *
 * @author alumno
 */
public class PC1POOII2321352 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Service service = new Service();
        
        service.setMailSender(new SMTPSender());
        service.process("New Sender SMTP");
        
        
        
    }
    
}
