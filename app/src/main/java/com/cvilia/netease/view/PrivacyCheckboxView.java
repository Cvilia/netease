package com.cvilia.netease.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

import com.cvilia.netease.R;

/**
 * author: lzy
 * date: 2020/10/9
 * describe：描述
 */
public class PrivacyCheckboxView extends View {

    private Paint mOutCirclePaint, mInCirclePaint;
    private final Context context;
    private int sweepAngle;
    private boolean checked = false;

    public boolean isChecked() {
        return checked;
    }

    public int getSweepAngle() {
        return sweepAngle;
    }

    public void setSweepAngle(int sweepAngle) {
        this.sweepAngle = sweepAngle;
    }

    public PrivacyCheckboxView(Context context) {
        this(context, null);
    }

    public PrivacyCheckboxView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();
    }

    private void init() {

        mOutCirclePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mOutCirclePaint.setColor(getResources().getColor(R.color.alpha_ccffffff));
        mOutCirclePaint.setStrokeWidth(2f);
        mOutCirclePaint.setStyle(Paint.Style.STROKE);

        mInCirclePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mInCirclePaint.setColor(getResources().getColor(R.color.app_main));
        mInCirclePaint.setStyle(Paint.Style.FILL);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.drawCircle(getWidth() / 2f, getHeight() / 2f, getWidth() / 2f - 2.5f, mOutCirclePaint);
        canvas.drawCircle(getWidth() / 2f, getHeight() / 2f, getWidth() / 2f - 10f, mInCirclePaint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                if (checked) {
                    mInCirclePaint.setColor(getResources().getColor(R.color.app_main));
                    checked = false;
                } else {
                    mInCirclePaint.setColor(getResources().getColor(R.color.alpha_ccffffff));
                    checked = true;
                }
                invalidate();
                break;
        }

        return super.onTouchEvent(event);
    }
}
