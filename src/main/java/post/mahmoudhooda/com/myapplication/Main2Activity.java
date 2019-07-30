package post.mahmoudhooda.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(6000);
                    Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        thread.start();
    }

}



