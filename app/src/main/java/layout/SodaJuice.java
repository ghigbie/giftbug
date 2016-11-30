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

public class SodaJuice extends Fragment {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private static String personLower;
    private static String personUpper;
    private static boolean hasYChromosome;
    private static boolean isAdult;

    private static boolean isSoda;
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
        return inflater.inflate(R.layout.fragment_soda_juice, container, false);
    }

    public static boolean isNeither() {
        return isNeither;
    }

    public static boolean isSoda() {
        return isSoda;
    }

    public void setTextView(){

        String sodaJuiceString = "Does " + personLower + " drink soda, juice, or neither?";

        TextView coffeeTeaText = (TextView) getActivity().findViewById(R.id.soda_juice_text);
        coffeeTeaText.setText(sodaJuiceString);
    }

    public void setOnClickListeners(){

        Button sodaButton = (Button) getActivity().findViewById(R.id.coffee_button);
        Button juiceButton = (Button) getActivity().findViewById(R.id.tea_button);
        Button neitherChildButton = (Button) getActivity().findViewById(R.id.neither_button_child);

        sodaButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                isSoda = true;
                loadFragment();
            }
        });

        juiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isSoda = false;
                loadFragment();
            }
        });

        neitherChildButton.setOnClickListener(new View.OnClickListener(){
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
