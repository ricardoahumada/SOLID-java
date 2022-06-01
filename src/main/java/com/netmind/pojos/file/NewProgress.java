package com.netmind.pojos.file;

public class NewProgress {
    private Measurable aMeasurableContent = null;

    public NewProgress(Measurable amea) {
        this.aMeasurableContent = amea;
    }

    public float getAsPercent() {
        return aMeasurableContent.getSent() * 100 / aMeasurableContent.getLength();
    }

}
