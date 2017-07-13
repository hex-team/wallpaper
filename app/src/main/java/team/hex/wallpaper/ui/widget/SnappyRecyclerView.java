package team.hex.wallpaper.ui.widget;

import android.content.Context;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

import com.chauthai.overscroll.RecyclerViewBouncy;


/**
 * Created by alireza on 7/3/17.
 */

public class SnappyRecyclerView extends RecyclerViewBouncy {

    public SnappyRecyclerView(Context context) {
        super(context);
        init();
    }

    public SnappyRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SnappyRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
      //  LinearSnapHelper snapHelper = new LinearSnapHelper();
      //  snapHelper.attachToRecyclerView(this);
    }

    public int getVerticalScrollOffset() {
        return super.computeVerticalScrollOffset();
    }

    public int getHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }


}
