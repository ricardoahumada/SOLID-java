package com.netmind.pojos.file;

public class Progress {
    private File file;

    public Progress(File file) {
        this.file = file;
    }

    public float getAsPercent() {
        return this.file.getSent()*100/this.file.getLength();
    }
}
