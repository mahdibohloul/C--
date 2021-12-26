package main;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;

public class Cmm {
    public static void main(String[] args) throws IOException {
        CharStream reader = CharStreams.fromFileName("samples/sample1.cmm");
        CmmCompiler cmmCompiler = new CmmCompiler();
        cmmCompiler.compile(reader);
    }
}
