package com.isaias.solid.v2.lsp.sin_lsp;

public class RolandGarrosCourt extends Court {

    @Override
    public void cutGrass(){
       throw new IllegalArgumentException("Tierra batida no tiene cescped que cortar.");
    }
}
