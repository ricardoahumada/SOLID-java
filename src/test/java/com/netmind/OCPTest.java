package com.netmind;

import com.netmind.pojos.file.File;
import com.netmind.pojos.file.NewProgress;
import com.netmind.pojos.file.Progress;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OCPTest {

    @Test
    public void trackingTest() {
        File fichero = new File();
        fichero.setLength(200);
        fichero.setSent(100);

        Progress progress = new Progress(fichero);

        assertTrue(50 == progress.getAsPercent());
    }

    @Test
    public void trackingPercentTest() {
        File fichero = new File();
        fichero.setLength(200);
        fichero.setSent(100);

        NewProgress progress = new NewProgress(fichero);
        assertTrue(50 == progress.getAsPercent());
    }

}