/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuxpoker;

import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author thomas
 */
public class JeuxPoker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date date =new Date();
                Admin admin1 = new Admin("gbh","gfr");
                Message msg1 = new Message("reponse à l'admin",admin1);
                Message msg2 = new Message();
                Billet bn1 = new Billet();
               Billet bn2 = new Billet();
                              Billet bn3 = new Billet();
               Billet bn4 = new Billet(date);

msg2.setContenuMessage("qwertyujm");
                HashSet listMessage = new HashSet(0);
        listMessage.add(msg2);
        
                  Admin admin2 = new Admin("gbh","gfr");
                admin2.setNoAdmin(1);
                admin2.setMessages(listMessage);
                admin2.getMessages();
               System.out.println("voici admin1  " + admin1.getNom()+"prenom   "+admin1.getPrenom());
               System.out.println(admin1.getMessages());
            System.out.println(msg2.getReponseAdmin());
            System.out.println(bn1.getNoBillet() );
        System.out.println(bn2.getNoBillet() );
        System.out.println(bn3.getNoBillet() );
        System.out.println(bn1.getNoBillet() );
         System.out.println(bn4.getNoBillet() );
       System.out.println(bn4.getDateBillet());
              
       
       
       
       EnumModedeJeu j1=EnumModedeJeu.Apprendre_A_Jouer;
       EnumModedeJeu j2=EnumModedeJeu.Multi;
       EnumModedeJeu j3=EnumModedeJeu.Solo;
        System.out.println(j1 +" "+ j2+" " +j3);
              
       
       
    }
    
}
