package edu.upc.eetac.dsa.rodrigo.sampedro.hello;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class helloandroid extends Activity
{
	private final static String TAG = helloandroid.class.getName();
	private int counter;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void clickMe(View v) {
		Log.d(TAG, "Some one has clicked me");
		TextView tv = (TextView) findViewById(R.id.label);
		EditText input = (EditText) findViewById(R.id.input);
		tv.setText(input.getText().toString() + " " + (++counter));
	}
}
