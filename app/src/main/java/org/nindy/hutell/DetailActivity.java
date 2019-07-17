package org.nindy.hutell;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private Data mCurrHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
            mCurrHotel = (Data) intent.getSerializableExtra("Hutell");
//            this.setTitle(mCurrHotel.getNamaHotel());

        ImageView image = findViewById(R.id.detail_hotel_image);
        image.setImageResource(mCurrHotel.getImageId());

        TextView hotelName = findViewById(R.id.detail_hotel_name);
        hotelName.setText(mCurrHotel.getNamaHotel());

        TextView location = findViewById(R.id.detail_hotel_location);
        location.setText(mCurrHotel.getLokasiHotel());

        TextView address = findViewById(R.id.detail_hotel_address);
        address.setText(mCurrHotel.getAlamatHotel());

        TextView price = findViewById(R.id.detail_hotel_price_room);
        price.setText(mCurrHotel.getHargaHotel());

    }
}
