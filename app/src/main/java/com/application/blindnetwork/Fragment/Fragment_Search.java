package com.application.blindnetwork.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.application.blindnetwork.Adapter.CompanyAdapter;
import com.application.blindnetwork.R;
import com.application.blindnetwork.model.Company;
import com.hendraanggrian.appcompat.widget.SocialAutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Search extends Fragment {

    private RecyclerView recyclerView;
    private SocialAutoCompleteTextView search_bar;
    private List<Company> mCompanies;
    private CompanyAdapter companyAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_search,container, false);

        recyclerView = view.findViewById(R.id.recycle_view_company);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        mCompanies = new ArrayList<>();
        companyAdapter = new CompanyAdapter(getContext(), mCompanies, true);
        recyclerView.setAdapter(companyAdapter);

        search_bar = view.findViewById(R.id.search_bar);

        return view;
    }
}