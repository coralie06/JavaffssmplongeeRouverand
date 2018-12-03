/**
 * @(#) Plongee.java
 */
package FFSSM;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Plongee {

    public Site lieu;

    public Moniteur chefDePalanquee;

    public Calendar date;

    public int profondeur;

    public int duree;
    
    public TreeSet<Plongeur> LesPlongeurs;

    public Plongee(Site lieu, Moniteur chefDePalanquee, Calendar date, int profondeur, int duree) {
        this.lieu = lieu;
        this.chefDePalanquee = chefDePalanquee;
        this.date = date;
        this.profondeur = profondeur;
        this.duree = duree;
        LesPlongeurs = new TreeSet<>();
    }

    public void ajouteParticipant(Plongeur participant) {
 	    LesPlongeurs.add(participant);
    }

    public Calendar getDate() {
        return date;
    }

    public boolean estConforme() {
         boolean valeur = false;
        
         
        for (Plongeur participant : LesPlongeurs){
           
        
                if (false==participant.getLicence().estValide(this.date))
                {
                    valeur = false;
                } }
                
                
                
        
        
           
        
return valeur;
    
}
}
 /**   public boolean estConforme() {
         boolean valeur = false;
        
         
        for (Plongeur participant : LesPlongeurs){
           
        
                if (true==participant.getLicence().estValide(date))
                {
                    valeur = true;
                } 
                else {
                valeur = false;
                }
                if (valeur==false){
                    valeur2=false;
                }
                
                
                }**/
        
        
           
