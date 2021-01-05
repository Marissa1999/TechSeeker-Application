package com.example.techseeker;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.techseeker.model.LaptopItem;

import java.util.List;

public class LaptopAdapter extends RecyclerView.Adapter<LaptopAdapter.LaptopViewHolder> {

    private List<LaptopItem> mLaptops;
    private LayoutInflater mLaptopInflater;
    private Context context;


    LaptopAdapter(Context context)
    {
        this.mLaptopInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public LaptopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View laptopItemView = mLaptopInflater.inflate(R.layout.all_laptops_cardview, parent, false);
        return new LaptopViewHolder(laptopItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull LaptopViewHolder holder, int position)
    {
        int LaptopImageID =  context.getResources().getIdentifier(mLaptops.get(position).getLaptopImage(), "drawable", context.getPackageName());

        holder.mLaptopTitle.setText(mLaptops.get(position).getLaptopTitle());
        holder.mLaptopDescription.setText(mLaptops.get(position).getLaptopDescription());
        holder.mLaptopPrice.setText(mLaptops.get(position).getLaptopPrice());
        holder.mLaptopImage.setImageResource(LaptopImageID);

    }

    void setLaptopItems(List<LaptopItem> laptops)
    {
        mLaptops = laptops;
        notifyDataSetChanged();
    }


    @Override
    public int getItemCount()
    {
        if(mLaptops != null)
        {
            return this.mLaptops.size();
        }

        else
        {
            return 0;
        }

    }

    class LaptopViewHolder extends RecyclerView.ViewHolder
    {
        CardView mLaptop;
        private TextView mLaptopTitle;
        private TextView mLaptopDescription;
        private TextView mLaptopPrice;
        private ImageView mLaptopImage;


        LaptopViewHolder(@NonNull View LaptopItemView) {
            super(LaptopItemView);
            this.mLaptop = LaptopItemView.findViewById(R.id.laptop_content);
            this.mLaptopTitle = LaptopItemView.findViewById(R.id.laptop_title);
            this.mLaptopDescription = LaptopItemView.findViewById(R.id.laptop_description);
            this.mLaptopPrice = LaptopItemView.findViewById(R.id.laptop_price);
            this.mLaptopImage = LaptopItemView.findViewById(R.id.laptop_image);

        }



    }

}
