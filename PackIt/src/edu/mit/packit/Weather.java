package edu.mit.packit;

import android.app.Activity;
import android.os.Bundle;

/***
 * Activity for weather information
 * @author Steph
 *
 */
public class Weather extends Activity {

	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.weatherlayout);
	        
	    }
}
