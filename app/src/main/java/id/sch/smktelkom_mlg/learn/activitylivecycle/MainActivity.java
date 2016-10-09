package id.sch.smktelkom_mlg.learn.activitylivecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LivecycleTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onStart();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onStart();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStart();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onStart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onStart();
        Log.d(TAG, "onDestroy: ");
    }
}
