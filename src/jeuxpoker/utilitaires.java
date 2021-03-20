package jeuxpoker;

import java.time.DateTimeException;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Equipe 5
 */
public class utilitaires {

    public static String retourDate(Date dt) {

        try {
            Calendar cal = Calendar.getInstance();

            cal.setTime(dt);

            int annee = cal.get(Calendar.YEAR);
            int mois = cal.get(Calendar.MONTH) + 1;
            int jour = cal.get(Calendar.DAY_OF_MONTH);

            return (annee + "-" + (mois < 10 ? ("0" + mois) : (mois)) + "-" + jour);

        } catch (DateTimeException e) {
            System.out.println(e);
            return "";
        }

    }

}
