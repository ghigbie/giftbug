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


public class McDonaldsOrChucky extends Fragment {

    private View view;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private static String personLower;
    private static String personUpper;
    private static boolean hasYChromosome;
    private static boolean isAdult;
    private static boolean english;

    private static boolean prefersMcDonalds;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_mc_donalds_or_chucky, container, false);
        personLower = ManWomanBoyGirl.getPersonLower();
        personUpper = ManWomanBoyGirl.getPersonUpper();
        hasYChromosome = ManWomanBoyGirl.isHasYChromosome();
        isAdult = ManWomanBoyGirl.isAdult();
        english = MainActivity.isEnglish();

        setTextView();
        setOnClickListers();

        // Inflate the layout for this fragment
        return view;
    }

    public void setTextView(){

        String mcDonaldsString = "Does " + personLower + " prefer McDonalds or Chuck E. Cheese's?";
        String mcDonaldsStringEsp = "¿Prefiere comer en McDonalds o Chuck E. Cheese's?";


        TextView mcDonaldsText = (TextView) view.findViewById(R.id.mcdonald_or_chucky);

        if(english){
            mcDonaldsText.setText(mcDonaldsString);
        }
        else{
            mcDonaldsText.setText(mcDonaldsStringEsp);
        }

    }

    public static boolean isPrefersMcDonalds() {
        return prefersMcDonalds;
    }

    public void setOnClickListers(){

        Button mcDonaldsButton = (Button) view.findViewById(R.id.mcdonald_button);
        Button chuckyButton = (Button) view.findViewById(R.id.chucky_button);


        mcDonaldsButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                prefersMcDonalds = true;
                loadFragment();
            }
        });

        chuckyButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                prefersMcDonalds = false;
                loadFragment();
            }
        });

    }

    public void loadFragment(){
        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new ResultsPage());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }


}
