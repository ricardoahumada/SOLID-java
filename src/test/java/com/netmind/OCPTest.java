package com.netmind;

import com.netmind.ocp.no.File;
import com.netmind.ocp.si.Measurable;
import com.netmind.ocp.si.Progress;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OCPTest {

    @Test
    public void trackingTest() {
        File fichero = new File();
        fichero.setLength(200);
        fichero.setSent(100);

        com.netmind.ocp.no.Progress progress = new com.netmind.ocp.no.Progress(fichero);

        assertTrue(50 == progress.getAsPercent());
    }

    @Test
    public void trackingPercentTest() {
        Measurable fichero = new com.netmind.ocp.si.File(200, 100);

        Progress progress = new Progress(fichero);
        assertTrue(50 == progress.getAsPercent());
    }

}