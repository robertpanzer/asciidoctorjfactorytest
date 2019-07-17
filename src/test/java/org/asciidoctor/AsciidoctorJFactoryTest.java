package org.asciidoctor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AsciidoctorJFactoryTest {

    @Test
    public void test() {
        Asciidoctor ad = Asciidoctor.Factory.create();
        assertNotNull(ad);
        String converted = ad.convert("Hello World",
            OptionsBuilder.options()
                .headerFooter(false));
        assertEquals("<div class=\"paragraph\">\n" +
            "<p>Hello World</p>\n" +
            "</div>", converted);
    }
}
