package com.example.lexicon.rest.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "baluchi_english", schema = "dbo", catalog = "Baluchi_English_Lexicon")
public class LexEntry {
    private int id;
    private String bcc;
    private String eng;
    private String pos;
    private String bccLatinCom;
    private String bccLatinSci;
    private String fa;
    private String ur;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "bcc", nullable = false, length = 200)
    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    @Basic
    @Column(name = "eng", length = 200)
    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    @Basic
    @Column(name = "pos", length = 45)
    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    @Basic
    @Column(name = "bcc_latin_com",  length = 200)
    public String getBccLatinCom() {
        return bccLatinCom;
    }

    public void setBccLatinCom(String bccLatinCom) {
        this.bccLatinCom = bccLatinCom;
    }

    @Basic
    @Column(name = "bcc_latin_sci", length = 200)
    public String getBccLatinSci() {
        return bccLatinSci;
    }

    public void setBccLatinSci(String bccLatinSci) {
        this.bccLatinSci = bccLatinSci;
    }

    @Basic
    @Column(name = "fa", length = 200)
    public String getFa() {
        return fa;
    }

    public void setFa(String fa) {
        this.fa = fa;
    }

    @Basic
    @Column(name = "ur", length = 200)
    public String getUr() {
        return ur;
    }

    public void setUr(String ur) {
        this.ur = ur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LexEntry that = (LexEntry) o;
        return id == that.id &&
                Objects.equals(bcc, that.bcc) &&
                Objects.equals(eng, that.eng) &&
                Objects.equals(pos, that.pos) &&
                Objects.equals(bccLatinCom, that.bccLatinCom) &&
                Objects.equals(bccLatinSci, that.bccLatinSci) &&
                Objects.equals(fa, that.fa) &&
                Objects.equals(ur, that.ur);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, bcc, eng, pos, bccLatinCom, bccLatinSci, fa, ur);
    }
}
