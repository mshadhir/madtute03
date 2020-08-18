package com.example.madtute03;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MultiplyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MultiplyFragment extends Fragment {
    TextView t1;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MultiplyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MultiplyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MultiplyFragment newInstance(String param1, String param2) {
        MultiplyFragment fragment = new MultiplyFragment();
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
        View v = inflater.inflate(R.layout.fragment_plus, container, false);

        t1 = v.findViewById(R.id.PlustExt);
        Bundle b3=getArguments();
        String Number1=b3.getString("Number1");
        String Number2=b3.getString("Number2");
        int num1,num2,tot;
        num1=Integer.parseInt(Number1);
        num2=Integer.parseInt(Number2);
        tot=num1*num2;
        String total;
        total=Integer.toString(tot);
        t1.setText(Number1 + " * "+ Number2 + " = " + total);

        return v;
    }
}