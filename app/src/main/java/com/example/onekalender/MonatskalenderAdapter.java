package com.example.onekalender;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.time.LocalDate;

public class MonatskalenderAdapter extends RecyclerView.Adapter<KalenderTagViewHolder> {


    private LocalDate datum;

    public MonatskalenderAdapter(LocalDate geaendertesDatum) {
        this.datum = geaendertesDatum;
    }

    @NonNull
    @Override
    public KalenderTagViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout inflate = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.kalendertag, parent, false);
        return new KalenderTagViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull KalenderTagViewHolder holder, int position) {
        holder.setTagAlsText(String.valueOf(1+ position));

    }

    @Override
    public int getItemCount() {
        return datum.lengthOfMonth();
    }


    public void setNewDataset(LocalDate geaendertesDatum) {
        this.datum = geaendertesDatum;
    }
}
