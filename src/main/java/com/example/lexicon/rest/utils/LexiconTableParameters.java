package com.example.lexicon.rest.utils;

import lombok.Data;

@Data
public class LexiconTableParameters {
    private String bcc;
    private String eng;
    private String pos;
    private String bcc_latin_com;
    private String bcc_latin_sci;
    private String fa;
    private String ur;

    public LexiconTableParameters(String bcc, String eng, String pos, String bcc_latin_com, String bcc_latin_sci, String fa, String ur) {
        this.bcc = bcc;
        this.eng = eng;
        this.pos = pos;
        this.bcc_latin_com = bcc_latin_com;
        this.bcc_latin_sci = bcc_latin_sci;
        this.fa = fa;
        this.ur = ur;
    }
}
