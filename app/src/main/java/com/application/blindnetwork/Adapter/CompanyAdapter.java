package com.application.blindnetwork.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.application.blindnetwork.R;
import com.application.blindnetwork.model.Company;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CompanyAdapter extends RecyclerView.Adapter {
    public CompanyAdapter(Context context, List<Company> mCompanies, boolean b) {
    }

    @NonNull
    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public CircleImageView imageProfile;
        public TextView company_name;
        public View rate;
        public Button btnFollow;

        public ViewHolder(@NonNull View itemView){
            super(itemView);

            imageProfile = itemView.findViewById(R.id.image_profile_company);
            company_name = itemView.findViewById(R.id.company_name);
            rate = itemView.findViewById(R.id.danh_gia);
            btnFollow = itemView.findViewById(R.id.btn_follow);
        }
    }
}
