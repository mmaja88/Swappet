package Swappet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "korisnik")
public class Korisnik {

    @Id
    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @Column(name = "idkorisnik", unique = true, nullable = false)
    private Integer idKorisnik;

    @Column(name = "username", unique = true, nullable = false, length = 100)
    private String username;

    public Korisnik(Integer idKorisnik, String email, String username) {
        this.idKorisnik = idKorisnik;
        this.email = email;
        this.username = username;
    }

    public Korisnik() {

    }

    // Getteri i setteri
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdKorisnik() {
        return idKorisnik;
    }

    public void setIdKorisnik(Integer idKorisnik) {
        this.idKorisnik = idKorisnik;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
