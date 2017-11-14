package com.example.aldres.moneytracker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Aldres on 07.11.2017.
 */

public class BalanceFragment extends android.support.v4.app.Fragment {

    public static BalanceFragment createBalanceFragment(){
        BalanceFragment balanceFragment = new BalanceFragment();
        return balanceFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_balance, container, false);

    }
}
