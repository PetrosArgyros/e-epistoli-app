
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
/**
 *
 * @author Giannhs Manolas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Icon ic = new Icon();
        ic.setVisible(true);
        long startTime = System.currentTimeMillis();
        long elapsedTime = 0L;
        while (elapsedTime < 2*60* 40) {
            //perform db poll/check
            elapsedTime = (new Date()).getTime() - startTime;
        }
       ic.setVisible(false);

        Proti_Selida ps = new Proti_Selida();
        ps.setVisible(true);

    }
    
}
