package tv.superawesome.parentalgatedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import tv.superawesome.lib.saparentalgate.SAParentalGate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SAParentalGate.setListener(new SAParentalGate.Interface() {
            @Override
            public void parentalGateOpen() {
                Log.d("SuperAwesome", "PG OPEN");
            }

            @Override
            public void parentalGateSuccess() {
                Log.d("SuperAwesome", "PG SUCCESS");
            }

            @Override
            public void parentalGateFailure() {
                Log.d("SuperAwesome", "PG FAILURE");
            }

            @Override
            public void parentalGateCancel() {
                Log.d("SuperAwesome", "PG CANCEL");
            }
        });

        SAParentalGate.show(this);
    }
}
