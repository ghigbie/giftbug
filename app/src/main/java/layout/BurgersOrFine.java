package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geogehigbie.giftbug.R;


public class BurgersOrFine extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        setTextViews();
        setOnClickListeners();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_burgers_or_fine, container, false);
    }



    public void setTextViews(){

    }

    public void setOnClickListeners(){

    }



}
