package layout;

import android.animation.Animator;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.geogehigbie.giftbug.R;


public class BurgersOrFine extends Fragment {

    private View view;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private static String personLower;
    private static String personUpper;
    private static boolean hasYChromosome;
    private static boolean isAdult;

    private static boolean prefersBurgers;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_burgers_or_fine, container, false);

        personLower = ManWomanBoyGirl.getPersonLower();
        personUpper = ManWomanBoyGirl.getPersonUpper();
        hasYChromosome = ManWomanBoyGirl.isHasYChromosome();
        isAdult = ManWomanBoyGirl.isAdult();


        setTextViews();
        setOnClickListeners();

        // Inflate the layout for this fragment
        return view;
    }

    public static boolean isPrefersBurgers() {
        return prefersBurgers;
    }

    public void setTextViews(){

        String burgerString = "Does " + personLower + " prefer burgers and fries or fine dining?";

        TextView burgerText = (TextView) view.findViewById(R.id.burgers_fine);
        burgerText.setText(burgerString);


    }

    public void setOnClickListeners(){

        Button burgerButton = (Button) view.findViewById(R.id.burger_button);
        Button fineButton = (Button) view.findViewById(R.id.fine_button);

        burgerButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                prefersBurgers = true;
                beginAnimation();
            }
        });

        fineButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                prefersBurgers = false;
                beginAnimation();
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


    public void beginAnimation(){
        ImageView bug = (ImageView) view.findViewById(R.id.bug_spinner);
        bug.animate().rotation(360).setDuration(750).start();
        bug.animate().setStartDelay(100).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
               loadFragment();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

    }



}
