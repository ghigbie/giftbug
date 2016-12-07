package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.geogehigbie.giftbug.Gift;
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

        setTextView();
        // Inflate the layout for this fragment
        return view;
    }

    public void setTextView(){

        String resultsTitle = "Gift Bug Results";
        String resultsTitleEsp = "Los Resultados de Gift Bug";

        String resultsString = "Here are the results that we think " + personLower + " will love. (Clicking on an item will take you " +
                "directly to the item\'s Amazon page.)";

        String resultsStringEsp = "Abajo son los regalos que se recomiendan. (Si usted hace clique abajo, le llevará a la página de Amazon.)";

        TextView resultsText = (TextView) view.findViewById(R.id.results_text);
        TextView resultsTitleText = (TextView) view.findViewById(R.id.results_title);

        if(english) {
            resultsText.setText(resultsString);
            resultsTitleText.setText(resultsTitle);
        }
        else {
            resultsText.setText(resultsStringEsp);
            resultsTitleText.setText(resultsTitleEsp);
        }

    }

    public void createGifts(){

        Gift teaSet = new Gift("https://images-na.ssl-images-amazon.com/images/I/91LTtbcJH7L._SX522_.jpg",
               "Wissotzky Tea, The Journey Collection, Tea Lovers Assortment 80 Sealed Bags", "An assorment of tea.");

        Gift coffeeSet = new Gift("https://images-na.ssl-images-amazon.com/images/I/91LTtbcJH7L._SX522_.jpg",
                "Wissotzky Tea, The Journey Collection, Tea Lovers Assortment 80 Sealed Bags", "An assorment of tea.");

        Gift hikingKit = new Gift("https://images-na.ssl-images-amazon.com/images/I/91LTtbcJH7L._SX522_.jpg",
                "Wissotzky Tea, The Journey Collection, Tea Lovers Assortment 80 Sealed Bags", "An assorment of tea.");

        Gift indoorKit = new Gift("https://images-na.ssl-images-amazon.com/images/I/91LTtbcJH7L._SX522_.jpg",
                "Wissotzky Tea, The Journey Collection, Tea Lovers Assortment 80 Sealed Bags", "An assorment of tea.");

        Gift moanaSet = new Gift("https://images-na.ssl-images-amazon.com/images/I/91D2iXJCd6L._SL1500_.jpg",
                "Disney Collection Moana Figurine Playset", "A set of toys from Disney\'s Moana");

        Gift moanaBlanket = new Gift("https://images-na.ssl-images-amazon.com/images/I/91lwegBjmiL._SL1500_.jpg",
                "Disney Moana \'The Wave\' 62\" x 90\" Twin Blanket", "A bed set from the disney movie Moana");

        Gift outdoorJacket = new Gift("https://images-na.ssl-images-amazon.com/images/I/91Obdum2ShL._UL1500_.jpg",
                "The North Face Men's Venture Jacket", "A jacket for outdoor people");

        Gift outdoorJacketW = new Gift("https://images-na.ssl-images-amazon.com/images/I/81nTqJxMWFL._SL1500_.jpg",
                "The North Face Women's Venture Jacket", "A jacket for outdoor people");

        Gift speakerBass = new Gift ("https://images-na.ssl-images-amazon.com/images/I/31STZw0kV5L.jpg",
                "Sony SRSXB3/BLK Portable Wireless Speaker with Bluetooth (Black)", "A speaker");

    }






}
