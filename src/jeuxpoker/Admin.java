package jeuxpoker;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Equipe 5
 */
public class Admin extends Personne {
    //attributs

    private int noAdmin;
    private static int nextNoAdmin = 1;
    private Set<Message> messages = new HashSet(0);

    //constructeurs
    public Admin(String nom, String prenom, Set<Message> messages) {
        super(nom, prenom);
        this.messages = messages;
        this.noAdmin = nextNoAdmin++;
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

    public void afficherNewAdmin() {
        System.out.print("Nouvel admin: " + this.noAdmin);
        System.out.println(" | Nom, prénom: " + this.nom + " " + this.prenom);
    }

}
