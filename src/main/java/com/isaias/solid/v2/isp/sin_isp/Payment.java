package com.isaias.solid.v2.isp.sin_isp;

// interface de proposito general. (X)
public interface Payment {
    void calculatePayment();
    void creditCardPayment();
    void bankTransferPayment();
    void cashPayment();
}
