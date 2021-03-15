/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuxpoker;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author thomas
 */
public class Admin extends Personne {
       //attributs
    private int noAdmin;
    private Set<Message> messages=new HashSet(0);;
    
    
    //constructeurs
        

    public Admin(String nom, String prenom) {
        super(nom, prenom);
        
    }

    public Admin(String nom, String prenom, int noAdmin, Set<Message> messages) {
        super(nom, prenom);
        this.noAdmin = noAdmin;
        this.messages=messages;
    }
    
    
    //getter-setter
    
   
    /**
     * @return the noAdmin
     */
    public int getNoAdmin() {
        return noAdmin;
    }

    /**
     * @param noAdmin the noAdmin to set
     */
    public void setNoAdmin(int noAdmin) {
        this.noAdmin = noAdmin;
    }

    public Set<Message> getMessages() {
        return messages;
    }

    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    
    
}
