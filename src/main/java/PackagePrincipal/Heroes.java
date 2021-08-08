/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackagePrincipal;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Heroes extends Personajes {
    private int AlmacendeOb;

    public int getAlmacendeOb() {
        return AlmacendeOb;
    }

    public void setAlmacendeOb(int AlmacendeOb) {
        this.AlmacendeOb = AlmacendeOb;
    }
    public void NiveldeEnergia(){
        System.out.println("---------------------------------------------");
        System.out.println("El nivel de vidas de tu personaje es: ");
        System.out.println(" *** 100 *** ");
    }     
    public void NumerodeVida(){
        System.out.println("El numero de vidas de tu personaje es: ");
        System.out.println(" *** 85 *** ");
    }   
    public void CapOfensiva(){
        System.out.println("La capacidad ofensiva de tu personaje es: ");
        System.out.println(" *** 50 *** ");
    }   
    public void AlmacendeOb(){
        System.out.println("La capacidad de almacenamiento es: ");
        System.out.println(" *** 0/3 *** ");
    }  
    private List<ObjetosMuebles> listaObMuebles;
    private List<ObjetosMuebles> listaObInmuebles;
}
