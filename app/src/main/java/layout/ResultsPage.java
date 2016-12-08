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


    private boolean isSixties;
    private boolean isFifties;
    private boolean isForties;
    private boolean isThirties;
    private boolean isTwenties;
    private boolean isCollege;
    private boolean isTeenager;
    private boolean isPreTeen;
    private boolean isChild;
    private boolean isYoungChild;
    private boolean isTodler;
    private boolean isBaby;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        english = MainActivity.isEnglish();
        view = inflater.inflate(R.layout.fragment_results_page, container, false);

        setTextView();
        // Inflate the layout for this fragment
        return view;
    }

    public void determineAgeClass(){
        int age = HowOld.getAge();

        if(age >= 60){
            isSixties = true;
        }
        else if(age <= 59 && age >=50){
            isFifties = true;
        }
        else if(age <= 49 && age >=40){
            isForties = true;
        }
        else if(age <= 39 && age >=30){
            isThirties = true;
        }
        else if(age <= 29 && age >= 23){
            isTwenties = true;
        }
        else if(age <= 22 && age >= 18){
            isCollege = true;
        }
        else if(age <= 17 && age >= 13){
            isTeenager= true;
        }
        else if(age <= 12 && age >= 8){
            isChild = true;
        }
        else if(age <= 7 && age >= 5){
            isYoungChild = true;
        }
        else if(age <= 4 && age >= 3 ){
            isTodler = true;
        }
        else if(age <= 2){
            isBaby = true;
        }


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

        Gift

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

        Gift tacoBellCard = new Gift ("https://images-na.ssl-images-amazon.com/images/I/417Hr78EBVL.jpg", "Taco Bell Gift Card");

        Gift burgerKindCard = new Gift ("https://images-na.ssl-images-amazon.com/images/I/71EXhd%2BUxOL._SL1500_.jpg", "Burger King Gift Card");

        Gift subwayGiftCard = new Gift ("https://images-na.ssl-images-amazon.com/images/I/81fzr22XyOL._SL1500_.jpg", "SUBWAY Gift Card");

        Gift kindleSet = new Gift ("https://images-na.ssl-images-amazon.com/images/I/91a7qlSdjTL._SL1500_.jpg",
                "Kindle Paperwhite E-reader - Black, 6\" High-Resolution Display (300 ppi) with Built-in Light, Wi-Fi - Includes Special Offers");

        Gift paneraCard = new Gift ("https://images-na.ssl-images-amazon.com/images/I/818%2B%2BmRB-ZL._SL1500_.jpg", "Panera Bread Gift Card");

        Gift womensWatch = new Gift ("https://images-na.ssl-images-amazon.com/images/I/412Xe9-8H6L._SY220_.jpg",
                "Anne Klein Women's AK/2245RTST Swarovski Crystal Accented Rose Gold-Tone and Silver-Tone Bangle Watch and Bracelet Set");



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

        if(hasYChromosome)

        if(!isAdult){

        }


        if(!isAdult){

        }


        if(isSixties){


        }


        if(isFifties){

        }


        if(isForties){

        }


        if(isThirties){

        }


        if(isTwenties){


        }



        if(isCollege){

        }



        if(isTeenager){

        }



        if(isChild){

        }



        if(isYoungChild){

        }


        if(isTodler){


        }


        if(isBaby){


        }




    }




}
