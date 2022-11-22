package fr.lernejo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @ParameterizedTest
    @csvSource({
        "Cupcake with chocolate and nuts, \uD83E\uDDC1 with \uD83C\uDF6B and \uD83E\uDD5C"
    })
    void test() {

    }
}
