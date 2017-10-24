/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasmuyusadas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alba Proyecto
 */
public class EstructurasMuyUsadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /****EJEMPPLO DE COMO PODEMOS METER DE TODO EN UNA LISTA SI NO ESPECIFICAMOS EL TIPO****/
        List lista=new ArrayList();
        ArrayList<EstructurasMuyUsadas> g =new ArrayList<EstructurasMuyUsadas>();
        EstructurasMuyUsadas g_class=new EstructurasMuyUsadas();
        g.add(g_class);
        lista.add("hola");
        lista.add(3);
        lista.add(true);
        lista.add(g);
        for (Object generics : lista) {
            System.out.println(" "+generics.toString());
        }
    }
    
}
