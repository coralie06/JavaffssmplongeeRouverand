/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import FFSSM.Club;
import FFSSM.Embauche;
import FFSSM.Licence;
import FFSSM.Plongeur;
import FFSSM.Moniteur;
import FFSSM.Personne;
import FFSSM.Plongee;
import FFSSM.Site;

import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author crouvera
 */
public class TestPlongee {

    Club club1;
    Embauche e1;
    Licence L1;
    Licence L2;
    Plongeur p1;
    Plongeur p2;
    Moniteur m1;
    Personne pers1;
    Personne pers2;
    Plongee plon1;
    Site site1;
Calendar dnd; 
Calendar dnd2;
Calendar d1; 
Calendar d2;
Calendar delivrance; 


    @Before
    public void setUp() {
        Calendar dnd = Calendar.getInstance();
        dnd.set(1987, 12, 12);
        
        Calendar dnd2 = Calendar.getInstance();
        dnd2.set(1970, 07, 01);
        
        Calendar debut = Calendar.getInstance();
        debut.set(2018, 06, 10);
        
        Calendar delivrance = Calendar.getInstance();
        delivrance.set(2017, 02, 11);
        
        //Calendar delivrance2 = Calendar.getInstance();
        //delivrance2.set(2018, 06 ,08);
        
        Calendar d1 = Calendar.getInstance();
        d1.set(2023, 03, 19);
        
        Calendar d2 = Calendar.getInstance();
        d2.set(2018, 06, 21);
        
        Plongeur p1 = new Plongeur("12", "BASON", "Camille", "2 avenue 2", "06156133", dnd, 4);
        Plongeur p2 = new Plongeur("13", "Chelle", "AURIANE", "3 avenue de la chambre", "06253586", dnd2, 4);
        Embauche e1 = new Embauche(debut, m1, club1);
        Licence L1 = new Licence(pers1, "26", delivrance, 4, club1);
        Personne pers1 = new Personne("12", "BASON", "Camille", "2 avenue 2", "06156133", dnd);
        Personne pers2 = new Personne("13", "Chelle", "AURIANE", "3 avenue de la chambre", "06253586", dnd2);
        Licence L2 = new Licence(pers2, "36", delivrance, 4, club1);
        Plongee plon1 = new Plongee(site1,m1,d1,16,4);
        Site site1 =new Site("Nice","Au bord de mer");
        Moniteur m1 = new Moniteur("56","Charles","Jean","adreddeofenp", "061666103",dnd,15);
        

        }
    
        @Test
        public void testestvalide(){
             Calendar dnd = Calendar.getInstance();
        dnd.set(1987, 12, 12);
        
        Calendar dnd2 = Calendar.getInstance();
        dnd2.set(1970, 07, 01);
        
        Calendar debut = Calendar.getInstance();
        debut.set(2018, 06, 10);
        
        Calendar delivrance = Calendar.getInstance();
        delivrance.set(2017, 02, 11);
        
        //Calendar delivrance2 = Calendar.getInstance();
        //delivrance2.set(2018, 06 ,08);
        
        Calendar d1 = Calendar.getInstance();
        d1.set(2023, 03, 19);
        
        Calendar d2 = Calendar.getInstance();
        d2.set(2018, 06, 21);
        
        Plongeur p1 = new Plongeur("12", "BASON", "Camille", "2 avenue 2", "06156133", dnd, 4);
        Plongeur p2 = new Plongeur("13", "Chelle", "AURIANE", "3 avenue de la chambre", "06253586", dnd2, 4);
        Embauche e1 = new Embauche(debut, m1, club1);
        Licence L1 = new Licence(pers1, "26", delivrance, 4, club1);
        Personne pers1 = new Personne("12", "BASON", "Camille", "2 avenue 2", "06156133", dnd);
        Personne pers2 = new Personne("13", "Chelle", "AURIANE", "3 avenue de la chambre", "06253586", dnd2);
        Licence L2 = new Licence(pers2, "36", delivrance, 4, club1);
        Plongee plon1 = new Plongee(site1,m1,d1,16,4);
        Site site1 =new Site("Nice","Au bord de mer");
        Moniteur m1 = new Moniteur("56","Charles","Jean","adreddeofenp", "061666103",dnd,15);
        
            assertFalse(L1.estValide(d1));
            
            
            
        }
       @Test
        
