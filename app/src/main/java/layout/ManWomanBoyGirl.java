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

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        createOnClickEvents();
        return inflater.inflate(R.layout.fragment_man_woman_boy_girl, container, false);

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

        Button manButton = (Button) getActivity().findViewById(R.id.man_button);
        Button womanButton = (Button) getActivity().findViewById(R.id.woman_button);
        Button boyButton = (Button) getActivity().findViewById(R.id.boy_button);
        Button girlButton = (Button) getActivity().findViewById(R.id.girl_button);

        manButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                personLower = "he";
                personUpper = "He";
                hasYChromosome = true;
                isAdult = true;
                loadNextFragmentAdult();
            }
        });


        womanButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                personLower = "she";
                personUpper = "She";
                hasYChromosome = false;
                isAdult = true;
                loadNextFragmentAdult();
            }
        });


        boyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                personLower = "he";
                personUpper = "He";
                hasYChromosome = true;
                isAdult = false;
                loadNextFragmentChild();
            }
        });


        girlButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                personLower = "she";
                personUpper = "She";
                hasYChromosome = false;
                isAdult = false;
                loadNextFragmentChild();
            }
        });


    }

    public void loadNextFragmentAdult(){
        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new CoffeeTea());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    public void loadNextFragmentChild(){
        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new SodaJuice());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }



}
