package pl.piotrpawlik.blackcat.transactionRatings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TransactionRating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private double ocenaSprzedającego;
    private String komentarzSprzedającego;
    private double ocenaKupującego;
    private String komentarzKupującego;

    public TransactionRating(double ocenaSprzedającego, String komentarzSprzedającego,
                             double ocenaKupującego, String komentarzKupującego) {
        this.ocenaSprzedającego = ocenaSprzedającego;
        this.komentarzSprzedającego = komentarzSprzedającego;
        this.ocenaKupującego = ocenaKupującego;
        this.komentarzKupującego = komentarzKupującego;
    }

    public TransactionRating() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getOcenaSprzedającego() {
        return ocenaSprzedającego;
    }

    public void setOcenaSprzedającego(double ocenaSprzedającego) {
        this.ocenaSprzedającego = ocenaSprzedającego;
    }

    public String getKomentarzSprzedającego() {
        return komentarzSprzedającego;
    }

    public void setKomentarzSprzedającego(String komentarzSprzedającego) {
        this.komentarzSprzedającego = komentarzSprzedającego;
    }

    public double getOcenaKupującego() {
        return ocenaKupującego;
    }

    public void setOcenaKupującego(double ocenaKupującego) {
        this.ocenaKupującego = ocenaKupującego;
    }

    public String getKomentarzKupującego() {
        return komentarzKupującego;
    }

    public void setKomentarzKupującego(String komentarzKupującego) {
        this.komentarzKupującego = komentarzKupującego;
    }
}
