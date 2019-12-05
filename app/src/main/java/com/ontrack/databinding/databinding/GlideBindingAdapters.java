package com.ontrack.databinding.databinding;

import android.content.Context;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.ontrack.databinding.R;

public class GlideBindingAdapters {
    @BindingAdapter("imageUrl")
    public static void setImageResource(ImageView view, int imageurl){
        Context context= view.getContext();
        RequestOptions options= new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);
        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageurl)
                .into(view);
    }
}
