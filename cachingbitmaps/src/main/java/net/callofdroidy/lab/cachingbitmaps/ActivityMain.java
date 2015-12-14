package net.callofdroidy.lab.cachingbitmaps;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.LruCache;
import android.widget.ImageView;

/**
 * reference: http://developer.android.com/training/displaying-bitmaps/cache-bitmap.html
 */

public class ActivityMain extends AppCompatActivity {

    private LruCache<String, Bitmap> mMemoryCache;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        mImageView = (ImageView) findViewById(R.id.iv_display);

        // Get max available VM memory, exceeding this amount will throw an
        // OutOfMemory exception. Stored in kilobytes as LruCache takes an
        // int in its constructor.
        final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);

        // Use 1/8th of the available memory for this memory cache.
        // A full screen GridView filled with images on a device with 800x480 resolution would use
        // around 1.5MB (800*480*4 bytes), so this would cache a minimum of around 2.5 pages of images in memory.
        final int cacheSize = maxMemory / 8;

        mMemoryCache = new LruCache<String, Bitmap>(cacheSize){
            @Override
            protected int sizeOf(String key, Bitmap bitmap){
                // The cache size will be measured in kilobytes rather than
                // number of items.
                return bitmap.getByteCount() / 1024;
            }
        };

    }


    public void addBitmapToMemoryCache(String key, Bitmap bitmap){
        if(getBitMapFromMemCache(key) == null)
            mMemoryCache.put(key, bitmap);
    }

    public Bitmap getBitMapFromMemCache(String key){
        return mMemoryCache.get(key);
    }

    public void loadBitmap(int resId, ImageView imageView) {
        final String imageKey = String.valueOf(resId);

        final Bitmap bitmap = getBitMapFromMemCache(imageKey);
        if (bitmap != null) {
            mImageView.setImageBitmap(bitmap);
        } else {
            mImageView.setImageResource(R.drawable.image_placeholder);
            BitmapWorkerTask task = new BitmapWorkerTask(mImageView);
            task.execute(resId);
        }
    }

    class BitmapWorkerTask extends AsyncTask<Integer, Void, Bitmap> {
        // Decode image in background.
        @Override
        protected Bitmap doInBackground(Integer... params) {
            final Bitmap bitmap = decodeSampledBitmapFromResource(
                    getResources(), params[0], 100, 100));
            addBitmapToMemoryCache(String.valueOf(params[0]), bitmap);
            return bitmap;
        }
    }
    */
    }
}
