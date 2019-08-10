package pl.piotrpawlik.blackcat.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String login;
    private String password;
    private String adres;
    private LocalDateTime dataZałożeniaKonta;
    private String statusKonta;
    private String type;

    public User(String login, String password, String adres, LocalDateTime dataZałożeniaKonta,
                String statusKonta, String type) {
        this.login = login;
        this.password = password;
        this.adres = adres;
        this.dataZałożeniaKonta = dataZałożeniaKonta;
        this.statusKonta = statusKonta;
        this.type = type;
    }


    public User() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public LocalDateTime getDataZałożeniaKonta() {
        return dataZałożeniaKonta;
    }

    public void setDataZałożeniaKonta(LocalDateTime dataZałożeniaKonta) {
        this.dataZałożeniaKonta = dataZałożeniaKonta;
    }

    public String getStatusKonta() {
        return statusKonta;
    }

    public void setStatusKonta(String statusKonta) {
        this.statusKonta = statusKonta;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
