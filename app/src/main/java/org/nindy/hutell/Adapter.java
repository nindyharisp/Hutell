package org.nindy.hutell;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<Data> dataArrayList;
    private Context context;

    public Adapter(ArrayList<Data> dataArrayList, Context context) {
        this.dataArrayList = dataArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_hutell,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final Data data = dataArrayList.get(i);
        viewHolder.namaHotelTextView.setText(data.getNamaHotel());
        viewHolder.lokasiHotelTextView.setText(data.getLokasiHotel());
        viewHolder.labelHotelTextView.setText(data.getLabelHotel());
        viewHolder.hargaHotelTextView.setText(data.getHargaHotel());
        viewHolder.imageView.setImageResource(data.getImageId());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("data", data);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        final TextView namaHotelTextView;
        final TextView lokasiHotelTextView;
        final TextView labelHotelTextView;
        final TextView hargaHotelTextView;
        final ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaHotelTextView = itemView.findViewById(R.id.item_hotel_name);
            lokasiHotelTextView = itemView.findViewById(R.id.item_hotel_location);
            labelHotelTextView = itemView.findViewById(R.id.item_hotel_lbl_price);
            hargaHotelTextView = itemView.findViewById(R.id.item_hotel_price);
            imageView = itemView.findViewById(R.id.item_hotel_image);
            itemView.setClickable(true);
            itemView.setFocusable(true);

        }
    }
}
