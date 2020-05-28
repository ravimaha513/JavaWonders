package com.info.interfaces;

public class AmericanTranslator implements ITranslator {
    @Override
    public void listen() {
        System.out.println("Listen to Mr.Modi from India");

    }

    @Override
    public LanguageTranslate translate() {

        return new LanguageTranslate("Hindi", "English");
    }

    @Override
    public WriteNotes writeNotes() {
        WriteNotes wrt = new WriteNotes();
        wrt.setConvEnglish("Convert Hindi");
        wrt.setConvHindi("Translate in English");
        return wrt;
    }
}
