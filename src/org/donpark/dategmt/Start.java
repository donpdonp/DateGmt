package org.donpark.dategmt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Start extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
		DateFormat datePattern;
		long offset = 1275691189000L;
		datePattern =  new SimpleDateFormat ("yyyy-MM-dd'T'HH:mm:ssZ");
		String zonename = "GMT";
		TimeZone timezone = TimeZone.getTimeZone(zonename);
		datePattern.setTimeZone(timezone);
		String date_str = datePattern.format(new Date(offset));
		
        TextView t = (TextView) findViewById(R.id.t1);
        t.setText(zonename + " " + timezone);   
        Log.i("DateGmt", zonename + " " + timezone);

        t = (TextView) findViewById(R.id.t2);
        t.setText(date_str);
        Log.i("DateGmt", date_str);

    }
}