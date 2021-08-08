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
public class ObjetosMuebles {
    private int NivelEnergia;
    private int FacPotenciador;

    public int getNivelEnergia() {
        return NivelEnergia;
    }

    public void setNivelEnergia(int NivelEnergia) {
        this.NivelEnergia = NivelEnergia;
    }

    public int getFacPotenciador() {
        return FacPotenciador;
    }

    public void setFacPotenciador(int FacPotenciador) {
        this.FacPotenciador = FacPotenciador;
    }
    public void NivelEnergia(){
        System.out.println("El arma que a elegido el heroe cuenta con:");
        System.out.println("vidas al 50% ");
    }   
    public void FacPotenciador(){
        System.out.println("y su factor potenciador es: El enemigo mas cercano");
        System.out.println("--------------------------------------------------");
    }   
    
}
