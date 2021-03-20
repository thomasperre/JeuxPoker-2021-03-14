package jeuxpoker;

import java.util.Date;
import static jeuxpoker.utilitaires.retourDate;

/**
 *
 * @author Equipe 5
 */
public class Ami {
    //attributs

    public Date dateDemande;
    public boolean EtatDemande;
    public Membre membre;

    //constructeurs
    public Ami(Date dateDemande, boolean EtatDemande, Membre membre) {
        this.dateDemande = dateDemande;
        this.EtatDemande = EtatDemande;
        this.membre = membre;
    }

    //getter-setter
    public Date getDateDemande() {
        return dateDemande;
    }

    public boolean isEtatDemande() {
        return EtatDemande;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setDateDemande(Date dateDemande) {
        this.dateDemande = dateDemande;
    }

    public void setEtatDemande(boolean EtatDemande) {
        this.EtatDemande = EtatDemande;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    public void afficherDemandeAmi() {
        System.out.print("Demande d'ami: " + this.membre.getNoMembre());
        System.out.print(" | Nom, prénom: " + this.membre.getNom() + " " + this.membre.getPrenom());
        System.out.print(" | Date: " + retourDate(this.dateDemande));
        System.out.println(" | État demande: " + this.EtatDemande);
    }
}
