/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuxpoker;

/**
 *
 * @author thomas
 */
public class Message {
    //attributs
    private String contenuMessage;
    private String reponseAdmin;
    private Membre membre;
    private Billet billet;
    private Admin admin;
    
    //constructeur

    public Message() {
    }

    public Message(String reponseAdmin, Admin admin) {
        this.reponseAdmin = reponseAdmin;
        this.admin = admin;
    }

    
    public Message(String contenuMessage, Membre membre) {
        this.contenuMessage = contenuMessage;
        this.membre = membre;
    }

    public Message(String contenuMessage, String reponseAdmin, Membre membre, Billet billet, Admin admin) {
        this.contenuMessage = contenuMessage;
        this.reponseAdmin = reponseAdmin;
        this.membre = membre;
        this.billet=billet;
        this.admin=admin;
    }

    
    
    //getter-setter

    /**
     * @return the contenuMessage
     */
    public String getContenuMessage() {
        return contenuMessage;
    }

    /**
     * @param contenuMessage the contenuMessage to set
     */
    public void setContenuMessage(String contenuMessage) {
        this.contenuMessage = contenuMessage;
    }

    /**
     * @return the reponseAdmin
     */
    public String getReponseAdmin() {
        return reponseAdmin;
    }

    /**
     * @param reponseAdmin the reponseAdmin to set
     */
    public void setReponseAdmin(String reponseAdmin) {
        this.reponseAdmin = reponseAdmin;
    }

    /**
     * @param membre the membre to set
     */
    public void setMembre(Membre membre) {
        this.membre = membre;
    }
   
    /**
     * @return the membre
     */
    public Membre getMembre() {
        return membre;
    }

    /**
     * @return the billet
     */
    public Billet getBillet() {
        return billet;
    }

    /**
     * @param billet the billet to set
     */
    public void setBillet(Billet billet) {
        this.billet = billet;
    }

    /**
     * @return the admin
     */
    public Admin getAdmin() {
        return admin;
    }

    /**
     * @param admin the admin to set
     */
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    
     //méthode
    
}
