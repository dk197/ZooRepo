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
}
