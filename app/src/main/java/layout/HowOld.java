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


    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        changeText();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_how_old, container, false);
    }


    public void changeText(){

        String person = ManWomanBoyGirl.getPersonLower();
        String question = "How old is " + person;

        TextView textHowOld = (TextView) getActivity().findViewById(R.id.how_old_text);
        textHowOld.setText(question);
    }

    public void addClickLister(){

        Button nextButton = (Button) getActivity().findViewById(R.id.next2);
        nextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
    }



}
