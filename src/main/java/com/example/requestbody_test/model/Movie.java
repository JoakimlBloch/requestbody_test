package com.example.requestbody_test.model;

import jakarta.persistence.*;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long filmId;

    @Column(nullable = false)
    private String titel;

    @Column(nullable = false)
    private String beskrivelse;

    @Column(nullable = false)
    private int udgivelsesAar;

    public Movie() {}

    public Movie(String titel, String beskrivelse, int udgivelsesAar) {
        this.titel = titel;
        this.beskrivelse = beskrivelse;
        this.udgivelsesAar = udgivelsesAar;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public Long getFilmId() {
        return filmId;
    }

    public void setFilmId(Long filmId) {
        this.filmId = filmId;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public int getUdgivelsesAar() {
        return udgivelsesAar;
    }

    public void setUdgivelsesAar(int udgivelsesAar) {
        this.udgivelsesAar = udgivelsesAar;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "filmId=" + filmId +
                ", titel='" + titel + '\'' +
                ", beskrivelse='" + beskrivelse + '\'' +
                ", udgivelsesAar=" + udgivelsesAar +
                '}';
    }
}
