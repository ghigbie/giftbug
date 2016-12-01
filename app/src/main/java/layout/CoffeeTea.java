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

    private View view;

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

        view = inflater.inflate(R.layout.fragment_coffee_tea, container, false);

        personLower = ManWomanBoyGirl.getPersonLower();
        personUpper = ManWomanBoyGirl.getPersonUpper();
        hasYChromosome = ManWomanBoyGirl.isHasYChromosome();
        isAdult = ManWomanBoyGirl.isAdult();

        setTextView();
        setOnClickListeners();
        // Inflate the layout for this fragment
        return view;
    }

    public static boolean isCoffee() {
        return isCoffee;
    }

    public static boolean isNeither() {
        return isNeither;
    }

    public void setTextView(){

        String coffeTeaString = "Does " + personLower + " drink coffee, tea or neither?";

        TextView coffeeTeaText = (TextView) view.findViewById(R.id.coffee_tea);
        coffeeTeaText.setText(coffeTeaString);
    }

    public void setOnClickListeners(){

        Button coffeeButton = (Button) view.findViewById(R.id.coffee_button);
        Button teaButton = (Button) view.findViewById(R.id.tea_button);
        Button neitherButton = (Button) view.findViewById(R.id.neither_button);

        coffeeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                isCoffee = true;
                loadFragment();
            }
        });

        teaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCoffee = false;
                loadFragment();
            }
        });

        neitherButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                isNeither = true;
                loadFragment();
            }
        });




    }

    public void loadFragment(){
        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new OutdoorsIndoors());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }




}
