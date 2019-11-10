package com.isaias.solid.v2.lsp.con_lsp.impl;

import com.isaias.solid.v2.lsp.con_lsp.Court;
import com.isaias.solid.v2.lsp.con_lsp.GrassCourt;

public class MallorcaOpen extends Court implements GrassCourt {

    @Override
    public void cutGrass() {
        System.out.println("Cortando el cesped en MallorcaOpen");
    }

}
