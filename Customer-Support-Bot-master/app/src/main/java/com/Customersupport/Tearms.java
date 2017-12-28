package com.Customersupport;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;


public class Tearms extends ActionBarActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tearms);

        tv = (TextView) findViewById(R.id.text_view);

        loadText();
    }

    private void loadText() {

        String s = "(24/7) The Maintainer agrees to provide maintenance \n" +
                "service for the Equipment during a full 24-hour period, 7 \n" +
                "days per week.\n" +
                "\n" +
                "Geo-Location Data\n" +
                "\n" +
                "We do not ask you for, access or track any location based information from your mobile device at any time while downloading or using our Mobile Apps or services.\n" +
                "\n" +
                "Third Party Information\n" +
                "\n" +
                "We allow you to provide us with third party personal data. The information that we may collect is name and email address in order to allow you to add operators to your account. We will not use this information for any other purpose.\n" +
                "Using ‘cookies’\n" +
                "\n" +
                "The so called ‘cookies’ may be used while using services or products rendered by chat.io. These are pieces of information sent by the server, stored on a user’s computer for the purpose of automatic identification of a particular user when using our services. ‘Cookies’ enable us to quickly confirm your identity and owing to them the use of our services becomes much easier and more widely available. ‘Cookies’ are used by chat.io solely with the purpose of personalizing a particular user. ‘Cookies’ can be used on condition that they are accepted by a browser and that they shall not be removed from the storage media. Users who removed ‘cookies’ from their storage media or have not accepted them on their browser may not have access to products or services rendered by chat.io. We do not link the information we store in cookies to any personal data you submit while on our site.\n" +
                "\n" +
                "The use of third party cookies is not covered by our privacy policy. We do not have access or control over these cookies.\n";



        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(s);
    }
}
