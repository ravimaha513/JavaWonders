package com.info.interfaces;

public class LanguageTranslate {

    public String fromLanguage ;
    public String toLanguage ;

    public LanguageTranslate(String fromLanguage, String toLanguage) {
        this.fromLanguage = fromLanguage;
        this.toLanguage = toLanguage;
    }

    public String getFromLanguage() {
        return fromLanguage;
    }

    public void setFromLanguage(String fromLanguage) {
        this.fromLanguage = fromLanguage;
    }

    public String getToLanguage() {
        return toLanguage;
    }

    public void setToLanguage(String toLanguage) {
        this.toLanguage = toLanguage;
    }
}
