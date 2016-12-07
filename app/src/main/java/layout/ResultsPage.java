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

import java.util.ArrayList;
import java.util.List;


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

    private List<Gift> giftsList;

    //these variables need to be defined
    private boolean burgers;
    private boolean fine;
    private boolean collar;
    private boolean outdoors;
    private boolean indoors;
    private boolean coffee;
    private boolean tea;
    private boolean neitherCoffeeTea;

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

        giftsList = new ArrayList<Gift>();

        Gift teaSet = new Gift("https://images-na.ssl-images-amazon.com/images/I/91LTtbcJH7L._SX522_.jpg",
               "Wissotzky Tea, The Journey Collection, Tea Lovers Assortment 80 Sealed Bags");

        Gift coffeeSet = new Gift("https://images-na.ssl-images-amazon.com/images/I/91LTtbcJH7L._SX522_.jpg",
                "Wissotzky Tea, The Journey Collection, Tea Lovers Assortment 80 Sealed Bags");

        Gift hikingKit = new Gift("https://images-na.ssl-images-amazon.com/images/I/91LTtbcJH7L._SX522_.jpg",
                "Wissotzky Tea, The Journey Collection, Tea Lovers Assortment 80 Sealed Bags");

        Gift indoorKit = new Gift("https://images-na.ssl-images-amazon.com/images/I/91LTtbcJH7L._SX522_.jpg",
                "Wissotzky Tea, The Journey Collection, Tea Lovers Assortment 80 Sealed Bags");

        Gift moanaSet = new Gift("https://images-na.ssl-images-amazon.com/images/I/91D2iXJCd6L._SL1500_.jpg",
                "Disney Collection Moana Figurine Playset");

        Gift moanaBlanket = new Gift("https://images-na.ssl-images-amazon.com/images/I/91lwegBjmiL._SL1500_.jpg",
                "Disney Moana \'The Wave\' 62\" x 90\" Twin Blanket");

        Gift outdoorJacket = new Gift("https://images-na.ssl-images-amazon.com/images/I/91Obdum2ShL._UL1500_.jpg",
                "The North Face Men's Venture Jacket");

        Gift outdoorJacketW = new Gift("https://images-na.ssl-images-amazon.com/images/I/81nTqJxMWFL._SL1500_.jpg",
                "The North Face Women's Venture Jacket");

        Gift speakerBass = new Gift ("https://images-na.ssl-images-amazon.com/images/I/31STZw0kV5L.jpg",
                "Sony SRSXB3/BLK Portable Wireless Speaker with Bluetooth (Black)");

        Gift campingKnife = new Gift ("https://images-na.ssl-images-amazon.com/images/I/71PEGYL2WpL._SL1500_.jpg",
                "New 6-in-1 Best Survival Knife Ultimate Survival Tool Zombie Survival Kit Tactical Folding Knife Seatbelt " +
                        "Cutter Glass Breaker Fire Starter LED Light Bottle Opener Hunting Camping Rambo Knife");

        Gift movieTickets = new Gift ("https://images-na.ssl-images-amazon.com/images/I/91bQ7OB3qrL._SL1500_.jpg",
                "Regal Entertainment Gift Card");

        Gift starbucksCard = new Gift ("https://images-na.ssl-images-amazon.com/images/I/516nsy8Rf2L.jpg",
                "Starbucks Gift Card");


        //the first decision is if the person an adult
        if(isAdult) {
            if (burgers) {
                giftsList.add(moanaSet);
            }

            if (fine) {
                giftsList.add(moanaBlanket);
            }

            if (coffee) {
                giftsList.add(coffeeSet);
            }

            if (tea) {
                giftsList.add(teaSet);
            }
            if(hasYChromosome){
                giftsList.add(outdoorJacket);

            }else{
                giftsList.add(outdoorJacketW);
            }
        }

        if(!isAdult){

        }

        if(!isAdult){

        }




    }




}
