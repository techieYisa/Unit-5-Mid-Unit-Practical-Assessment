package nyc.c4q.unit5mid_unitpracticalassessment.controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.unit5mid_unitpracticalassessment.R;
import nyc.c4q.unit5mid_unitpracticalassessment.model.ResultsModel;
import nyc.c4q.unit5mid_unitpracticalassessment.views.ModelViewHolder;

/**
 * Created by c4q on 1/24/18.
 */

public class ModelAdapter extends RecyclerView.Adapter<ModelViewHolder> {
    List<ResultsModel> resultsList;
    View.OnClickListener rvClick;
    Context context;

    public ModelAdapter(List<ResultsModel> resultsList, View.OnClickListener rvClick, Context context) {
        this.resultsList = resultsList;
        this.rvClick = rvClick;
        this.context = context;
    }

    @Override
    public ModelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.model_item_view, parent, false);

        return new ModelViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(ModelViewHolder holder, int position) {
        ResultsModel results = resultsList.get(position);
        holder.onBind(results, context);
        holder.itemView.setTag(results.getEmail());
        holder.itemView.setOnClickListener(rvClick);


    }

    @Override
    public int getItemCount() {
        return resultsList.size();
    }
}
