package acadview.com.mytoastoncenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(),"onCreate",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Toast toast_1 = Toast.makeText(getApplicationContext(),"onStart",Toast.LENGTH_SHORT);
        toast_1.setGravity(Gravity.CENTER,0,0);
        toast_1.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast toast_2 = Toast.makeText(getApplicationContext(),"onStop",Toast.LENGTH_SHORT);
        toast_2.setGravity(Gravity.CENTER,0,0);
        toast_2.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast_3 = Toast.makeText(getApplicationContext(),"onDestroy",Toast.LENGTH_SHORT);
        toast_3.setGravity(Gravity.CENTER,0,0);
        toast_3.show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast toast_4 = Toast.makeText(getApplicationContext(),"onResume",Toast.LENGTH_SHORT);
        toast_4.setGravity(Gravity.CENTER,0,0);
        toast_4.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast toast_5 = Toast.makeText(getAppli
                cationContext(),"onPause",Toast.LENGTH_SHORT);
        toast_5.setGravity(Gravity.CENTER,0,0);
        toast_5.show();
    }


}
