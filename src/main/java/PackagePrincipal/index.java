/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackagePrincipal;

/**
 *
 * @author Usuario
 */
public class index {
    public static void main(String[] args){
        Heroes heroe1 = new Heroes();
        heroe1.NiveldeEnergia();
        heroe1.NumerodeVida();
        heroe1.CapOfensiva();
        heroe1.AlmacendeOb();
        
        ObjetosMuebles arma = new ObjetosMuebles();
        arma.NivelEnergia();
        arma.FacPotenciador();
        
        Enemigos enemigo1 = new Enemigos();
        enemigo1.NiveldeEnergia();
        enemigo1.NumerodeVida();
        enemigo1.CapOfensiva();
    
        
        
        
}
}
