/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author usuario
 */
public class modelo_factorial {

    public modelo_factorial() {
    }
    
    public void factorial(){
        int fac=1;
        String f="";
        for (int i=1; i<=10; i++){
            for (int j=1; j<=i; j++){
                fac=fac*j;
            }
            System.out.println("El factorial de "+i+" es: "+fac);
            fac=1;
        }
        
    }
}
