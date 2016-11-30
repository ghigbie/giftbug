package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.geogehigbie.giftbug.R;


public class OutdoorsIndoors extends Fragment {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    private static String personLower;
    private static String personUpper;
    private static boolean hasYChromosome;
    private static boolean isAdult;

    private static boolean prefersOutdoors;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        personLower = ManWomanBoyGirl.getPersonLower();
        personUpper = ManWomanBoyGirl.getPersonUpper();
        hasYChromosome = ManWomanBoyGirl.isHasYChromosome();
        isAdult = ManWomanBoyGirl.isAdult();

        setTextView();
        setOnClickListeners();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_outdoors_indoors, container, false);
    }


    public static boolean isPrefersOutdoors() {
        return prefersOutdoors;
    }

    private void setTextView(){
        String outdoorsString = "Does " + personLower + " prefer the outdoors or the indoors?";
        TextView outdoorText = (TextView) getActivity().findViewById(R.id.outdoors_indoors);
        outdoorText.setText(outdoorsString);

    }

    public void setOnClickListeners() {

        Button outdoorsButton = (Button) getActivity().findViewById(R.id.outdoors_button);
        Button indoorsButton = (Button) getActivity().findViewById(R.id.indoors_button);

        outdoorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prefersOutdoors = true;
            }
        });

        indoorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prefersOutdoors = false;
            }
        });


        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new CollarNoCollar());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
