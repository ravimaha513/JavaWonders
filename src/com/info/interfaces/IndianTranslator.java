package com.info.interfaces;

public class IndianTranslator implements ITranslator {

    @Override
    public void listen() {
        System.out.println("Listen to Mr.President from USA");

    }

    @Override
    public LanguageTranslate translate() {

        return new LanguageTranslate("English", "Hindi");
    }

    @Override
    public WriteNotes writeNotes() {
        WriteNotes wrt = new WriteNotes();
        wrt.setConvEnglish("Convert English");
        wrt.setConvHindi("Translate in hindi");
        return wrt;
    }
}
