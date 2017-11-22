package com.example.aldres.moneytracker;

/**
 * Created by Aldres on 18.11.2017.
 */

public interface ItemsAdapterListener {
     void onItemClick(Item item, int position);

     void onItemLongClick(Item item, int position);
}
