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


public class CoffeeTea extends Fragment {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private static String personLower;
    private static String personUpper;
    private static boolean hasYChromosome;
    private static boolean isAdult;

    private static boolean isCoffee;
    private static boolean isNeither;


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
        return inflater.inflate(R.layout.fragment_coffee_tea, container, false);
    }


    public void setTextView(){

        String coffeTeaString = "Does " + personLower + " drink coffee, tea or neither?";

        TextView coffeeTeaText = (TextView) getActivity().findViewById(R.id.coffee_tea);
        coffeeTeaText.setText(coffeTeaString);
    }

    public void setOnClickListeners(){

        Button coffeeButton = (Button) getActivity().findViewById(R.id.coffee_button);
        Button teaButton = (Button) getActivity().findViewById(R.id.tea_button);
        Button neitherButton = (Button) getActivity().findViewById(R.id.neither_button);



    }




}
