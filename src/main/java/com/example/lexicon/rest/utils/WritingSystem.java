package com.example.lexicon.rest.utils;

public enum WritingSystem {
    BCC("bcc"),
    BCC_LATIN_COM("bcc-latin-com"),
    BCC_LATIN_SCI("bcc-latin-sci"),
    ENG("eng"),
    FA("fa"),
    UR("ur");

    String ws;

    WritingSystem(String ws){
        this.ws = ws;
    }

    public String getWs() {
        return ws;
    }


}
