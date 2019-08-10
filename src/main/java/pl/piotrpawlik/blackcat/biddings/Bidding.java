package pl.piotrpawlik.blackcat.biddings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bidding {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String aukcja;
    private String user;
    private double kwota;

    public Bidding(String aukcja, String user, double kwota) {
        this.aukcja = aukcja;
        this.user = user;
        this.kwota = kwota;
    }

    public Bidding() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAukcja() {
        return aukcja;
    }

    public void setAukcja(String aukcja) {
        this.aukcja = aukcja;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }
}
