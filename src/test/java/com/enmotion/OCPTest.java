package com.enmotion;

import com.enmotion.ocp.no.File;
import com.enmotion.ocp.si.Progress;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OCPTest {

    @Test
    public void trackingTest() {
        File fichero = new File();
        fichero.setLength(200);
        fichero.setSent(100);

        com.enmotion.ocp.no.Progress progress = new com.enmotion.ocp.no.Progress(fichero);

        assertTrue(50 == progress.getAsPercent());
    }

    @Test
    public void trackingPercentTest() {
        com.enmotion.ocp.si.File fichero = new com.enmotion.ocp.si.File(200, 100);

        Progress progress = new Progress(fichero);
        assertTrue(50 == progress.getAsPercent());
    }

}