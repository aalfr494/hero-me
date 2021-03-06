package com.example.alex.herome.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alex.herome.Activities.MainActivity;
import com.example.alex.herome.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BackstoryFragment.BackstoryInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BackstoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BackstoryFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private TextView superHeroNameField;
    private String superHeroNameString;
    private EditText backstoryField;
    private String backstoryString;

    private Button primaryPowerBtn;
    private String primaryPowerString;
    private Button secondaryPowerBtn;
    private String secondaryPowerString;
    private Button startOverBtn;

    private int primaryImage;
    private int secondaryImage;


    private BackstoryInteractionListener mListener;

    public BackstoryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BackstoryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BackstoryFragment newInstance(String param1, String param2) {
        BackstoryFragment fragment = new BackstoryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_backstory, container, false);

        MainActivity mainActivity = (MainActivity)getActivity();

        superHeroNameField = (TextView)view.findViewById(R.id.heroNameTxt);

        superHeroNameString = mainActivity.HERO_NAME;

        superHeroNameField.setText(superHeroNameString);



        backstoryField = (EditText)view.findViewById(R.id.backstoryTxt);

        backstoryString = mainActivity.POWER_ORIGIN;

        backstoryField.setText(backstoryString);

        primaryPowerBtn = (Button)view.findViewById(R.id.primaryPowerBtn);
        primaryPowerString = mainActivity.ACTUAL_POWER;
        primaryPowerBtn.setText(primaryPowerString);

        secondaryPowerBtn = (Button)view.findViewById(R.id.secondaryPowerBtn);
        secondaryPowerString = mainActivity.SECONDARY_POWER;
        secondaryPowerBtn.setText(secondaryPowerString);

        primaryImage = mainActivity.PRIMARY_POWER_IMG;

        primaryPowerBtn.setCompoundDrawablesWithIntrinsicBounds(primaryImage,0,0,0);

        secondaryImage = mainActivity.SECONDARY_POWER_IMG;

        secondaryPowerBtn.setCompoundDrawablesWithIntrinsicBounds(secondaryImage,0,0,0);

        startOverBtn = (Button)view.findViewById(R.id.startOverBtn);

        startOverBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity)getActivity();
                mainActivity.loadMainScreen();


            }
        });


        return view;
    }

    @Override
    public void onClick (View v){

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onBackstoryFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof BackstoryInteractionListener) {
            mListener = (BackstoryInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface BackstoryInteractionListener {
        // TODO: Update argument type and name
        void onBackstoryFragmentInteraction(Uri uri);
    }
}
