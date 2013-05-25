package com.sai.customimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

public class ImageViewRoundedCorners extends ImageView {
   
	
	public ImageViewRoundedCorners(Context context) {
			super(context);
			
			// TODO Auto-generated constructor stub
	}
	 
	public ImageViewRoundedCorners(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		// TODO Auto-generated constructor stub
	}

	

    public ImageViewRoundedCorners(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        BitmapDrawable drawable = (BitmapDrawable) getDrawable();

        if (drawable == null) {
            return;
        }

        if (getWidth() == 0 || getHeight() == 0) {
            return; 
        }

        Bitmap bitmap = drawable.getBitmap();

        BitmapShader shader;
        shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(shader);
        

        RectF rect = new RectF(0.0f, 0.0f, getWidth(), getHeight());

      
        canvas.drawRoundRect(rect, 25,25, paint);
    }

    
}