package com.netmind.ocp.no;

import com.netmind.ocp.no.File;

public class Progress {
    private com.netmind.ocp.no.File file;

    public Progress(File file) {
        this.file = file;
    }

    public float getAsPercent() {
        return this.file.getSent()*100/this.file.getLength();
    }
}
