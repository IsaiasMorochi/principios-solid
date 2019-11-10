package com.isaias.solid.v1.interfacesegregation.con_isp.impl;

import com.isaias.solid.v1.interfacesegregation.con_isp.IFax;

public class Fax implements IFax {

    @Override
    public void telefono() {
        System.out.println("Te marco a un telefono.");
    }

    @Override
    public void faxear() {
        System.out.println("Envio un fax");
    }

}
