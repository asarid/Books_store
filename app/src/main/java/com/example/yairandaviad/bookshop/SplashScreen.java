package com.example.yairandaviad.bookshop;

/**
 * Created by aviad on 08/12/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends Activity{

    private static int splashInterval = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout._001_splash_screen);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                //TODO Auto-generated method stub
                Intent i = new Intent(SplashScreen.this, Login.class);
                startActivity(i);

                this.finish();
            }

            private void finish() {
                //TODO Auto-generated method stub
            }

        }, splashInterval);

    }

}


