package pl.piotrpawlik.blackcat.auctions;

import pl.piotrpawlik.blackcat.categories.Category;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String name;
    @OneToOne
    private Category category;
    private boolean promowana;
    private double kwotaMin;
    private double kwotaObecna;
    private LocalDateTime dataWystawienia;
    private LocalDateTime dataZakończenia;
    private Long ilośćOdwiedzin;

    @Column(length = 4000)
    private String opis;

    public Auction(String name, Category category, boolean promowana, double kwotaMin, double kwotaObecna, LocalDateTime dataWystawienia, LocalDateTime dataZakończenia, Long ilośćOdwiedzin, String opis) {

        this.name = name;
        this.promowana = promowana;
        this.kwotaMin = kwotaMin;
        this.kwotaObecna = kwotaObecna;
        this.dataWystawienia = dataWystawienia;
        this.dataZakończenia = dataZakończenia;
        this.ilośćOdwiedzin = ilośćOdwiedzin;
        this.opis = opis;
    }

    public Auction() { }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPromowana() {
        return promowana;
    }

    public void setPromowana(boolean promowana) {
        this.promowana = promowana;
    }

    public double getKwotaMin() {
        return kwotaMin;
    }

    public void setKwotaMin(double kwotaMin) {
        this.kwotaMin = kwotaMin;
    }

    public double getKwotaObecna() {
        return kwotaObecna;
    }

    public void setKwotaObecna(double kwotaObecna) {
        this.kwotaObecna = kwotaObecna;
    }

    public LocalDateTime getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(LocalDateTime dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    public LocalDateTime getDataZakończenia() {
        return dataZakończenia;
    }

    public void setDataZakończenia(LocalDateTime dataZakończenia) {
        this.dataZakończenia = dataZakończenia;
    }

    public Long getIlośćOdwiedzin() {
        return ilośćOdwiedzin;
    }

    public void setIlośćOdwiedzin(Long ilośćOdwiedzin) {
        this.ilośćOdwiedzin = ilośćOdwiedzin;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
