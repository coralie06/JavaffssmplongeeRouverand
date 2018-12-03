/**
 * @(#) Club.java
 */
package FFSSM;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Club {

 
    public Moniteur president;

    public String nom;

    public String adresse;

    public String telephone;
    
    public TreeSet<Plongee> lesPlongees;
    
    public TreeSet<Plongee> LesPlongeesNonConformes;

    public Club(Moniteur président, String nom, String telephone) {
        this.president = président;
        this.nom = nom;
        this.telephone = telephone;
       lesPlongees = new TreeSet<>();
       LesPlongeesNonConformes = new TreeSet<>();
    }

    public Set<Plongee> plongeesNonConformes() {
      for (Plongee g : lesPlongees ) {
          
          if (g.estConforme()==false){
              LesPlongeesNonConformes.add(g);
          } 
      }  
       return  LesPlongeesNonConformes;  
    }
    
    public void organisePlongee(Plongee p) {
    
        lesPlongees.add(p);
    }
    
    
    public Moniteur getPresident() {
        return president;
    }

    public void setPresident(Moniteur président) {
        this.president = président;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Club{" + "président=" + president + ", nom=" + nom + ", adresse=" + adresse + ", telephone=" + telephone + '}';
    }

}
