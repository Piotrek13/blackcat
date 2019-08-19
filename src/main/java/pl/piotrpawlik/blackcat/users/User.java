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
    private  String login;
    private  String password;
    private String adres;
    private LocalDateTime dataZałożeniaKonta;
    private boolean statusKonta;
    private String role;

    public User(String login, String password, String adres, LocalDateTime dataZałożeniaKonta,
                boolean statusKonta, String role) {
        this.login = login;
        this.password = password;
        this.adres = adres;
        this.dataZałożeniaKonta = dataZałożeniaKonta;
        this.statusKonta = statusKonta;
        this.role = role;
    }


    public User() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public  String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public  String getPassword() {
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

    public boolean getStatusKonta() {
        return statusKonta;
    }

    public void setStatusKonta(boolean statusKonta) {
        this.statusKonta = statusKonta;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
