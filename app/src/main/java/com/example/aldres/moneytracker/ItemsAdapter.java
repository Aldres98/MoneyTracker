package com.example.aldres.moneytracker;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aldres on 03.11.2017.
 */

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemViewHolder> {

    private List<Item> items = new ArrayList<>();

    public ItemsAdapter() {
        items.add(new Item("Молоко", 35));
        items.add(new Item("Зубная щетка", 1500));
        items.add(new Item("Сковородка с антипригарным покрытием", 55));
        items.add(new Item("Молоко", 35));
        items.add(new Item("Зубная щетка", 1500));
        items.add(new Item("Сковородка с антипригарным покрытием", 55));
        items.add(new Item("Молоко", 35));
        items.add(new Item("Зубная щетка", 1500));
        items.add(new Item("Сковородка с антипригарным покрытием", 55));
        items.add(new Item("Молоко", 35));
        items.add(new Item("Зубная щетка", 1500));
        items.add(new Item("Сковородка с антипригарным покрытием", 55));
        items.add(new Item("Молоко", 35));
        items.add(new Item("Зубная щетка", 1500));
        items.add(new Item("Сковородка с антипригарным покрытием", 55));
        items.add(new Item("Молоко", 35));
        items.add(new Item("Зубная щетка", 1500));
        items.add(new Item("Сковородка с антипригарным покрытием", 55));
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ItemViewHolder(view); // Markup for each element
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Item item = items.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

     static class ItemViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView price;

         ItemViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.item_name);
            price = itemView.findViewById(R.id.item_price);
        }

         void bind(Item item){
            price.setText(String.valueOf(item.getPrice()).concat("\u20BD"));
            name.setText(item.getName());
        }
    }
}
