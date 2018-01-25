package nyc.c4q.unit5mid_unitpracticalassessment.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nyc.c4q.unit5mid_unitpracticalassessment.R;
import nyc.c4q.unit5mid_unitpracticalassessment.controller.ModelAdapter;
import nyc.c4q.unit5mid_unitpracticalassessment.model.ResultsModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {
    View rootView;
    String baseURL = "https://randomuser.me";
    RecyclerView recyclerView;
    Context context;
    List<ResultsModel> resultsList;
    View.OnClickListener rvClick;
    ModelAdapter modelAdapter;
    GridLayoutManager layoutManager;
    Map<String, String> queries = new HashMap<>();


    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_list, container, false);
        setRecyclerView();
        return rootView;
    }

    public void setRecyclerView(){
        recyclerView = rootView.findViewById(R.id.model_recycler_view);

    }

}
