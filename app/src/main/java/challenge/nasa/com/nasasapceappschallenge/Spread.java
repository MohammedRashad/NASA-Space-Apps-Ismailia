package challenge.nasa.com.nasasapceappschallenge;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by rashad on 3/11/16.
 */

public class Spread extends Fragment {

    View rootView;
    Button tellAboutHackathon, makeFriendsRegister, spreadAwareness, TellAboutEureka, SpreadVolunteering;

    @Override

    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.spread, container, false);


        tellAboutHackathon = (Button) rootView.findViewById(R.id.tellAboutHackathon);
        makeFriendsRegister = (Button) rootView.findViewById(R.id.makeFriendsRegister);
        spreadAwareness = (Button) rootView.findViewById(R.id.spreadAwareness);
        TellAboutEureka = (Button) rootView.findViewById(R.id.TellAboutEureka);
        SpreadVolunteering = (Button) rootView.findViewById(R.id.SpreadVolunteering);



        tellAboutHackathon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(android.content.Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "I Heard About Nasa Space Apps Ismailia and it's Amazing, check it out, people\nhttps://www.facebook.com/events/1068267289863486/permalink/1091708607519354/ \n\n#NASASpaceAppsIsmailia");
                startActivity(Intent.createChooser(intent, "How do you want to share?"));

            }
        });


        makeFriendsRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(android.content.Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "IF you think you are creative enough to change the world, join the space apps with me, let's do it now?\nhttps://2016.spaceappschallenge.org/locations/ismailia-egypt \n#NASASpaceAppsIsmailia");
                startActivity(Intent.createChooser(intent, "How do you want to share?"));
            }
        });


        spreadAwareness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String[] items = {
                        "NASA Space Apps : Earth\n\nhttps://2016.spaceappschallenge.org/challenges/earth", "NASA Space Apps : Journey to Mars\n\nhttps://2016.spaceappschallenge.org/challenges/mars", "NASA Space Apps : Technology\n\nhttps://2016.spaceappschallenge.org/challenges/tech",  "NASA Space Apps : Space Station\n\nhttps://2016.spaceappschallenge.org/challenges/space-station", "NASA Space Apps : Astronauticshttps://2016.spaceappschallenge.org/challenges/aero", "NASA Space Apps : Solar System\n\nhttps://2016.spaceappschallenge.org/challenges/solar-system"
                };

                final String[] itemsList = {
                        "Earth","Jouney To Mars", "Technology", "Space Station" , "Aeronautics", "Solar System"
                };

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Tell your friend about a Problem in the Space Apps");
                builder.setItems(itemsList, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {


//                        mDoneButton.setText(items[item]);


                        Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        intent.putExtra(Intent.EXTRA_TEXT, items[item] + "\n\n#NASASpaceAppsIsmailia");
                        startActivity(Intent.createChooser(intent, "How do you want to share?"));


                    }
                });
                AlertDialog alert = builder.create();
                alert.show();



            }
        });


        TellAboutEureka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Eureka have been spreading knowledge for more than 5 years, they are such heroes!!\n\nCheck them out : https://www.facebook.com/eureka.scu/?fref=ts #NASASpaceAppsIsmailia");
                startActivity(Intent.createChooser(intent, "How do you want to share?"));


            }
        });


        SpreadVolunteering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Volunteering makes you a better person, volunteer and help others! #NASASpaceAppsIsmailia");
                startActivity(Intent.createChooser(intent, "How do you want to share?"));


            }
        });



        return rootView;

    }


}