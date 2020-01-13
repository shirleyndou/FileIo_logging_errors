import org.graalvm.compiler.lir.VirtualStackSlot;
import sun.java2d.loops.DrawGlyphList;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Visitor alice = new Visitor();
        alice.save();
        alice.load();
       // alice.load("Alice Cooper");

        Visitor bob = new Visitor();
        bob.save();
        bob.load();
        //alice.load("Bob Marley");
    }
}
