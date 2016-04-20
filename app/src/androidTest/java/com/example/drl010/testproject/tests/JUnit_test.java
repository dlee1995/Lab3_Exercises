package com.example.drl010.testproject.tests;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.drl010.testproject.MyActivity;
import com.example.drl010.testproject.R;

/**
 * Created by drl010 on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MyActivity>{
    MyActivity mainActivity;
    public JUnit_test() {
        super(MyActivity.class);
    }
    public void test_first() {
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Bye World", tester);
    }
}
