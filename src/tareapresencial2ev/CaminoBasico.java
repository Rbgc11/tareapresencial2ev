/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapresencial2ev;

public class CaminoBasico {

    public int camino(int numero1, int numero2) {
        int resultado = 0;
        if (numero1 > 5 && numero2 > 10) {
            resultado = 55;
        } else if (numero2 < 10) {
            resultado = 100;
        }
        return resultado;
    }
}
