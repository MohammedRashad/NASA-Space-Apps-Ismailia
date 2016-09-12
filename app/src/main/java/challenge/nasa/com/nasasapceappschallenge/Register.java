package challenge.nasa.com.nasasapceappschallenge;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

/**
 * Created by rashad on 3/11/16.
 */
public class Register extends Fragment {


    View rootView;
    Button ismailiaRegister, cairoRegister, gounaRegister;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.register, container, false);


        ismailiaRegister = (Button) rootView.findViewById(R.id.ismailiaRegister);
        cairoRegister = (Button) rootView.findViewById(R.id.cairoRegister);
        gounaRegister = (Button) rootView.findViewById(R.id.gounaRegister);


        ismailiaRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://2016.spaceappschallenge.org/locations/ismailia-egypt"));
                startActivity(browserIntent);

            }
        });

        cairoRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://2016.spaceappschallenge.org/locations/cairo"));
                startActivity(browserIntent);

            }
        });

        ismailiaRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://2016.spaceappschallenge.org/locations/el-gouna-egypt/"));
                startActivity(browserIntent);

            }
        });


        return rootView;

    }


}