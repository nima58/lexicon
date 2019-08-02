package com.example.lexicon.rest.utils;

public enum Pos {
    ADJECTIVE("Adjective"),
    ADJECTIVE_ADVERB("Adjective/Adverb"),
    ADVERB("Adverb"),
    AMBITRANSITIVE_VERB("Ambitransitive verb"),
    CONJUNCTION("Conjunction"),
    COPULA_VERB("Copula verb"),
    DEMONSTRATIVE("Demonstrative"),
    DEMONSTRATIVE_PRONOUN("Demonstrative pronoun"),
    INDEFINITE_CLITIC("Indefinite clitic"),
    INTERJECTION("Interjection"),
    INTERROGATIVE_PRONOUN("Interrogative pronoun"),
    INTRANSITIVE_VERB("Intransitive verb"),
    NOUN("Noun"),
    NOUN_ADJECTIVE("Noun/Adjective"),
    NUMERAL("Numeral"),
    PARTICLE("Particle"),
    PERSONAL_PRONOUN("Personal pronoun"),
    POSTPOSITION("Postposition"),
    PREPOSITION("Preposition"),
    PREVERB("Preverb"),
    PREVERBAL_VERB("Preverbal verb"),
    PRONOMINAL_CLITIC("Pronominal clitic"),
    PROPER_NOUN("Proper  Noun"),
    QUANTIFIER("Quantifier"),
    REFLEXIVE_PRONOUN("Reflexive pronoun"),
    SUBORDINATING_CONJUNCTION("Subordinating conjunction"),
    TRANSITIVE_VERB("Transitive verb"),
    VERB("Verb"),
    VERB_CLITIC("Verb clitic");

    private String pos;

    Pos(String pos){
        this.pos = pos;
    }

    public String getPos() {
        return pos;
    }
}
