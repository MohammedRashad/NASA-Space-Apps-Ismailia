package challenge.nasa.com.nasasapceappschallenge;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Mentor extends Fragment {

    @Override

    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.mentor, container, false);

    }


}