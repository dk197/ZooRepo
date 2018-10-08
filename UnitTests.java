package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTests {

    @Test
    public void ZooObjektKannErstelltWerden(){
        Zoo meinZoo = new Zoo();
    }

    @Test
    public void KassenObjektKannErstelltWerden(){
        Kasse meineKasse= new Kasse();
    }

    @Test
    public void TicketObjektKannErstelltWerden(){
        Ticket meinTicket = new Ticket();
    }

    @Test
    public void BesucherObjektKannErstelltWerden(){
        Besucher meinBesucher = new Besucher();
    }

    @Test
    public void TicketKannGekauftWerden(){
        //AAA
        //Arrange
        Kasse meineKasse = new Kasse();

        //Action
        Ausgabe meineAusgabe = meineKasse.ticketKaufen(5.00);

        //Assert
        assertEquals(meineAusgabe.Ticket instanceof Ticket, true);
        assertEquals(meineAusgabe != null, true);
    }

    @Test
    public void TicketWirdNichtVerkauftWennWenigerAls5EuroUEbergebenWird(){
        //Arrange
        Kasse meineKasse = new Kasse();

        //Action
        Ausgabe meineAusgabe = meineKasse.ticketKaufen(4.00);

        //Assert
        assertEquals(meineAusgabe.Ticket == null, true);
    }

    @Test
    public void TicketWirdVerkauftWennMehrAlsFuenfEuroUEbergebenWird(){
        //Arrange
        Kasse meineKasse = new Kasse();

        //Action
        Ausgabe meineAusgabe = meineKasse.ticketKaufen(6.00);

        //Assert
        assertEquals(meineAusgabe.Ticket instanceof Ticket, true);
        assertEquals(meineAusgabe != null, true);
    }

    @Test
    public void TicketWirdVerkauftWennMehrAlsFuenfEuroUEbergebenWirdUndErstattetRueckgeld(){
        //Arrange
        Kasse meineKasse = new Kasse();

        //Action
        Ausgabe meineAusgabe = meineKasse.ticketKaufen(6.00);

        //Assert
        assertEquals(meineAusgabe.Ticket instanceof Ticket, true);
        assertEquals(meineAusgabe.Ticket != null, true);
        assertEquals(meineAusgabe.RueckGeld, 1.00);
    }

    @Test
    public void WennGeldNichtFuerTicketReichtWirdEsKomplettZurueckGegeben(){
        //Arrange
        Kasse meineKasse = new Kasse();

        //Action
        Ausgabe meineAusgabe = meineKasse.ticketKaufen(4.00);

        //Assert
        assertEquals(meineAusgabe.RueckGeld, 4.00);
    }


}
