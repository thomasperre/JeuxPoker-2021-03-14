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
public class Stats {
    //attributs
    private int cumulGain;
    private Partie partie;
    private Membre membre;
    
    //constructeurs
    public Stats(int cumulGain) {
        this.cumulGain = cumulGain;
    }
    
    
    //getter-setter

    /**
     * @return the cumulGain
     */
    public int getCumulGain() {
        return cumulGain;
    }

    /**
     * @param cumulGain the cumulGain to set
     */
    public void setCumulGain(int cumulGain) {
        this.cumulGain = cumulGain;
    }
    
    
    public Partie getPartie() {
        return partie;
    }

    public void setPartie(Partie partie) {
        this.partie = partie;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    public void afficher(){
        System.out.println(this.cumulGain);
        
    }
}
