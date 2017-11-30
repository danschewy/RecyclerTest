package hkucs.recycletest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView
        .Adapter<MyRecyclerViewAdapter
        .DataObjectHolder>{
    private ArrayList<String> mDataset;

    public static class DataObjectHolder extends RecyclerView.ViewHolder{

        TextView fruit;

        public DataObjectHolder(View itemView) {
            super(itemView);
            fruit = (TextView) itemView.findViewById(R.id.fruit_text);
        }
    }

    public MyRecyclerViewAdapter(ArrayList<String> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent,
                                               int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fruit_view, parent, false);

        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int position) {
        holder.fruit.setText(mDataset.get(position));
    }

    @Override
    public int getItemCount() {
        return (null != mDataset ? mDataset.size() : 0);
    }
}