     public void TestConforme(){
              Calendar dnd = Calendar.getInstance();
        dnd.set(1987, 12, 12);
        
        Calendar dnd2 = Calendar.getInstance();
        dnd2.set(1970, 07, 01);
        
        Calendar debut = Calendar.getInstance();
        debut.set(2018, 06, 10);
        
        Calendar delivrance = Calendar.getInstance();
        delivrance.set(2017, 02, 11);
        
        //Calendar delivrance2 = Calendar.getInstance();
        //delivrance2.set(2018, 06 ,08);
        
        Calendar d1 = Calendar.getInstance();
        d1.set(2023, 03, 19);
        
        Calendar d2 = Calendar.getInstance();
        d2.set(2018, 06, 21);
        
        Plongeur p1 = new Plongeur("12", "BASON", "Camille", "2 avenue 2", "06156133", dnd, 4);
        Plongeur p2 = new Plongeur("13", "Chelle", "AURIANE", "3 avenue de la chambre", "06253586", dnd2, 4);
        Embauche e1 = new Embauche(debut, m1, club1);
        Licence L1 = new Licence(pers1, "26", delivrance, 4, club1);
        Personne pers1 = new Personne("12", "BASON", "Camille", "2 avenue 2", "06156133", dnd);
        Personne pers2 = new Personne("13", "Chelle", "AURIANE", "3 avenue de la chambre", "06253586", dnd2);
        Licence L2 = new Licence(pers2, "36", delivrance, 4, club1);
        Plongee plon1 = new Plongee(site1,m1,d1,16,4);
        Site site1 =new Site("Nice","Au bord de mer");
        Moniteur m1 = new Moniteur("56","Charles","Jean","adreddeofenp", "061666103",dnd,15);
        
       
        // une qui est valide et l'autre qui ne l'ai pas 
   //L1.estValide(d1);        
        //LA PLONGEE plon1 a contenir les deux plongeur 
//plon1.ajouteParticipant(p1);
        //plon1.ajouteParticipant(p2);
//donc la plongee n'est pas conforme
 assertFalse(plon1.estConforme());

 }
     
     @Test 
     
     public void testembaucheterminee(){
         
           Calendar dnd = Calendar.getInstance();
        dnd.set(1987, 12, 12);
        
        Calendar dnd2 = Calendar.getInstance();
        dnd2.set(1970, 07, 01);
        
        Calendar debut = Calendar.getInstance();
        debut.set(2018, 06, 10);
        
        Calendar delivrance = Calendar.getInstance();
        delivrance.set(2017, 02, 11);
        
        //Calendar delivrance2 = Calendar.getInstance();
        //delivrance2.set(2018, 06 ,08);
        
        Calendar d1 = Calendar.getInstance();
        d1.set(2023, 03, 19);
        
        Calendar d2 = Calendar.getInstance();
        d2.set(2018, 06, 21);
        
        Plongeur p1 = new Plongeur("12", "BASON", "Camille", "2 avenue 2", "06156133", dnd, 4);
        Plongeur p2 = new Plongeur("13", "Chelle", "AURIANE", "3 avenue de la chambre", "06253586", dnd2, 4);
        Embauche e1 = new Embauche(debut, m1, club1);
        Licence L1 = new Licence(pers1, "26", delivrance, 4, club1);
        Personne pers1 = new Personne("12", "BASON", "Camille", "2 avenue 2", "06156133", dnd);
        Personne pers2 = new Personne("13", "Chelle", "AURIANE", "3 avenue de la chambre", "06253586", dnd2);
        Licence L2 = new Licence(pers2, "36", delivrance, 4, club1);
        Plongee plon1 = new Plongee(site1,m1,d1,16,4);
        Site site1 =new Site("Nice","Au bord de mer");
        Moniteur m1 = new Moniteur("56","Charles","Jean","adreddeofenp", "061666103",dnd,15);
        
         assertFalse(e1.estTerminee());
     }

     
}
    
    
    

