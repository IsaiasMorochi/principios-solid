package com.isaias.solid.v2.lsp;

import com.isaias.solid.v2.lsp.con_lsp.GrassCourt;
import com.isaias.solid.v2.lsp.con_lsp.impl.MallorcaOpen;
import com.isaias.solid.v2.lsp.con_lsp.impl.WimbledonCourt;
//import com.isaias.solid.v2.lsp.sin_lsp.AustraliaOpen;
//import com.isaias.solid.v2.lsp.sin_lsp.Court;
//import com.isaias.solid.v2.lsp.sin_lsp.RolandGarrosCourt;
//import com.isaias.solid.v2.lsp.sin_lsp.WimbledonCourt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * 3er Principle
     * LSP (Liskov Substitution Principle)
     * 1.- Cualquier clase que sea hija de una clase padre, deberia poder usarse en lugar
     *     de su padre sin ningun comportamiento inesperado.
     */

    /**
     * Especificacion
     * 1- Diseña una clase de base Pista de Tenis.
     * 2- Diseña la pista de Wimbledon.
     * 3- Diseña la pista de RolandGarros.
     * 4- Diseña la pista de AustraliaOpen.
     */

    public static void main(String[] args) {

        // sin lsp
//        testCourt();

        // con lsp
        testGrassCourt();

    }

    /*
    public static void testCourt(){
        List<Court> courts = new ArrayList<Court>();
        courts.add(new WimbledonCourt());
        courts.add(new AustraliaOpen());
        courts.add(new RolandGarrosCourt());

        for (Court court : courts) {
            court.cutGrass();
        }
    }*/

    public static void testGrassCourt() {
        List<GrassCourt> courts = new ArrayList<GrassCourt>();
        courts.add(new WimbledonCourt());
        courts.add(new MallorcaOpen());

        for (GrassCourt court : courts) {
            court.cutGrass();
        }
    }
}
