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

import com.example.techseeker.model.PCItem;

import java.util.List;

public class PCAdapter extends RecyclerView.Adapter<PCAdapter.PCViewHolder> {

    private List<PCItem> mPCs;
    private LayoutInflater mPCInflater;
    private Context context;


    PCAdapter(Context context)
    {
        this.mPCInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public PCViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View pcItemView = mPCInflater.inflate(R.layout.all_pcs_cardview, parent, false);
        return new PCViewHolder(pcItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PCViewHolder holder, int position)
    {
        int PCImageID =  context.getResources().getIdentifier(mPCs.get(position).getPCImage(), "drawable", context.getPackageName());

        holder.mPCTitle.setText(mPCs.get(position).getPCTitle());
        holder.mPCDescription.setText(mPCs.get(position).getPCDescription());
        holder.mPCPrice.setText(mPCs.get(position).getPCPrice());
        holder.mPCImage.setImageResource(PCImageID);
    }

    void setPCItems(List<PCItem> pcs)
    {
        mPCs = pcs;
        notifyDataSetChanged();
    }


    @Override
    public int getItemCount()
    {
        if(mPCs != null)
        {
            return this.mPCs.size();
        }

        else
        {
            return 0;
        }

    }

    class PCViewHolder extends RecyclerView.ViewHolder
    {
        CardView mPC;
        private TextView mPCTitle;
        private TextView mPCDescription;
        private TextView mPCPrice;
        private ImageView mPCImage;

        PCViewHolder(@NonNull View PCItemView) {
            super(PCItemView);
            this.mPC = PCItemView.findViewById(R.id.pc_content);
            this.mPCTitle = PCItemView.findViewById(R.id.pc_title);
            this.mPCDescription = PCItemView.findViewById(R.id.pc_description);
            this.mPCPrice = PCItemView.findViewById(R.id.pc_price);
            this.mPCImage = PCItemView.findViewById(R.id.pc_image);
        }



    }

}
