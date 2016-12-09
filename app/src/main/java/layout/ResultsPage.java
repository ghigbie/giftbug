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

        determineAgeClass();

        setTextView();
        // Inflate the layout for this fragment
        return view;
    }

    public void defineVariables(){

    }

    public void determineAgeClass(){
        int age = HowOld.getAge();

        if(age <= 200 && age >= 23 ){
            isAdult = true;
        }

        //this will come into play as the app gets more developed
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
            isTeenager = true;
        }
        else if(age <= 12 && age >= 11){
            isPreTeen = true;
        }
        else if(age <= 10 && age >= 8){
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
               "Wissotzky Tea, The Journey Collection, Tea Lovers Assortment 80 Sealed Bags",
                "https://www.amazon.com/Wissotzky-Tea-Journey-Collection-Assortment/dp/B00GSQ8GRE?th=1");

        Gift coffeeSet = new Gift("https://images-na.ssl-images-amazon.com/images/I/71yQ5cmW9jL._SX522_.jpg",
                "Treasure Chest of Coffee",
                "https://www.amazon.com/Coffee-Beanery-2590215-Treasure-Chest/dp/B00GR9EM3O/ref=sr_1_4_a_it?ie=UTF8&qid=14812374" +
                        "41&sr=8-4&keywords=coffee+assortment+gift");

        Gift blueToothInner = new Gift("https://images-na.ssl-images-amazon.com/images/I/51kQWdlT5XL._SL1000_.jpg" ,
                "TaoTronics Bluetooth Headphones, Wireless 4.1 Magnetic Earbuds Stereo Earphones," +
                "Secure Fit for Sports with Built-in Mic [Upgraded Version]",
                "https://www.amazon.com/TaoTronics-Bluetooth-Headphones-Wireless-Earphones/dp/B01GNYFT8E/ref=sr_1_1?ie=UTF8&qid=1481236236&sr=8-1&keywords=%22+Secure+" +
                        "Fit+for+Sports+with+Built-in+Mic+%5BUpgraded+Version%5D%22%2C");

        Gift amazonEchoDot = new Gift("https://images-na.ssl-images-amazon.com/images/I/51e6qOUDF8L._SY300_.jpg",
                "All-New Echo Dot (2nd Generation) - White",
                "https://www.amazon.com/All-New-Amazon-Echo-Dot-Add-Alexa-To-Any-Room/dp/B01DFKC2SO");

        Gift bb8Spheer = new Gift("https://images-na.ssl-images-amazon.com/images/I/815hK0bAmEL._SL1500_.jpg",
                "Sphero Star Wars BB-8 App Controlled Robot with Star Wars Force Band",
                "https://www.amazon.com/Sphero-Star-Controlled-Robot-Force/dp/B01KX211LQ/ref=sr_1_2?ie=UTF8&qid=1481235550&sr=8-2&keywords=bb8");

        Gift cheeseCakeCard = new Gift("https://images-na.ssl-images-amazon.com/images/I/51RmNyUjWOL.jpg" ,
                "The Cheesecake Factory Gift Card",
                "https://www.amazon.com/Cheesecake-Factory-Gift-Card-25/dp/B00GRLUG3M/ref=sr_1_1?s=gift-cards&ie=UTF8&qid=1481236328&sr=1-1&keywords=cheesecake+factory+gift+card");

        Gift pfChangCard = new Gift("https://images-na.ssl-images-amazon.com/images/I/91iLx-NzZfL._SL1500_.jpg",
                "P.F. Changs Gift Card",
                "https://www.amazon.com/P-F-Changs-Gift-Card-50/dp/B00BXLVD8I/ref=sr_1_1?s=gift-cards&ie=UTF8&qid=" +
                        "1481236353&sr=1-1&keywords=pf+changs+gift+card");

        Gift boneFishCard = new Gift ("https://images-na.ssl-images-amazon.com/images/I/51VMNIUcAEL.jpg",
                "Bonefish Grill Gift Card",
                "https://www.amazon.com/Bonefish-Grill-Gift-Card-50/dp/B00VGLTW6U/ref=sr_1_1?ie=UTF8&qid=1481237324&sr=8-1&keywords=bonefish+grill+gift+card");

        Gift gamerHeadset = new Gift ("data:image/webp;base64,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" +
                "5nzqmB2838R+vQEJIcr1WQ+CQ8W2voKru2k+LQWAkLml3PyNQd897smaDYT0lcnnAg9Z1lIVUgAAAA",
                "HyperX Cloud Stinger Gaming Headset for PC, Xbox One¹, PS4, Wii U (HX-HSCS-BK/NA)",
                "https://www.amazon.com/gp/product/B01L2ZRYVE/ref=s9_acss_bw_cg_EHD0302B_1c1_w?pf_rd_m=ATVPDKIKX0DER&pf_rd_s=merchandised-search-" +
                        "6&pf_rd_r=7RSR60700EHQ2QXCRE9M&pf_rd_t=101&pf_rd_p=6ffc78a8-1116-4a3d-916d-7a02c929dc3d&pf_rd_i=15469054011");

        Gift moanaSet = new Gift("https://images-na.ssl-images-amazon.com/images/I/91D2iXJCd6L._SL1500_.jpg",
                "Disney Collection Moana Figurine Playset",
                "https://www.amazon.com/Disney-Collection-Moana-Figurine-Playset/dp/B01M5KAG6Q/ref=sr_1_2?s=boost&srs=" +
                        "12034488011&ie=UTF8&qid=1481235594&sr=8-2&keywords=%22Disney+Collection+Moana+Figurine+Playset%22%2C");

        Gift moanaBlanket = new Gift("https://images-na.ssl-images-amazon.com/images/I/91lwegBjmiL._SL1500_.jpg",
                "Disney Moana \'The Wave\' 62\" x 90\" Twin Blanket",
                "https://www.amazon.com/Disney-Moana-Plush-Blanket-62/dp/B01LW3OI2Y/ref=sr_1_5?s=boost&srs=1203448" +
                        "8011&ie=UTF8&qid=1481235758&sr=8-5&keywords=moana+blanket");

        Gift outdoorJacket = new Gift("https://images-na.ssl-images-amazon.com/images/I/81RdSzl42fL._UL1500_.jpg",
                "The North Face Men's Venture Jacket",
                "https://www.amazon.com/North-Face-Venture-Jacket-Black/dp/B00DGF8NUA/ref=sr_1_1?ie=UTF8&qid=1481235933&sr=8" +
                        "-1&keywords=The+North+Face+Men%27s+Venture+Jacket");

        Gift outdoorJacketW = new Gift("https://images-na.ssl-images-amazon.com/images/I/81nTqJxMWFL._SL1500_.jpg",
                "The North Face Women's Venture Jacket",
                "https://www.amazon.com/North-Face-Womens-Venture-Jacket/dp/B00DH3CX5W/ref=sr_1_1?ie=UTF8&qid=148123600" +
                        "6&sr=8-1&keywords=The+North+Face+Woman%27s+Venture+Jacket");

        Gift watchMen = new Gift ("https://images-na.ssl-images-amazon.com/images/I/91vt0ip-%2BAL._UY879_.jpg",
                "Lucien Piccard Men's LP-40025-01 Del Campo Analog Display Japanese Quartz Black Watch",
                "https://www.amazon.com/gp/product/B013JXIJZM/ref=s9_acsd_aas_bw_c_x_1_w?pf_rd_m=ATVPDKIKX0DER&pf_rd_s=merchandised-search-" +
                        "3&pf_rd_r=26XQXMEFZVBNXVHQ9BD8&pf_rd_r=26XQXMEFZVBNXVHQ9BD8&pf_rd_t=101&pf_rd_p=0b437a34-f4bc-406f-b110-" +
                        "a8df870fce27&pf_rd_p=0b437a34-f4bc-406f-b110-a8df870fce27&pf_rd_i=15563170011");

        Gift casioWatchM = new Gift ("https://images-na.ssl-images-amazon.com/images/I/71PXyslIUyL._UX679_.jpg",
                "Casio G-Shock GA100-1A2 Ana-Digi Speed Indicator Black Dial Men's Watch",
                "https://www.amazon.com/Casio-G-Shock-GA100-1A2-Ana-Digi-Indicator/dp/B007V2ZZWS/ref=sr_1_8?s=apparel&ie=UTF8&qid=148124" +
                        "5363&sr=1-8&nodeID=7141123011&keywords=casio+g-shock");

        Gift casioWatchW = new Gift ("https://images-na.ssl-images-amazon.com/images/I/71BLnL1lfvL._UY879_.jpg",
                "Casio Women's BA-111-1ACR Baby-G Analog-Digital Display Quartz Black Watch",
                "https://www.amazon.com/Casio-Womens-BA-111-1ACR-Analog-Digital-Display/dp/B00J6AH1PM/ref=sr_1_2?s=apparel&ie=UTF8&qid=14812454" +
                        "67&sr=1-2&nodeID=7141123011&keywords=casio+g-shock+women");


        Gift speakerBass = new Gift ("https://images-na.ssl-images-amazon.com/images/I/31STZw0kV5L.jpg",
                "Sony SRSXB3/BLK Portable Wireless Speaker with Bluetooth (Black)",
                "https://www.amazon.com/Sony-SRSXB3-BLK-Portable-Bluetooth/dp/B019Q895XE/ref=sr_1_1?ie=UTF8&qid=1481236181&sr=8-1&key" +
                        "words=Sony+SRSXB3%2FBLK+Portable+Wireless+Speaker+with+Bluetooth+%28Black%29");

        Gift campingKnife = new Gift ("https://images-na.ssl-images-amazon.com/images/I/71PEGYL2WpL._SL1500_.jpg",
                "New 6-in-1 Best Survival Knife Ultimate Survival Tool Zombie Survival Kit Tactical Folding Knife Seatbelt " +
                        "Cutter Glass Breaker Fire Starter LED Light Bottle Opener Hunting Camping Rambo Knife",
                "https://www.amazon.com/Survival-Ultimate-Tactical-Folding-Seatbelt/dp/B018RX9KIO/ref=sr_1_1?s=gift-cards&ie=UTF8&qid=1481236385&sr=8-1&keywords=New+6-in-1+Best+Survival+Knife+Ultimate+Survival+Tool+Zombie+Survival+Kit+Tactical+Folding+Knife+Seatbelt+%22+%2" +
                        "B+++++++++++++++++++++++++%22Cutter+Glass+Breaker+Fire+Starter+LED+Light+Bottle+Opener+Hunting+Camping+Rambo+Knife%22%2C");

        Gift movieTickets = new Gift ("https://images-na.ssl-images-amazon.com/images/I/91bQ7OB3qrL._SL1500_.jpg",
                "Regal Entertainment Gift Card",
                "https://www.amazon.com/Regal-Entertainment-Gift-Card-25/dp/B00AS527QW/ref=sr_1_1?s=gift-cards&ie=UTF8&qid=1481236603&sr=1" +
                        "-1&keywords=%22Regal+Entertainment+Gift+Card%22%2C");

        Gift starbucksCard = new Gift ("https://images-na.ssl-images-amazon.com/images/I/516nsy8Rf2L.jpg",
                "Starbucks Gift Card",
                "https://www.amazon.com/Starbucks-Holiday-25-Gift-Card/dp/B00NVUDIZ0/ref=sr_1_1?s=gift-cards&ie=" +
                        "UTF8&qid=1481236565&sr=1-1&keywords=starbucks+gift+card");

        Gift tacoBellCard = new Gift ("https://images-na.ssl-images-amazon.com/images/I/417Hr78EBVL.jpg",
                "Taco Bell Gift Card",
                "https://www.amazon.com/Taco-Bell-Gift-Card-25/dp/B015WZDBPS/ref=sr_1_1?s=gift-cards&ie=UTF8&qid=1481236531&sr=1-" +
                        "1&keywords=taco+bell+gift+card");

        Gift burgerKindCard = new Gift ("https://images-na.ssl-images-amazon.com/images/I/71EXhd%2BUxOL._SL1500_.jpg",
                "Burger King Gift Card",
                "https://www.amazon.com/Burger-King-25/dp/B00F2RZPOM/ref=sr_1_1?s=gift-cards&ie=UTF8&qid=1481236508&sr=1-1&keywords=burger+king+gift+card");

        Gift subwayGiftCard = new Gift ("https://images-na.ssl-images-amazon.com/images/I/81fzr22XyOL._SL1500_.jpg",
                "SUBWAY Gift Card",
                "https://www.amazon.com/SUBWAY-Gift-Card-25/dp/B00CIECDEM/ref=sr_1_1?s=gift-cards&ie=UTF8&qid=1481236482&sr=1-1&keywords=subway+gift+card");

        Gift kindleSet = new Gift ("https://images-na.ssl-images-amazon.com/images/I/91a7qlSdjTL._SL1500_.jpg",
                "Kindle Paperwhite E-reader - Black, 6\" High-Resolution Display (300 ppi) with Built-in Light, Wi-Fi - Includes Special Offers",
                "https://www.amazon.com/dp/B017HPZWDA/ref=fs_ods_fs_eink_MTE");

        Gift paneraCard = new Gift ("https://images-na.ssl-images-amazon.com/images/I/818%2B%2BmRB-ZL._SL1500_.jpg",
                "Panera Bread Gift Card",
                "https://www.amazon.com/Panera-Bread-Gift-Card-25/dp/B00GOLGWVK/ref=sr_1_1?s=fiona-hardware&ie=UTF8&qid=" +
                        "1481236456&sr=8-1&keywords=panera+gift+card");

        Gift womensWatch = new Gift ("https://images-na.ssl-images-amazon.com/images/I/412Xe9-8H6L._SY220_.jpg",
                "Anne Klein Women's AK/2245RTST Swarovski Crystal Accented Rose Gold-Tone and Silver-Tone Bangle Watch and Bracelet Set",
                "https://www.amazon.com/Anne-Klein-AK-2245RTST-Silver-Tone/dp/B0193XJZ1Y/ref=s9_simh_gw_g241_i1_r?_encoding=UTF8&fpl=fresh&pf_rd_m=ATVPDKIKX0DER&pf" +
                        "_rd_s=&pf_rd_r=B27X46TZ92T0BVJJ0B1Z&pf_rd_t=36701&pf_rd_p=f58829ef-ff4e-4868-b5c8-fe8c3bd9f769&pf_rd_i=desktop");

        Gift phoneCharger = new Gift ("https://images-na.ssl-images-amazon.com/images/I/31ILZlloV8L.jpg",
                "Anker PowerCore+ mini, 3350mAh Lipstick-Sized Portable Charger (3rd Generation, Premium Aluminum Power Bank), One of the Most Compact External Batteries",
                "https://www.amazon.com/Anker-PowerCore-Lipstick-Sized-Generation-Batteries/dp/B005X1Y7I2/ref=sr_1_3?ie=UTF8&qid=1481246982&sr=" +
                        "8-3&keywords=portable+phone+charger");

        Gift mixer = new Gift ("https://images-na.ssl-images-amazon.com/images/I/81UknzEqmhL._SL1500_.jpg",
                "KitchenAid KSM150PSER Artisan Tilt-Head Stand Mixer with Pouring Shield, 5-Quart, Empire Red",
                "https://www.amazon.com/KitchenAid-KSM150PSER-Artisan-Tilt-Head-Pouring/dp/B00005UP2P/ref=sr_1_1?s=kitchen&ie=UTF8&qid=1481235229&sr=1-1&keywords=mixer");

        Gift todlerTakeAlong = new Gift ("https://images-na.ssl-images-amazon.com/images/I/41szCbN2t5L.jpg",
                "Baby Einstein Take Along Tunes Musical Toy",
                "https://www.amazon.com/Baby-Einstein-Along-Tunes-Musical/dp/B000YDDF6O/ref=sr_1_1_a_it?ie=UTF8&qid=1481234336&sr=8-1&keywords=baby%2Bgift%2Btoddler&th=1");

        //these are the gifts for babies
        Gift babyBullet = new Gift ("https://images-na.ssl-images-amazon.com/images/I/814ykZ%2BVs5L._SL1500_.jpg",
                "Magic Bullet Baby Bullet Baby Care System",
                "https://www.amazon.com/Magic-Bullet-Baby-Care-System/dp/B004V5BTUA/ref=sr_1_1?ie=UTF8&qid=1481235305&sr=8-1&keywords=baby+bullet");

        Gift babyDiningSet = new Gift ("https://images-na.ssl-images-amazon.com/images/I/71JH4pj3fML._SX522_.jpg",
                "Rainbow Gift Set Orange. Baby Shower, Baby Registry, Home Set & more. Baby Girl, Baby Boy, Unisex. Baby Bowl Set + Baby Plate Set",
                "https://www.amazon.com/Rainbow-Registry-Unisex-Assorted-Approved/dp/B01HR6CPWU/ref=sr_1_2?ie=UTF8&qid=1481235370&sr=8-2-spons&keywords=baby%2Bgift%2Bbowl&th=1");

        Gift babyBoyPlaySet = new Gift ("https://images-na.ssl-images-amazon.com/images/I/71U%2BSGw6QfL._SL1500_.jpg",
                "Gund My First Sports Bag Playset",
                "https://www.amazon.com/Gund-First-Sports-Bag-Playset/dp/B00P1PTMXA/ref=sr_1_2?s=kitchen&ie=UTF8&qid=1481233691&sr=8-2&keywords=baby+boy+gift");

        Gift babyGirlHeadBand = new Gift ("https://images-na.ssl-images-amazon.com/images/I/51vWXt85Y0L._SX38_SY50_CR,0,0,38,50_.jpg",
                "ROEWELL® Baby's Headbands Girl's Cute Hair Bows Hair bands Newborn headband",
                "https://www.amazon.com/Quest-Sweet-Multicolor-Hoops-Headbands/dp/B01CGC4UHI/ref=pd_lpo_193_bs_img_2?_encoding=UTF8&refRID=DFSFFJ729Q9QS1F5Q1WF");

        Gift babyToy = new Gift ("https://images-na.ssl-images-amazon.com/images/I/5187Np-hSXL.jpg",
                "VTech Baby Lil' Critters Moosical Beads",
                "https://www.amazon.com/VTech-Baby-Critters-Moosical-Beads/dp/B00TH0NMUY/ref=sr_1_4?ie=UTF8&qid=1481233872&sr=8-4&keywords=baby+girl+gift");

        //this is the end of the list of baby gifts


        //the first decision is if the person an adult
        //all people will be offere amazon echo dot



        if(isAdult) {
            if (burgers) {
                giftsList.add(burgerKindCard);
                giftsList.add(subwayGiftCard);
                giftsList.add(tacoBellCard);
            }

            if (fine) {
                giftsList.add(pfChangCard);
                giftsList.add(cheeseCakeCard);
                giftsList.add(boneFishCard);
            }

            if (coffee) {
                giftsList.add(coffeeSet);
                giftsList.add(starbucksCard);
            }

            if (tea) {
                giftsList.add(teaSet);
                giftsList.add(starbucksCard);
            }

            if(collar){
                if(hasYChromosome){
                    giftsList.add(watchMen);
                }

                if(!hasYChromosome){
                    giftsList.add(womensWatch);
                }

            }

            if(!collar){
                if(hasYChromosome){
                    giftsList.add(casioWatchM);
                }

                if(!hasYChromosome){
                    giftsList.add(casioWatchW);
                }
            }

            if(outdoors){
                if(hasYChromosome){
                    giftsList.add(outdoorJacket);
                    giftsList.add(campingKnife);
                }


                if(!hasYChromosome){
                    giftsList.add(outdoorJacketW);
                    giftsList.add(kindleSet);
                }

            }

            if(!outdoors){
                giftsList.add(amazonEchoDot);
                giftsList.add(blueToothInner);
                giftsList.add(speakerBass);
                giftsList.add(paneraCard);


            }

            if(hasYChromosome){
                giftsList.add(movieTickets);
            }

            if(!hasYChromosome){
                giftsList.add(mixer);
            }

        }



        //as the app gets more developed, this will be added
        if(isSixties){
            if(hasYChromosome){

            }

            if(!hasYChromosome){

            }


        }

        //as the app gets more developed, this will be added
        if(isFifties){
            if(hasYChromosome){

            }

            if(!hasYChromosome){

            }

        }

        //as the app gets more developed, this will be added
        if(isForties){
            if(hasYChromosome){

            }

            if(!hasYChromosome){

            }

        }

        //as the app gets more developed, this will be added
        if(isThirties){
            if(hasYChromosome){

            }

            if(!hasYChromosome){

            }

        }

        //as the app gets more developed, this will be added
        if(isTwenties){
            if(hasYChromosome){

            }

            if(!hasYChromosome){

            }


        }


        //as the app gets more developed, this will be added
        if(isCollege){
            if(hasYChromosome){
                giftsList.add(gamerHeadset);

            }

            if(!hasYChromosome){
                giftsList.add(phoneCharger);

            }

        }



        if(isTeenager){
            if(hasYChromosome){

            }

            if(!hasYChromosome){

            }

        }


        if(isPreTeen){
            if(hasYChromosome){

            }

            if(!hasYChromosome){

            }
        }



        if(isChild){
            if(hasYChromosome){
                giftsList.add(moanaSet);

            }

            if(!hasYChromosome){
                giftsList.add(moanaBlanket);
            }

        }



        if(isYoungChild){
            if(hasYChromosome){
                giftsList.add(moanaSet);
            }

            if(!hasYChromosome){
                giftsList.add(moanaBlanket);
            }

        }


        if(isTodler){
            giftsList.clear();

            giftsList.add(todlerTakeAlong);

            if(hasYChromosome){

            }

            if(!hasYChromosome){
                giftsList.add(moanaBlanket);
            }


        }


        if(isBaby){
            giftsList.clear();

            giftsList.add(babyBullet);
            giftsList.add(babyDiningSet);
            giftsList.add(babyToy);

            if(hasYChromosome){
                giftsList.add(babyBoyPlaySet);

            }

            if(!hasYChromosome){
                giftsList.add(babyGirlHeadBand);
            }


        }




    }




}
