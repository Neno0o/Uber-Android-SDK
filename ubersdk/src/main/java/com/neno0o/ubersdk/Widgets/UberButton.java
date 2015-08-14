package com.neno0o.ubersdk.Widgets;


import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageButton;

import com.neno0o.ubersdk.R;

/**
 * A Log In/Rides By Uber button that maintains login state and logs in and rides for the app.
 * <p/>
 * This control requires authentication first.
 */
public class UberButton extends ImageButton {

    /**
     * Resource for UberBlack Badge.
     * Needs more customization.
     */
    private int imageResource = R.drawable.uberblack;

    public UberButton(Context context) {
        super(context);
        this.setImageResource(imageResource);
        this.setBackgroundColor(Color.WHITE);
    }

    public UberButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setImageResource(imageResource);
        this.setBackgroundColor(Color.WHITE);
    }

    public UberButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setImageResource(imageResource);
        this.setBackgroundColor(Color.WHITE);
    }

    @Override
    protected boolean onSetAlpha(int alpha) {
        return super.onSetAlpha(alpha);
    }

    public UberButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.setImageResource(imageResource);
        this.setBackgroundColor(Color.WHITE);
    }
}

