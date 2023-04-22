package com.example;

import com.example.algorithm.BankStatementAnalyzer;
import com.example.algorithm.BankStatementCSVParser;
import com.example.algorithm.BankStatementParser;
import java.io.IOException;

public class MainApplication {

	public static void main(String[] args) throws IOException {

		final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();

		final BankStatementParser bankStatementParser = new BankStatementCSVParser();

		bankStatementAnalyzer.analyze(args[0], bankStatementParser);
	}

}
