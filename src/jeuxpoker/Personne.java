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
public abstract class Personne {
       //attributs
    protected String nom;
    protected String prenom;
    
    
    //constructeurs
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    
    
    //getter-setter

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    //méthode

    public void afficher(){
        System.out.println(this.nom+"-"+this.prenom);
    }
    
    
    
    
    
}
