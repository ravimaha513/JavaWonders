package com.info;

public class Playground {

    Swing swing;
    Slide slide;
    SeeSaw seeSaw;

    //default with initialize properties
    public Playground() {
        this(new Swing("swing","rope"), new Slide() , new SeeSaw());
    }

    //
    public Playground(Swing swing, Slide slide, SeeSaw seeSaw) {
        this.swing = swing;
        this.slide = slide;
        this.seeSaw = seeSaw;
    }

    public Swing getSwing() {
        return swing;
    }

    public void setSwing(Swing swing) {
        this.swing = swing;
    }

    public Slide getSlide() {
        return slide;
    }

    public void setSlide(Slide slide) {
        this.slide = slide;
    }

    public SeeSaw getSeeSaw() {
        return seeSaw;
    }

    public void setSeeSaw(SeeSaw seeSaw) {
        this.seeSaw = seeSaw;
    }
}

