package com.example.alex.herome.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.alex.herome.Activities.MainActivity;
import com.example.alex.herome.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PickPowerFragment.PickPowerInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PickPowerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PickPowerFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button turtlePowerBtn;
    private Button lightningPowerBtn;
    private Button flightPowerBtn;
    private Button webPowerBtn;
    private Button laserPowerBtn;
    private Button strengthPowerBtn;

    private Button backstoryBtn;


    private PickPowerInteractionListener mListener;

    public PickPowerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PickPowerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PickPowerFragment newInstance(String param1, String param2) {
        PickPowerFragment fragment = new PickPowerFragment();
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

        View view = inflater.inflate(R.layout.fragment_pick_power, container, false);

        turtlePowerBtn = (Button)view.findViewById(R.id.turtlePowerBtn);
        lightningPowerBtn = (Button)view.findViewById(R.id.lightningPowerBtn);
        flightPowerBtn = (Button)view.findViewById(R.id.flightPowerBtn);
        webPowerBtn = (Button)view.findViewById(R.id.webPowerBtn);
        laserPowerBtn = (Button)view.findViewById(R.id.laserPowerBtn);
        strengthPowerBtn = (Button)view.findViewById(R.id.strengthPowerBtn);
        backstoryBtn = (Button)view.findViewById(R.id.backstoryBtn);

        // set listeners for buttons

        turtlePowerBtn.setOnClickListener(this);
        lightningPowerBtn.setOnClickListener(this);
        flightPowerBtn.setOnClickListener(this);
        webPowerBtn.setOnClickListener(this);
        laserPowerBtn.setOnClickListener(this);
        strengthPowerBtn.setOnClickListener(this);


        backstoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity)getActivity();
                mainActivity.loadBackStoryScreen();


            }
        });


        backstoryBtn.setEnabled(false);
        backstoryBtn.getBackground().setAlpha(128);

        // disable back story button initially

        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onClick (View v){
        backstoryBtn.setEnabled(true);
        backstoryBtn.getBackground().setAlpha(255);

        Button btn = (Button)v;

        MainActivity mainActivity = (MainActivity)getActivity();
        int leftDrawable = 0;

        if (btn == turtlePowerBtn) {
            leftDrawable = R.drawable.turtle_power;


            mainActivity.POWER_SELECTED = "Powers of the turtle";
            mainActivity.ACTUAL_POWER = "TURTLE POWER";
            mainActivity.SECONDARY_POWER = "FLIGHT";
            mainActivity.HERO_NAME = "ShellShock";
            mainActivity.HERO_IMG = R.drawable.turtle_power;
            mainActivity.PRIMARY_POWER_IMG = R.drawable.turtle_power;
            mainActivity.SECONDARY_POWER_IMG = R.drawable.super_man_crest;


            lightningPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.thors_hammer,0,0,0);
            flightPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.super_man_crest,0,0,0);
            webPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.spiderweb,0,0,0);
            laserPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.laser_vision,0,0,0);
            strengthPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.super_strength,0,0,0);


        } else if (btn == lightningPowerBtn) {
            leftDrawable = R.drawable.thors_hammer;

            mainActivity.POWER_SELECTED = "Powers of the lightning";
            mainActivity.ACTUAL_POWER = "LIGHTNING";
            mainActivity.SECONDARY_POWER = "SUPER STRENGTH";
            mainActivity.HERO_NAME = "Static Shock";
            mainActivity.HERO_IMG = R.drawable.lightning;
            mainActivity.PRIMARY_POWER_IMG = R.drawable.thors_hammer;
            mainActivity.SECONDARY_POWER_IMG = R.drawable.super_strength;

            turtlePowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.turtle_power,0,0,0);
            flightPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.super_man_crest,0,0,0);
            webPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.spiderweb,0,0,0);
            laserPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.laser_vision,0,0,0);
            strengthPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.super_strength,0,0,0);


        }else if (btn == flightPowerBtn) {
            leftDrawable = R.drawable.super_man_crest;

            mainActivity.POWER_SELECTED = "You can fly";
            mainActivity.ACTUAL_POWER = "FLIGHT";
            mainActivity.SECONDARY_POWER = "LASER VISION";
            mainActivity.HERO_NAME = "Destructo";
            mainActivity.HERO_IMG = R.drawable.big_superman_logo;
            mainActivity.PRIMARY_POWER_IMG = R.drawable.super_man_crest;
            mainActivity.SECONDARY_POWER_IMG = R.drawable.laser_vision;

            turtlePowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.turtle_power,0,0,0);
            lightningPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.thors_hammer,0,0,0);
            webPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.spiderweb,0,0,0);
            laserPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.laser_vision,0,0,0);
            strengthPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.super_strength,0,0,0);


        }else if (btn == webPowerBtn) {
            leftDrawable = R.drawable.spiderweb;

            mainActivity.POWER_SELECTED = "Sticky spider webs ";
            mainActivity.ACTUAL_POWER = "WEB SLINGING";
            mainActivity.SECONDARY_POWER = "TURTLE POWER";
            mainActivity.HERO_NAME = "Arachno";
            mainActivity.HERO_IMG = R.drawable.spider_web;
            mainActivity.PRIMARY_POWER_IMG = R.drawable.spider_web;
            mainActivity.SECONDARY_POWER_IMG = R.drawable.turtle_power;

            turtlePowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.turtle_power,0,0,0);
            lightningPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.thors_hammer,0,0,0);
            flightPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.super_man_crest,0,0,0);
            laserPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.laser_vision,0,0,0);
            strengthPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.super_strength,0,0,0);


        } else if (btn == laserPowerBtn) {
            leftDrawable = R.drawable.laser_vision;

            mainActivity.POWER_SELECTED = "Think Cyclops ";
            mainActivity.ACTUAL_POWER = "LASER VISION";
            mainActivity.SECONDARY_POWER = "LIGHTNING";
            mainActivity.HERO_NAME = "Firefly";
            mainActivity.HERO_IMG = R.drawable.laser_vision;
            mainActivity.PRIMARY_POWER_IMG = R.drawable.laser_vision;
            mainActivity.SECONDARY_POWER_IMG = R.drawable.thors_hammer;

            turtlePowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.turtle_power,0,0,0);
            lightningPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.thors_hammer,0,0,0);
            flightPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.super_man_crest,0,0,0);
            webPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.spiderweb,0,0,0);
            strengthPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.super_strength,0,0,0);


        } else if (btn == strengthPowerBtn) {
            leftDrawable = R.drawable.super_strength;

            mainActivity.POWER_SELECTED = "Strength of 10 men";
            mainActivity.ACTUAL_POWER = "SUPER STRENGTH";
            mainActivity.SECONDARY_POWER = "WEB SLINGING";
            mainActivity.HERO_NAME = "SpiderGuy";
            mainActivity.HERO_IMG = R.drawable.super_strength;
            mainActivity.PRIMARY_POWER_IMG = R.drawable.super_strength;

            turtlePowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.turtle_power,0,0,0);
            lightningPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.thors_hammer,0,0,0);
            flightPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.super_man_crest,0,0,0);
            webPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.spiderweb,0,0,0);
            laserPowerBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.laser_vision,0,0,0);
        }

        // sets drawable for button thats clicked
        // gets 3 arguments top, left, RIGHT (which we wanna set) and bottom
        btn.setCompoundDrawablesWithIntrinsicBounds(leftDrawable,0,R.drawable.item_selected,0);

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onPickPowerFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof PickPowerInteractionListener) {
            mListener = (PickPowerInteractionListener) context;
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
    public interface PickPowerInteractionListener {
        // TODO: Update argument type and name
        void onPickPowerFragmentInteraction(Uri uri);
    }
}
