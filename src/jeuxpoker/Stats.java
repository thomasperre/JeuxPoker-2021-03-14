package jeuxpoker;

/**
 *
 * @author Equipe 5
 */
public class Stats {
    //attributs
    private double cumulGain;
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
    public double getCumulGain() {
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
