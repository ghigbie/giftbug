package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.geogehigbie.giftbug.R;


public class ManWomanBoyGirl extends Fragment {

    private static String personLower;
    private static String personUpper;
    private static boolean hasYChromosome;
    private static boolean isAdult;

    private View view;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_man_woman_boy_girl, container, false);
        // Inflate the layout for this fragment

        createOnClickEvents();
        return view;

    }

    //getters that will be needed for other fragments to access these variables
    public static boolean isHasYChromosome() {
        return hasYChromosome;
    }

    public static String getPersonLower() {
        return personLower;
    }

    public static String getPersonUpper() {
        return personUpper;
    }

    public static boolean isAdult() {
        return isAdult;
    }

    public void createOnClickEvents(){

        Button manButton = (Button) view.findViewById(R.id.man_button);
        Button womanButton = (Button) view.findViewById(R.id.woman_button);
        Button boyButton = (Button) view.findViewById(R.id.boy_button);
        Button girlButton = (Button) view.findViewById(R.id.girl_button);

        manButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                personLower = "he";
                personUpper = "He";
                hasYChromosome = true;
                isAdult = true;
                loadNextFragment();
            }
        });


        womanButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                personLower = "she";
                personUpper = "She";
                hasYChromosome = false;
                isAdult = true;
                loadNextFragment();
            }
        });


        boyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                personLower = "he";
                personUpper = "He";
                hasYChromosome = true;
                isAdult = false;
                loadNextFragment();
            }
        });


        girlButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                personLower = "she";
                personUpper = "She";
                hasYChromosome = false;
                isAdult = false;
                loadNextFragment();
            }
        });


    }

    public void loadNextFragment(){
        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new HowOld());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }





}
