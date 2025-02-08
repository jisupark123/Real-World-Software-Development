package com.Chapter03;

import com.Chapter02.BankStatementAnalyzer;
import com.Chapter02.BankStatementCSVParser;
import com.Chapter02.BankStatementParser;

public class MainApplication {
    public static void main(String[] args) throws Exception {

        final com.Chapter02.BankStatementAnalyzer bankStatementAnalyzer
                = new BankStatementAnalyzer();

        final BankStatementParser bankStatementParser
                = new BankStatementCSVParser();

        bankStatementAnalyzer.analyze("bank-data-simple.csv", bankStatementParser);

    }
}
