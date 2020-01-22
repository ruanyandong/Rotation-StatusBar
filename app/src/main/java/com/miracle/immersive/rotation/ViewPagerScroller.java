package com.miracle.immersive.rotation;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/**
 * @author miracle
 * @date 2020-01-19
 * @email ruanyandongai@gmail.com
 * @blog https://ruanyandong.github.io
 */
public class ViewPagerScroller extends Scroller {

    private int mScrollDuration = 360;
    private boolean sudden;

    public ViewPagerScroller(Context context) {
        super(context);
    }

    public ViewPagerScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    public ViewPagerScroller(Context context, Interpolator interpolator,
                             boolean flywheel) {
        super(context, interpolator, flywheel);
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy, int duration) {
        super.startScroll(startX, startY, dx, dy, sudden ? 0 : mScrollDuration);
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy) {
        super.startScroll(startX, startY, dx, dy, sudden ? 0 : mScrollDuration);
    }

    public int getScrollDuration() {
        return mScrollDuration;
    }

    public void setScrollDuration(int scrollDuration) {
        this.mScrollDuration = scrollDuration;
    }

    public boolean isSudden() {
        return sudden;
    }

    public void setSudden(boolean zero) {
        this.sudden = zero;
    }
}
