package com.mobile.lapdv.demomvp.screen.home.view;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mobile.lapdv.demomvp.R;
import com.mobile.lapdv.demomvp.screen.home.model.Student;

import java.util.ArrayList;

/**
 * Created by lap on 26/04/2018.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {

    private ArrayList<Student> mStudentArrayList;

    public StudentAdapter(ArrayList<Student> mStudentArrayList) {
        this.mStudentArrayList = mStudentArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_student, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (holder != null) {
            holder.tvName.setText(!TextUtils.isEmpty(mStudentArrayList.get(position).getName()) ?
                    mStudentArrayList.get(position).getName() : "");
            holder.tvAddress.setText(!TextUtils.isEmpty(mStudentArrayList.get(position).getAddress()) ?
                    mStudentArrayList.get(position).getAddress() : "");
        }
    }

    @Override
    public int getItemCount() {
        return mStudentArrayList != null && mStudentArrayList.size() != 0 ? mStudentArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvName, tvAddress;

        public ViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvAddress = itemView.findViewById(R.id.tv_address);
        }
    }
}
