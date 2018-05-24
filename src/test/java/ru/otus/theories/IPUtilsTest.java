package ru.otus.theories;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import javafx.util.Pair;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class IPUtilsTest {

    @DataPoints("TEST_SET")
    public static Pair[] testSet() {
        return new Pair[] {
            new Pair<>("192.168.1.1", true),
            new Pair<>("123", false),
            new Pair<>("0.0.0.0", true),
            new Pair<>("127.0.0.1", true),
            new Pair<>("1234.233.22.12", false),
            new Pair<>("172.16.256.39", false),
            new Pair<>("123.23,23.1", false),
            new Pair<>("asd.asd.ddd.d", false)
        };
    }

    @Theory
    public void testIsValidIP(@FromDataPoints("TEST_SET") Pair<String, Boolean> pair) {
        assertThat(IPUtils.isValidIP(pair.getKey()), is(pair.getValue()));
    }
}
