package challenge.nasa.com.nasasapceappschallenge;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Contact extends Fragment {

    View rootView;
    Button facebook,twitter;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.contact, container, false);


        facebook = (Button) rootView.findViewById(R.id.button);
        twitter = (Button) rootView.findViewById(R.id.button2);


        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/eureka.scu/"));
                startActivity(browserIntent);

            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/eureka_sci"));
                startActivity(browserIntent);

            }
        });





        return rootView;

    }


}
