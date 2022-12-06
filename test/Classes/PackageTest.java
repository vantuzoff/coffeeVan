package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageTest {
    @Test
    void checkPackage(){
        var f = new Package(5, 200);
        assertEquals("Package{volume=5, packagePrice=200}", f.toString());
    }

}