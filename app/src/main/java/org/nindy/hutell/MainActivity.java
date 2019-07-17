package org.nindy.hutell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static String KEY_HOTEL_OBJECT = "curr_hotel";
    private ArrayList<Data> dataArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataArrayList = new ArrayList<>();
        dataArrayList.add(new Data("Oasis Amir Hotel","Jakarta Pusat","Jl. Senen Raya Kav. 135 - 137 , Senen, Jakarta Pusat, Jakarta, Indonesia, 10410","Starting From","IDR 427398/room/night",R.drawable.gambar_jakput_oasis));
        dataArrayList.add(new Data("Aryaduta Jakarta", "Jakarta Pusat","Jl. KKO Usman & Harun 44-48, Gambir, Jakarta Pusat, Jakarta, Indonesia, 10110","Starting From","IDR 980000/room/night",R.drawable.gambar_jakput_aryadutajakarta));
        dataArrayList.add(new Data("Yello Hotel Harmoni","Jakarta Pusat","Jalan Hayam Wuruk No. 6, Gambir, Harmoni, Jakarta, Indonesia, 10120","Starting From","IDR 648000/room/night",R.drawable.gambar_jakput_yellohotelharmoni));
        dataArrayList.add(new Data("Grand Sahid Jaya Jakarta","Jakarta Pusat","Jl. Jendral Sudirman No. 86 , Sudirman, Jakarta Pusat, Jakarta, Indonesia, 10220","Starting From","IDR 1008000/room/night",R.drawable.gambar_jakput_grandsahidjaya));
        dataArrayList.add(new Data("Oria Hotel","Jakarta Pusat","Jl. Wahid Hasyim No. 83-85, Menteng, Gondangdia, Jakarta, Indonesia, 10350","Starting From","IDR 780000/room/night",R.drawable.gambar_jakput_oriahotel));

        Adapter adapter = new Adapter(dataArrayList, this);
        RecyclerView recyclerView = findViewById(R.id.data_list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
    }
}
