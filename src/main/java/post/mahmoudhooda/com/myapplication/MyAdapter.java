package post.mahmoudhooda.com.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MAHMOUD-HOODA on 30/07/2019.
 */


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    ArrayList<Card> data= new ArrayList<Card>();
    Context context;
    public MyAdapter( ArrayList<Card> data, Context context) {
        this.data = data;
        this.context = context;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row1,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        myViewHolder.name.setText((CharSequence) data.get(i));
    }



    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name;


        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.name);
        }
    }
}
