package post.mahmoudhooda.com.myapplication;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;


import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rel1);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        ArrayList<Card> data = new ArrayList<Card>();
        data.add(new Card("m1", R.drawable.m1));
        data.add(new Card("m2", R.drawable.m2));
        data.add(new Card("m3", R.drawable.m3));
        data.add(new Card("m4", R.drawable.m4));
        data.add(new Card("m5", R.drawable.m5));
        data.add(new Card("m6", R.drawable.m6));
        data.add(new Card("m7", R.drawable.m7));
        data.add(new Card("m8", R.drawable.m8));
        MyAdapter adapter = new MyAdapter(this, data);
        recyclerView.setAdapter(adapter);
    }

}
class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder>{

        Context context;
       ArrayList<Card> data = new ArrayList<Card>();

       public MyAdapter(Context context, ArrayList<Card> data) {
           this.context = context;
           this.data = data;
       }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row1,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.imageView.setImageResource(data.get(position).image);
        holder.name.setText(data.get(position).name);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class Holder extends RecyclerView.ViewHolder{
            CardView card;
            ImageView imageView;
            TextView name;
        public Holder(View itemView) {
            super(itemView);
            card = (CardView)itemView.findViewById(R.id.card1);
            name = (TextView) itemView.findViewById(R.id.name);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context,name.getText(),Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
   }

