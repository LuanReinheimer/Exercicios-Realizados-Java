package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscrita2ModoFileWriter {

	public static void main(String[] args) throws IOException {
		
		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println();
        ps.println();
        ps.println("asfasdfsafdas dfs sdf asf as");

        ps.close();

	}

}
