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

import com.geogehigbie.giftbug.MainActivity;
import com.geogehigbie.giftbug.R;


public class CoffeeTea extends Fragment {

    private View view;

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private static String personLower;
    private static String personUpper;
    private static boolean hasYChromosome;
    private static boolean isAdult;
    private static boolean english;


    private static boolean isCoffee;
    private static boolean isTea;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_coffee_tea, container, false);

        personLower = ManWomanBoyGirl.getPersonLower();
        personUpper = ManWomanBoyGirl.getPersonUpper();
        hasYChromosome = ManWomanBoyGirl.isHasYChromosome();
        isAdult = ManWomanBoyGirl.isAdult();
        english = MainActivity.isEnglish();

        setTextView();
        setOnClickListeners();
        // Inflate the layout for this fragment
        return view;
    }

    public static boolean isCoffee() {
        return isCoffee;
    }


    public static boolean isTea() {
        return isTea;
    }

    public void setTextView() {

        String coffeTeaString = "Does " + personLower + " drink coffee, tea or neither?";
        String coffeTeaStringEsp = "¿Prefiere tomar café, té o ninguno?";


        TextView coffeeTeaText = (TextView) view.findViewById(R.id.coffee_tea);

        if (english) {
            coffeeTeaText.setText(coffeTeaString);
        } else {
            coffeeTeaText.setText(coffeTeaStringEsp);
        }
    }

    public void setOnClickListeners() {

        Button coffeeButton = (Button) view.findViewById(R.id.coffee_button);
        Button teaButton = (Button) view.findViewById(R.id.tea_button);
        Button neitherButton = (Button) view.findViewById(R.id.neither_button);
        Button bothButton = (Button) view.findViewById(R.id.both_button);

        if (!english) {
            coffeeButton.setText("Café");
            teaButton.setText("Té");
            neitherButton.setText("ninguno");
        }

        coffeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCoffee = true;
                loadFragment();
            }
        });

        teaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isTea = true;
                loadFragment();
            }
        });

        neitherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCoffee = true;
                isTea = true;
                loadFragment();
            }
        });

        bothButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCoffee = false;
                isTea = false;
                loadFragment();
            }
        });

    }

    public void loadFragment() {
        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new OutdoorsIndoors());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }


}
