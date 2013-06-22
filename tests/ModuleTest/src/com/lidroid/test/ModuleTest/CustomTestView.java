package com.lidroid.test.ModuleTest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created with IntelliJ IDEA.
 * User: wyouflf
 * Date: 13-6-18
 * Time: 下午7:37
 */
public class CustomTestView extends LinearLayout implements View.OnClickListener {

    private Button mButton;
    private ImageView mImageView;

    private Context mContext;

    public CustomTestView(Context context) {
        super(context);

        mContext = context;

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.test_view, this);

        mButton = (Button) findViewById(R.id.button);
        mImageView = (ImageView) findViewById(R.id.imageView);

        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        mImageView.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_launcher));
    }
}
