package com.example.aldres.moneytracker.api;

import com.example.aldres.moneytracker.Result;

/**
 * Created by Aldres on 27.11.2017.
 */

public class BalanceResult extends Result {
    public long totalExpenses;
    public long totalIncome;

    public BalanceResult(long totalExpenses, long totalIncome) {
        this.totalExpenses = totalExpenses;
        this.totalIncome = totalIncome;
    }
}
