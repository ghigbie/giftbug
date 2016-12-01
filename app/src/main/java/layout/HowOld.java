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


public class HowOld extends Fragment {


    private View view;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private static String personLower;
    private static String personUpper;
    private static boolean hasYChromosome;
    private static boolean isAdult;

    private static int age;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_how_old, container, false);

        personLower = ManWomanBoyGirl.getPersonLower();
        personUpper = ManWomanBoyGirl.getPersonUpper();
        hasYChromosome = ManWomanBoyGirl.isHasYChromosome();
        isAdult = ManWomanBoyGirl.isAdult();


        changeText();
        addClickLister();
        // Inflate the layout for this fragment
        return view;
    }

    public static int getAge() {
        return age;
    }

    public void changeText(){

        String question = "How old is " + personLower + "?";

        TextView textHowOld = (TextView) view.findViewById(R.id.how_old_text);
        textHowOld.setText(question);
    }

    public void addClickLister(){

        Button nextButton = (Button) view.findViewById(R.id.next2);
        nextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();

                if(isAdult)
                fragmentTransaction.replace(R.id.fragment_container, new CoffeeTea());
                else{
                fragmentTransaction.replace(R.id.fragment_container, new SodaJuice()) ;
                }

                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
    }





}
