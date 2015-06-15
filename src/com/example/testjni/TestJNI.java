package com.example.testjni;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * 
 * 
 * @author djy
 * 
 */
public class TestJNI extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d("Hi", "Android call JNI: " + outputJNI());
	}

	private native String outputJNI();

	static {
		System.loadLibrary("testjni");
	}
}
