package com.example.carousel_bs1;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mImages = new ArrayList<>();
    private Context mcontext;

    public RecyclerViewAdapter(Context context ,ArrayList<String> images)
    {
        mImages = images;
        mcontext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: ");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Log.d(TAG,"Called");
        Glide.with(mcontext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: ");
        return mImages.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image ;
        RelativeLayout parentLayout ;
        private static final String TAG = "ViewHolder";
        public ViewHolder(View itemView) {

            //Log.d(TAG, "ViewHolder: ");
            super(itemView);
            image = itemView.findViewById(R.id.image);
            parentLayout = itemView.findViewById(R.id.parent_layout);

        }




    }
}
