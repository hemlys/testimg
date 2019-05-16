package com.example.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;


import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context context;

    private List<String> data;
    private CustomItemClickListener listener;
    public RecyclerViewAdapter(Context context, List<String> data, CustomItemClickListener listeners) {
        this.context = context;
        this.data = data;
        listener = listeners;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_main_recycler_view_item, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        int aaa =position % 3;
        Log.e("hemly","aaa= "+aaa+"data.get(position)= "+data.get(position));

        switch (aaa){
            case 0:
                holder.firstItemLinearLayout.setVisibility(View.VISIBLE);
                holder.secondItemLinearLayout.setVisibility(View.GONE);
                holder.thirdItemLinearLayout.setVisibility(View.GONE);



                Glide.with(context)
                        .load(data.get(position))
                        .placeholder(R.mipmap.ic_launcher)//loading時候的Drawable
                        .centerCrop()
                        .fitCenter()
                        .error(R.mipmap.ic_launcher)
                        .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                        .into(holder.img1);
                Glide.with(context)
                        .load(data.get(position))
                        .placeholder(R.mipmap.ic_launcher)//loading時候的Drawable
                        .centerCrop()
                        .fitCenter()
                        .error(R.mipmap.ic_launcher)
                        .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                        .into(holder.img2);
                Glide.with(context)
                        .load(data.get(position))
                        .placeholder(R.mipmap.ic_launcher)//loading時候的Drawable
                        .centerCrop()
                        .fitCenter()
                        .error(R.mipmap.ic_launcher)
                        .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                        .into(holder.img3);
//                Glide.with(AppContext.getInstance())
//                        .load(data.get(position))
//                        .placeholder(R.drawable.bottom_me_avatar_none)//loading時候的Drawable
//                        .centerCrop()
//                        .fitCenter()
//                        .error(R.drawable.bottom_me_avatar_none)
//                        .into(holder.img4);
//                Glide.with(AppContext.getInstance())
//                        .load(data.get(position))
//                        .placeholder(R.drawable.bottom_me_avatar_none)//loading時候的Drawable
//                        .centerCrop()
//                        .fitCenter()
//                        .error(R.drawable.bottom_me_avatar_none)
//                        .into(holder.img5);
//                Glide.with(AppContext.getInstance())
//                        .load(data.get(position))
//                        .placeholder(R.drawable.bottom_me_avatar_none)//loading時候的Drawable
//                        .centerCrop()
//                        .fitCenter()
//                        .error(R.drawable.bottom_me_avatar_none)
//                        .into(holder.img6);


                break;
            case 1:
                holder.firstItemLinearLayout.setVisibility(View.GONE);
                holder.secondItemLinearLayout.setVisibility(View.VISIBLE);
                holder.thirdItemLinearLayout.setVisibility(View.GONE);
                Glide.with(context)
                        .load(data.get(position))
                        .placeholder(R.mipmap.ic_launcher)//loading時候的Drawable
                        .centerCrop()
                        .fitCenter()
                        .error(R.mipmap.ic_launcher)
                        .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                        .into(holder.imgs1);
                Glide.with(context)
                        .load(data.get(position))
                        .placeholder(R.mipmap.ic_launcher)//loading時候的Drawable
                        .centerCrop()
                        .fitCenter()
                        .error(R.mipmap.ic_launcher)
                        .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                        .into(holder.imgs2);
                Glide.with(context)
                        .load(data.get(position))
                        .placeholder(R.mipmap.ic_launcher)//loading時候的Drawable
                        .centerCrop()
                        .fitCenter()
                        .error(R.mipmap.ic_launcher)
                        .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                        .into(holder.imgs3);
                break;
            case 2:
                holder.firstItemLinearLayout.setVisibility(View.GONE);
                holder.secondItemLinearLayout.setVisibility(View.GONE);
                holder.thirdItemLinearLayout.setVisibility(View.VISIBLE);
                Glide.with(context)
                        .load(data.get(position))
                        .placeholder(R.mipmap.ic_launcher)//loading時候的Drawable
                        .centerCrop()
                        .fitCenter()
                        .error(R.mipmap.ic_launcher)
                        .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                        .into(holder.imgz1);
                Glide.with(context)
                        .load(data.get(position))
                        .placeholder(R.mipmap.ic_launcher)//loading時候的Drawable
                        .centerCrop()
                        .fitCenter()
                        .error(R.mipmap.ic_launcher)
                        .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                        .into(holder.imgz2);
                Glide.with(context)
                        .load(data.get(position))
                        .placeholder(R.mipmap.ic_launcher)//loading時候的Drawable
                        .centerCrop()
                        .fitCenter()
                        .error(R.mipmap.ic_launcher)
                        .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                        .into(holder.imgz3);
                break;
        }


    }

    @Override
    public int getItemCount() {
        return this.data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {


        private ImageView img1,img2,img3,img4,img5,img6;
        private ImageView imgs1,imgs2,imgs3;
        private ImageView imgz1,imgz2,imgz3;
        private LinearLayout firstItemLinearLayout,secondItemLinearLayout,thirdItemLinearLayout;
        public MyViewHolder(View itemView) {
            super(itemView);


            img1 = (ImageView) itemView.findViewById(R.id.firstItemImageView1);
            img2 = (ImageView) itemView.findViewById(R.id.firstItemImageView2);
            img3 = (ImageView) itemView.findViewById(R.id.firstItemImageView3);
//            img4 = (ImageView) itemView.findViewById(R.id.firstItemImageView4);
//            img5 = (ImageView) itemView.findViewById(R.id.firstItemImageView5);
//            img6 = (ImageView) itemView.findViewById(R.id.firstItemImageView6);
            imgs1 = (ImageView) itemView.findViewById(R.id.thirdItemImageView1);
            imgs2 = (ImageView) itemView.findViewById(R.id.thirdItemImageView2);
            imgs3 = (ImageView) itemView.findViewById(R.id.thirdItemImageView3);
            imgz1 = (ImageView) itemView.findViewById(R.id.secondItemImageView1);
            imgz2 = (ImageView) itemView.findViewById(R.id.secondItemImageView2);
            imgz3 = (ImageView) itemView.findViewById(R.id.secondItemImageView3);

            firstItemLinearLayout = (LinearLayout) itemView.findViewById(R.id.firstItemLinearLayout);
            secondItemLinearLayout = (LinearLayout) itemView.findViewById(R.id.secondItemLinearLayout);
            thirdItemLinearLayout = (LinearLayout) itemView.findViewById(R.id.thirdItemLinearLayout);
        }
    }


}

