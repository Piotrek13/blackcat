package pl.piotrpawlik.blackcat.shoppings;

import javax.persistence.*;

@Entity
public class Shopping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @OneToMany
    private String licytacja;
    private  double kup;
    private  double kupTeraz;
    private String koszyk;

    public Shopping(String licytacja, double kup, double kupTeraz, String koszyk) {
        this.licytacja = licytacja;
        this.kup = kup;
        this.kupTeraz = kupTeraz;
        this.koszyk = koszyk;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLicytacja() {
        return licytacja;
    }

    public void setLicytacja(String licytacja) {
        this.licytacja = licytacja;
    }

    public double getKup() {
        return kup;
    }

    public void setKup(double kup) {
        this.kup = kup;
    }

    public double getKupTeraz() {
        return kupTeraz;
    }

    public void setKupTeraz(double kupTeraz) {
        this.kupTeraz = kupTeraz;
    }

    public String getKoszyk() {
        return koszyk;
    }

    public void setKoszyk(String koszyk) {
        this.koszyk = koszyk;
    }
}
