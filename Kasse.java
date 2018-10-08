package com.company;

public class Kasse {

    public Ausgabe ticketKaufen(double geld) {
        if(geld<5.00) {
            Ausgabe ausgabe = new Ausgabe();
            ausgabe.RueckGeld = geld;
            return ausgabe;
        }
        Ausgabe ausgabe = new Ausgabe();
        ausgabe.Ticket = new Ticket();
        ausgabe.RueckGeld =geld-5.00;
        return ausgabe;
    }
}
