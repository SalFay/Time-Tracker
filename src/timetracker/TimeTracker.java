/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetracker;

import com.skype.ChatMessage;
import com.skype.ChatMessageEditListener;
import com.skype.ChatMessageListener;
import com.skype.ContactList;
import com.skype.Friend;
import com.skype.Skype;
import com.skype.SkypeException;
import com.skype.User;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Fayaz.K
 */
public class TimeTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SkypeException {
        boolean isInstalled = Skype.isInstalled();
        if(!isInstalled){
            JOptionPane.showMessageDialog(null, "Skype is not Installed on your System.");
            System.exit(0);
        }
        boolean isRunning = Skype.isRunning();
        if(!isRunning){
            JOptionPane.showMessageDialog(null, "Skype is not running. Please open Skype first");
            System.exit(0);
        }
        
        
        ContactList cl =  Skype.getContactList();
        for(Friend f :cl.getAllFriends()){
            System.out.println(f.getFullName());
        }
        JOptionPane.showMessageDialog(null, "Skype is Installed and running");
    }
}
