package nyc.c4q.unit5mid_unitpracticalassessment.views;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import nyc.c4q.unit5mid_unitpracticalassessment.R;
import nyc.c4q.unit5mid_unitpracticalassessment.model.ResultsModel;

/**
 * Created by c4q on 1/24/18.
 */

public class ModelViewHolder extends RecyclerView.ViewHolder{
    public TextView user;
    public ImageView userPic;

    public ModelViewHolder(View itemView){
        super(itemView);

        user = (TextView) itemView.findViewById(R.id.user_textview);
        userPic = (ImageView) itemView.findViewById(R.id.user_imageview);
    }

    public void onBind(ResultsModel results, Context context){
        //user.setText(results.get);
        Picasso.with(context)
                .load(ResultsModel.getPicture().getThumbnail())
                .resize(500, 500)
                .centerInside()
                .into(userPic);

    }

}
