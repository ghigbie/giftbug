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


public class CollarNoCollar extends Fragment {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private static String personLower;
    private static String personUpper;
    private static boolean hasYChromosome;
    private static boolean isAdult;

    private static boolean wearsCollar;


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
        return inflater.inflate(R.layout.fragment_collar_no_collar, container, false);
    }

    public static boolean isWearsCollar() {
        return wearsCollar;
    }

    public void setTextView(){

        String wearsCollarString = "Does " + personLower + " usually wear a collar or no collar?";

        TextView wearsCollarText  = (TextView) getActivity().findViewById(R.id.collar_no_collar);
        wearsCollarText.setText(wearsCollarString);


    }

    public void setOnClickListeners(){

        Button collarButton = (Button) getActivity().findViewById(R.id.collar_button);
        Button noCollarButton = (Button) getActivity().findViewById(R.id.no_collar_button);

        collarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wearsCollar = true;

                if(isAdult){
                    loadFragmentAdult();
                }
                else{
                    loadFragmentChild();
                }
            }
        });

        noCollarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wearsCollar = false;

                if(isAdult){
                    loadFragmentAdult();
                }
                else{
                    loadFragmentChild();
                }
            }
        });

    }

    public void loadFragmentAdult(){
        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new BurgersOrFine());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    public void loadFragmentChild(){
        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new McDonaldsOrChucky());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

}
