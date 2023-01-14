/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafosu3;

import Controlador.Grafo.GrafoDirigido;
import Controlador.Grafo.GrafoDirigidoEtiquetado;
import Controlador.Grafo.GrafoNoDirigido;
import Controlador.Grafo.GrafoNoDirigidoEtiquetado;
import Vista.FrmGrafo;

/**
 *
 * @author David Campoverde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        GrafoDirigido gd = new GrafoDirigido(4);
//        GrafoNoDirigido gnd = new GrafoNoDirigido(4);
////        System.out.println("Grafo dirigido");
////        System.out.println(gd);
//        System.out.println("---------------------------------------------------");
//        try {
////            gd.insertarArista(1, 3);
////            gd.insertarArista(1, 2);
////            gd.insertarArista(1, 4);
////            System.out.println(gd);
//            System.out.println("Grafo no dirigido");
//            gnd.insertarArista(4, 2);
//            gnd.insertarArista(4, 1);
//            gnd.insertarArista(4, 3);
//            new FrmGrafo(null, true, gnd).setVisible(true);
////            System.out.println(gnd);
//
//        } catch (Exception e) {
//            System.out.println("Error: "+e.getMessage());
//        }
//        GrafoDirigidoEtiquetado gde = new GrafoDirigidoEtiquetado(4, String.class);
//        
//        System.out.println(gde.toString());
//        gde.etiquetar(1, "Macas");
//        gde.etiquetar(2, "Luis");
//        gde.etiquetar(3, "Guilbert");
//        gde.etiquetar(4, "Santiago");
//        try {
//            gde.insertarAristaEtiquetada("Macas", "Luis", 10.0);
//            gde.insertarAristaEtiquetada("Macas", "Santiago", 23.0);
//            gde.insertarAristaEtiquetada("Santiago", "Macas", 23.0);
//            System.out.println(gde.toString());
//            new FrmGrafo(null, true, gde).setVisible(true);
//        } catch (Exception e) {
//        }
        
        GrafoNoDirigidoEtiquetado gnde = new GrafoNoDirigidoEtiquetado(4, String.class);

        gnde.etiquetar(1, "Macas");
        gnde.etiquetar(2, "Luis");
        gnde.etiquetar(3, "Guilbert");
        gnde.etiquetar(4, "Santiago");
        try {
            gnde.insertarAristaEtiquetada("Macas", "Luis", 10.0);
            gnde.insertarAristaEtiquetada("Luis", "Santiago", 23.0);
            gnde.insertarAristaEtiquetada("Santiago", "Guilbert", 23.0);
            System.out.println(gnde.toString());
            new FrmGrafo(null, true, gnde).setVisible(true);
        } catch (Exception e) {
        }
                   

    }
    
}
