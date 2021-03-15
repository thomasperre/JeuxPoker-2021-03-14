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
public class ModeDeJeu {
       //attributs
    private int codeMode;
    private String nomMode;
     private Set<Partie> parties= new HashSet(0);
    
    //constructeurs

    public ModeDeJeu() {
    }

    public ModeDeJeu(int codeMode, String nomMode) {
        this.codeMode = codeMode;
        this.nomMode = nomMode;
    }

    public int getCodeMode() {
        return codeMode;
    }

    public String getNomMode() {
        return nomMode;
    }

    public Set<Partie> getParties() {
        return parties;
    }

    public void setCodeMode(int codeMode) {
        this.codeMode = codeMode;
    }

    public void setNomMode(String nomMode) {
        this.nomMode = nomMode;
    }

    public void setParties(Set<Partie> parties) {
        this.parties = parties;
    }

   




}