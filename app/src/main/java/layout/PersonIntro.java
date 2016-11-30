package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.geogehigbie.giftbug.R;



public class PersonIntro extends Fragment {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        loadFirstQuestionPage();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_person_intro, container, false);
    }

    public void loadFirstQuestionPage(){
        Button next1 = (Button) getActivity().findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                fragmentInitialize();
            }
        });
    }

    public void fragmentInitialize(){
        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, new ManWomanBoyGirl());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }



}
