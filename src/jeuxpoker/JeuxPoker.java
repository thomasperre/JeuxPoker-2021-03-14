/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuxpoker;

import java.util.Date;
import java.util.HashSet;
import org.xml.sax.ext.DeclHandler;

/**
 *
 * @author thomas
 */
public class JeuxPoker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Déclaration date
        Date date =new Date();
        
        //Déclaration Personne =>Personne is abstract donc on peut pas l'appeler
        
        //Déclaration admin
        Admin admin1 = new Admin("nomAdmin1","prenomAdmin1");
        Admin admin2 = new Admin("nomAdmin2","prenomAdmin2");
        Admin admin3 = new Admin("nomAdmin3","prenomAdmin3", 3, null);
        Admin admin4 = new Admin("nomAdmin4","prenomAdmin4", 4, null);
        HashSet listMessage = new HashSet(0);
                //admin2.setNoAdmin(1);
                //admin2.setMessages(listMessage);
               // admin2.getMessages();
              // System.out.println("voici admin1  " + admin1.getNom()+"prenom   "+admin1.getPrenom());
              // System.out.println(admin1.getMessages());
                
        admin1.afficher(); // affiche 1-[] et nomAdmin1-prenomAdmin1
        admin2.afficher();// affiche 2-[] et  nomAdmin2-prenomAdmin2
        admin3.afficher(); // affiche 2-null et  nomAdmin3-prenomAdmin3
        admin4.afficher();
        
        //Déclaration membre
        Membre mb1= new Membre("nomMembre1", "prenomMembre1");
        Membre mb2= new Membre("nomMembre2", "prenomMembre2");
        Membre mb3= new Membre("mb3.png", "MB3", "mb3@java.ca", 03 , "nomMembre3", "prenomMembre3");
        Membre mb4= new Membre("mb4.png", "MB4", "mb4@java.ca", 04 , "nomMembre4", "prenomMembre4");
                
        mb1.afficher(); //affiche 1-null-null-null-0 et nomMembre1-prenomMembre1
        mb2.afficher(); //affiche correctement
        mb3.afficher(); //affiche 3-mb3.png-MB3-mb3@java.ca-3 et nomMembre3-prenomMembre3
        mb4.afficher(); //affiche correctement

        //Déclaration message
        Message msg1 = new Message(); 
        Message msg2 = new Message(); 
        Message msg3 = new Message("reponseAdmin message3", admin4);
        Message msg4 = new Message("reponseAdmin message4",admin1);
        Message msg5 = new Message("messageMembre message5", mb1); 
        Message msg6 = new Message("messageMembre message5", mb3); 
        Message msg7 = new Message("messageMembre message7", "reponseAdmin message7", mb4, null, admin2); 
        Message msg8 = new Message("messageMembre message8", "reponseAdmin message8", mb4, null, admin4);

        //msg2.setContenuMessage("qwertyujm");
        //listMessage.add(msg2);  
        //System.out.println(msg2.getReponseAdmin());
        
        msg1.afficher(); //affiche null-null
        msg2.afficher(); //affiche null-null
        msg3.afficher(); //admin4 affiche son adresse mémoire
        msg4.afficher(); //admin1 affiche son adresse mémoire
        msg5.afficher();//affiche null-null
        msg6.afficher();//affiche null-null
        msg7.afficher(); //affiche Ø -msg7 -Ø - Ø -admin2 affiche son adresse mémoire
        msg8.afficher();//affiche Ø -msg8 -Ø - Ø -admin4 affiche son adresse mémoire
              
        
        
        //Déclaration billet
        Billet bn1 = new Billet();
        Billet bn2 = new Billet();
        Billet bn3 = new Billet(date);
        Billet bn4 = new Billet(date);
        Billet bn5 = new Billet(date, listMessage);
        Billet bn6 = new Billet(date, listMessage);
        
        //System.out.println(bn1.getNoBillet() );
        //System.out.println(bn2.getNoBillet() );
        //System.out.println(bn3.getNoBillet() );
        //System.out.println(bn1.getNoBillet() );
        // System.out.println(bn4.getNoBillet() );
      // System.out.println(bn4.getDateBillet());
      
      bn1.afficher(); // affiche 1-null-[]
      bn2.afficher();// affiche 2-null-[]
      bn3.afficher();// affiche 3-la date du moment-[]
      bn4.afficher();// affiche 4-la date du moment-[]
      bn5.afficher(); // affiche 5-la date du moment-[]
      bn6.afficher();// affiche 6-la date du moment-[]
      
        //Déclaration ami
        
        Ami ami1 = new Ami();
        Ami ami2 = new Ami();
        Ami ami3 = new Ami(date, true, mb2);
        Ami ami4 = new Ami(date, true, mb1);
        
        ami1.afficher(); // affichage null-false-null
        ami2.afficher(); //affichage null-false-null
        ami3.afficher();// affichage date du moment-true-adresse memoire membre2
        ami4.afficher();// affichage date du moment-true-adresse memoire membre1

        
        //Déclaration stats
        Stats stat1= new Stats(0); 
        Stats stat2= new Stats(9862);
        
        stat1.afficher(); //affichage 0
        stat2.afficher();
        
        //Déclaration partie
        Partie partie1 = new Partie();
        Partie partie2 = new Partie(date, null);
        
        partie1.afficher(); //affichage 0-null-null
        partie2.afficher();//affichage 1-date du moment-null

        
        //enum
         //EnumModedeJeu j1=EnumModedeJeu.Apprendre_A_Jouer;
        // EnumModedeJeu j2=EnumModedeJeu.Multi;
        // EnumModedeJeu j3=EnumModedeJeu.Solo;
        // System.out.println(j1 +" "+ j2+" " +j3);
        
        //Déclaration mode de jeu
       ModeDeJeu mode1= new ModeDeJeu();
       ModeDeJeu mode2= new ModeDeJeu(2,"Apprendre_A_Jouer");
       ModeDeJeu mode3= new ModeDeJeu(3,"Multi");
        
       
       mode1.afficher(); //affichage 0-null
       mode2.afficher(); //affichage 2-Apprendre_A_Jouer
       mode3.afficher(); //affichage 3-Multi
       
        //Déclaration commande
        Commande cde1 = new Commande();
        Commande cde2 = new Commande(213, date);
        Commande cde3 = new Commande(154, date);
        
        cde1.afficher(); // affichage 0-[]-null
        cde2.afficher(); // affichage 213-[]-date du moment
        cde3.afficher(); // affichage 154-[]-date du moment
        
        
        //Déclaration details
        Details detail1 = new Details(190, 5);
        Details detail2 = new Details(999, 3);
        
        detail1.afficher(); //affichage 190-5
        detail2.afficher();
        
        //Déclaration produits
        Produits produit1= new Produits("tablette", 190, "samsung v2, 1go");
        Produits produit2= new Produits("macbook air",999, "version 10, 32go");
                
        produit1.afficher(); //affichage 1-tablette-190-samsung v2, 1go
        produit2.afficher();
               
            
              
       
       
       
       
    
   














    }
    
}
