/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Grafo;

import Controlador.ListaEnlazada.ListaEnlazada;

/**
 *
 * @author David Campoverde
 */
public abstract class Grafo {

    /**
     * Es el numero de vertices del grafo
     *
     * @return
     */
    public abstract Integer numVertices();

    public abstract Integer numAristas();

    public abstract Boolean existeArista(Integer origen, Integer destino) throws Exception;

    public abstract Double pesoArista(Integer origen, Integer destino);

    public abstract void insertarArista(Integer origen, Integer destino)throws Exception;

    public abstract void insertarArista(Integer origen, Integer destino, Double peso)throws Exception;

    public abstract ListaEnlazada<Adyacencia> adyacentes(Integer vertice);

    @Override
    public String toString() {
        StringBuffer grafo = new StringBuffer("");
        try {
            for (int i = 1; i <= numVertices(); i++) {
                grafo.append("Vertice " + String.valueOf(i));
                ListaEnlazada<Adyacencia> lista = adyacentes(i);
                for (int j = 0; j < lista.getSize(); j++) {

                    Adyacencia a = lista.obtener(j);
                    if (a.getPeso().toString().equalsIgnoreCase(String.valueOf(Double.NaN))) {
                        grafo.append("-- vertice destino: " + a.getDestino() + " -- SP");
                    } else {
                        grafo.append("-- vertice destino: " + a.getDestino() + " -- Peso: " + a.getPeso());
                    }
                }
                grafo.append("\n");
            }
        } catch (Exception e) {
            grafo.append(e.getMessage());
        }
        return grafo.toString();
    }

}
