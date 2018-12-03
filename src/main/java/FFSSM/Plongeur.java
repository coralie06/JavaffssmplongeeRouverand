package FFSSM;

import java.util.ArrayList;
import java.util.Calendar;

public class Plongeur extends Personne {
	
    public int niveau;
    public ArrayList<Licence> LesLicences;
    
    public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance, int niveau) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.niveau=niveau;
        LesLicences = new ArrayList<>();
    }
	public void ajouteLicence(Licence e){
            LesLicences.add(e);
            
        }
        public Licence getLicence(){
            return LesLicences.get(LesLicences.size()-1);
        }
}
