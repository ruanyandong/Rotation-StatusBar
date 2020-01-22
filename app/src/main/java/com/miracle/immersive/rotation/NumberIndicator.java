package com.miracle.immersive.rotation;

import android.content.Context;
import android.graphics.Color;
import androidx.appcompat.widget.AppCompatTextView;
import com.miracle.immersive.R;

/**
 * @author miracle
 * @date 2020-01-19
 * @email ruanyandongai@gmail.com
 * @blog https://ruanyandong.github.io
 */
public class NumberIndicator extends AppCompatTextView {

    public NumberIndicator(Context context) {
        super(context);
        setTextColor(Color.WHITE);
        setTextSize(14);
        setBackgroundResource(R.drawable.text_indicator_bg);
        int padding = DensityUtils.dp2px(context, 5);
        setPadding(padding,padding,padding,padding);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //保证TextIndicator的宽高一致(正方形)
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
