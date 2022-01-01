package com.example.onekalender;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class MainActivity extends AppCompatActivity {
   private final LocalDateTime aktuellesLokalesDatumMitZeit = LocalDateTime.now();
   private LocalDate geaendertesDatum = LocalDateTime.from(aktuellesLokalesDatumMitZeit).toLocalDate();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textJahr = findViewById(R.id.textViewJahr);
        textJahr.setText("" + geaendertesDatum.getYear());

        // Datumsberechnung

        TextView textMonat = findViewById(R.id.textViewMonat);
        Month aktMonth = aktuellesLokalesDatumMitZeit.getMonth();
        textMonat.setText(aktMonth.toString());

        Button pfeilLinks= findViewById(R.id.buttonPfeilLinks);
        pfeilLinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                geaendertesDatum = geaendertesDatum.minusMonths(1);

                textMonat.setText(getMonthFromVal(geaendertesDatum.getMonthValue()));
                textJahr.setText("" + geaendertesDatum.getYear());
            }

        });

        Button pfeilRechts= findViewById(R.id.buttonPfeilRechts);
        pfeilRechts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                geaendertesDatum = geaendertesDatum.plusMonths(1);

                textMonat.setText(getMonthFromVal(geaendertesDatum.getMonthValue()));
                textJahr.setText("" + geaendertesDatum.getYear());
            }
        });

        // TageTabelle bearbeiten
        RecyclerView kalendermonat = findViewById(R.id.tagetabelle);
        kalendermonat.setAdapter(new MonatskalenderAdapter());


    }

    /**
     * Diese Methode gibt den Monatsnahmen aus dem Value (Int) zurück.
     * 1~Jan to 12~Dez.
     * @param monthValue Interger Repräsentiert 1 bis 12 Monatsnamen
     * @return Monatsnamen
     */
    @NonNull
    private String getMonthFromVal(int monthValue) {
        String month;

        switch (monthValue) {
            case 1:
                month = getString(R.string.Jan);
                break;
            case 2:
                month = getString(R.string.Feb);
                break;
            case 3:
                month = getString(R.string.Mar);
                break;
            case 4:
                month = getString(R.string.Apr);
                break;
            case 5:
                month = getString(R.string.May);
                break;
            case 6:
                month = getString(R.string.Jun);
                break;
            case 7:
                month = getString(R.string.Jul);
                break;
            case 8:
                month = getString(R.string.Aug);
                break;
            case 9:
                month = getString(R.string.Sep);
                break;
            case 10:
                month = getString(R.string.Oct);
                break;
            case 11:
                month = getString(R.string.Nov);
                break;
            case 12:
                month = getString(R.string.Dec);
                break;
            default:
                month = "-Jackpot you have brake the bank-";
        }
        return month;
    }


}