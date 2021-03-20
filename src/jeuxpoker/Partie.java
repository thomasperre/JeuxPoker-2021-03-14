package jeuxpoker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Equipe 5
 */
public class Partie {

    //attributs
    private int noPartie;
    private static int NextNoPartie = 1;
    private Date datePartie;
    private EnumModedeJeu modeDeJeu;
    private List<Membre> membres;

    //constructeurs
    public Partie(Date datePartie, EnumModedeJeu modeDeJeu) {
        noPartie = NextNoPartie++;
        this.datePartie = datePartie;
        this.modeDeJeu = modeDeJeu;
        membres = new ArrayList();
    }

    public int getNoPartie() {
        return noPartie;
    }

    public Date getDatePartie() {
        return datePartie;
    }

    public EnumModedeJeu getModeDeJeu() {
        return modeDeJeu;
    }

    public void setModeDeJeu(EnumModedeJeu modeDeJeu) {
        this.modeDeJeu = modeDeJeu;
    }

    public void setDatePartie(Date datePartie) {
        this.datePartie = datePartie;
    }

    public List<Membre> getMembres() {
        return membres;
    }

    public void setMembres(List<Membre> membres) {
        this.membres = membres;
    }

    public void addMembre(Membre m) {
        if (!membres.contains(m)) {
            membres.add(m);
            m.addPartie(this);
        }
    }

    public void afficherPartie() {
        System.out.println(this.noPartie + "-" + this.datePartie + "-" + this.modeDeJeu);

    }

    public void afficherAllMembresPartie() {
        System.out.println("/////////ALL membres partie//////////////////////////////////////////////////");
        System.out.println("No partie : " + this.getNoPartie());
        this.getMembres().forEach(item -> {
            System.out.print("| " + item.getNom() + "| \t");
        });
        System.out.println("");
    }

    public static void afficherModeDeJeu() {
        for (EnumModedeJeu val : EnumModedeJeu.values()) {
            System.out.println(val);
        }
    }

}
