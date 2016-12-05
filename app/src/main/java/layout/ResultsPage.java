package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.geogehigbie.giftbug.MainActivity;
import com.geogehigbie.giftbug.R;


public class ResultsPage extends Fragment {

    private View view;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private static String personLower;
    private static String personUpper;
    private static boolean hasYChromosome;
    private static boolean isAdult;
    private static boolean english;

    private static boolean prefersBurgers;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        english = MainActivity.isEnglish();
        view = inflater.inflate(R.layout.fragment_results_page, container, false);

        // Inflate the layout for this fragment
        return view;
    }

    public void setTextView(){

        String resultsString = "Here are the results that we think " + personLower + " will love. (Clicking on an item will take you " +
                "directly to the item\'s Amazon page.)";

        String resultsStringEsp = "Abajo son los regalos que se recomiendan. (Si usted hace clique abajo, le llevará a la página de Amazon.)";

        TextView resultsText = (TextView) view.findViewById(R.id.results_text);

        if(english) {
            resultsText.setText(resultsString);
        }
        else {
            resultsText.setText(resultsStringEsp);
        }

    }






}
