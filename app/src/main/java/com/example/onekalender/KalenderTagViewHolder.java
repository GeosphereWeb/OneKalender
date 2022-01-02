package com.example.onekalender;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 *
 */
public class KalenderTagViewHolder extends RecyclerView.ViewHolder {
    TextView tagAlsText;

    public KalenderTagViewHolder(@NonNull View itemView) {
        super(itemView);
         tagAlsText = itemView.findViewById(R.id.textViewTagesdatum);
    }

    public void setTagAlsText(String tagAlsText) {
        this.tagAlsText.setText(tagAlsText);
    }
}
