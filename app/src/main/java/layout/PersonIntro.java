package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.geogehigbie.giftbug.MainActivity;
import com.geogehigbie.giftbug.R;


public class PersonIntro extends Fragment {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    private static boolean english;

    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        english = MainActivity.isEnglish();
        view = inflater.inflate(R.layout.fragment_person_intro, container, false);

        loadFirstQuestionPage();

        // Inflate the layout for this fragment
        return view;
    }

    public void loadFirstQuestionPage(){
        Button nextOne = (Button) view.findViewById(R.id.next_one);
        nextOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                loadFragment();
            }
        });
    }

    public void loadFragment(){
        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new ManWomanBoyGirl());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }



}
