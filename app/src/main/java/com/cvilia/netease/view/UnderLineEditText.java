package com.cvilia.netease.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.EditText;

import com.cvilia.netease.R;
import com.cvilia.netease.utils.DimenUtil;

/**
 * author: lzy
 * date: 2020/10/19
 * describe：描述
 */
@SuppressLint("AppCompatCustomView")
public class UnderLineEditText extends EditText {

    private final Paint mPaint;

    public UnderLineEditText(Context context) {
        this(context, null);
    }

    public UnderLineEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStrokeWidth(DimenUtil.dp2px(context,1));
        mPaint.setColor(getResources().getColor(R.color.divider_dadada, null));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(0,getHeight(),getWidth(),getHeight(),mPaint);
    }
}
