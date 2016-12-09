package com.geogehigbie.giftbug;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.View;

/**
 * Created by georgehigbie on 12/9/16.
 */

public class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {

    private OnItemClickListener listener;

    public interface OnItemClickListener{
        public void onItemClick (View view, int position);

        public void onLongItemClick(View view, int position);
    }

    GestureDetector detector;

    public RecyclerItemClickListener(Context context, final Recycler)


}
