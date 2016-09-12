package challenge.nasa.com.nasasapceappschallenge;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    int id, state, factNumber;

    Fragment fr;
    Random rand;
    Toolbar toolbar;
    DrawerLayout drawer;
    AlertDialog alertDialog;
    FloatingActionButton fab;
    ArrayList<String> dataList;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;
    AlertDialog.Builder alertDialogBuilder;
    android.support.v4.app.FragmentTransaction ft;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        state = 0;

        //Sets Layout
        setContentView(R.layout.activity_main);


        //Toolbar Default Config
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Nasa Space Apps");
        setSupportActionBar(toolbar);

        //Default Fragment
        fr = new SpaceApps();
        setFragment(fr);


        setupNavigationBar();

        //Action Button
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setBackgroundTintList(ColorStateList.valueOf(0xff0D47A1));


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                displayDialogBox();

            }
        });


        fab.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {


                Snackbar.make(v, "This Button Displays Random NASA Facts!!", Snackbar.LENGTH_LONG).show();

                return false;
            }

        });


    }


    //******************************************************************************************//
    //******************************************************************************************//


    //Handles Back Key Presses
    //If Navigation Drawer Opened or not
    @Override
    public void onBackPressed() {


        if (drawer.isDrawerOpen(GravityCompat.START)) {

            drawer.closeDrawer(GravityCompat.START);

        } else {

            super.onBackPressed();

        }

    }


    //Change Fragments here When Clicking
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        id = item.getItemId();

        decideWhichItemWasClicked(id);

        drawer.closeDrawer(GravityCompat.START);

        return true;

    }


    //******************************************************************************************//
    //******************************************************************************************//


    private void setupNavigationBar() {

        //Navigation Drawer Setup
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();


        //Setups the Navigation View
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    private void decideWhichItemWasClicked(int barID) {

        if (barID == R.id.apps) {

            fr = new SpaceApps();
            setFragment(fr);
            toolbar.setTitle("NASA Space Apps");

        } else if (barID == R.id.chall) {

            fr = new Challenge();
            setFragment(fr);
            toolbar.setTitle("Challenges");

        } else if (barID == R.id.eureka) {

            fr = new Eureka();
            setFragment(fr);
            toolbar.setTitle("Eureka");

        } else if (barID == R.id.con) {

            fr = new Contact();
            setFragment(fr);
            toolbar.setTitle("Contact US");

        } else if (barID == R.id.mentor) {

            fr = new Mentor();
            setFragment(fr);
            toolbar.setTitle("Mentors");

        } else if (barID == R.id.nasa) {

            fr = new Nasa();
            setFragment(fr);
            toolbar.setTitle("About NASA");

        } else if (barID == R.id.reg) {

            fr = new Register();
            setFragment(fr);
            toolbar.setTitle("Registration");

        } else if (barID == R.id.sch) {

            fr = new Schedule();
            setFragment(fr);
            toolbar.setTitle("Event Schedule");

        } else if (barID == R.id.Share) {

            fr = new Spread();
            setFragment(fr);
            toolbar.setTitle("Spread The Word");

        } else if (barID == R.id.spon) {

            fr = new Sponsors();
            setFragment(fr);
            toolbar.setTitle("Sponsors");

        } else if (barID == R.id.stream) {

            fr = new Streaming();
            setFragment(fr);
            toolbar.setTitle("Streaming");

        } else if (barID == R.id.supp) {

            fr = new Technical();
            setFragment(fr);
            toolbar.setTitle("Hereos Behind It");

        } else if (barID == R.id.where) {

            fr = new Attend();
            setFragment(fr);
            toolbar.setTitle("Where To Attend ?");

        } else if (barID == R.id.pi) {

            fr = new Pi();
            setFragment(fr);
            toolbar.setTitle("About");

        }



    }


    public void setFragment(Fragment fragment) {

        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.mainFrame, fragment);
        ft.commit();

    }


    public void setRandomFactsList() {

        dataList = new ArrayList<>();

        dataList.add("NASA often shows the Hollywood movie “Armageddon” as part of its management training program and then asks its new staff to identify as many scientific inaccuracies as they can.\n\nThere are at least 168 of them");
        dataList.add("The toaster in your kitchen contains a more powerful computer than the one used by NASA to send astronauts to the moon.\n\nIt only had 64Kbyte of memory and operated at 0.043MHz.");
        dataList.add("In 2006, NASA admitted that they no longer had the original video tapes of the moon landing because they recorded over them.");
        dataList.add("Three men from Yemen sued NASA for trespassing on Mars. They claimed that they inherited the planet from their ancestors 3,000 years ago. ");
        dataList.add("NASA has an Office of Planetary Protection, just in case we do indeed find life on other planets.");
        dataList.add("It takes NASA and Voyager I approximately 32 hours to communicate with each other, with a bandwidth of 115.2 kilobits per second");
        dataList.add("It is a myth that NASA spent millions of dollars producing the space pen while soviet astronauts simply used a pencil.");
        dataList.add("In 2006 NASA scientists discovered a strange noise in deep space that was several times louder than anything they would expect. To this day they do not know what it was and it has been dubbed the \"Space Roar\".");
        dataList.add("To be officially considered an astronaut by NASA you must travel at least 50 miles above the surface of the Earth.");
        dataList.add("Since the Space Shuttle electronics were so outdated and nobody made them anymore, NASA actually resorted to buying spare parts on websites like eBay");


    }

    public String getRandomFact() {

        rand = new Random();
        factNumber = rand.nextInt(10);

        return dataList.get(factNumber);

    }


    public void displayDialogBox() {


        alertDialogBuilder = new AlertDialog.Builder(this);

        setRandomFactsList();

        alertDialogBuilder.setTitle("Did you know ?");
        alertDialogBuilder.setMessage(getRandomFact());

        alertDialogBuilder.setPositiveButton("Cool !!",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        alertDialog.dismiss();

                    }
                });


        alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }

}