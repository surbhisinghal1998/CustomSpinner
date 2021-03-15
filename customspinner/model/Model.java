package com.solution.customspinner.model;

public class Model {
    private  String spinnertext;
    int img1;


    public Model(String spinnertext, int img1) {
        this.spinnertext = spinnertext;
        this.img1 = img1;
    }

    public String getSpinnertext() {
        return spinnertext;
    }

    public int getImg1() {
        return img1;
    }
}
