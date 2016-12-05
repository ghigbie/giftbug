package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geogehigbie.giftbug.MainActivity;
import com.geogehigbie.giftbug.R;


public class WelcomeTwo extends Fragment {

    private static boolean english;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        english = MainActivity.isEnglish();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome_two, container, false);
    }

}


