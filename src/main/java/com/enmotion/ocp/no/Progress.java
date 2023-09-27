package com.enmotion.ocp.no;

public class Progress {
    private com.enmotion.ocp.no.File file;

    public Progress(File file) {
        this.file = file;
    }

    public float getAsPercent() {
        return this.file.getSent()*100/this.file.getLength();
    }
}
