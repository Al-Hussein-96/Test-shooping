package com.alhussein.task;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alhussein.task.adapter.CategoryAdapter1;
import com.alhussein.task.adapter.ProductAdapter;
import com.alhussein.task.adapter.ProfileAdapter;
import com.alhussein.task.data.Category1;
import com.alhussein.task.data.Product1;
import com.alhussein.task.data.Profile1;
import com.alhussein.task.databinding.FragmentMainBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {
    FragmentMainBinding binding;

    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        CategoryAdapter1 categoryAdapter1 = new CategoryAdapter1();
        ProductAdapter productAdapter = new ProductAdapter();
        ProfileAdapter profileAdapter = new ProfileAdapter();

        List<Category1> category1List = new ArrayList<>();
        List<Product1> product1List = new ArrayList<>();
        List<Profile1> profile1List = new ArrayList<>();

        category1List.add(new Category1(1, "test"));
        category1List.add(new Category1(2, "test2"));
        category1List.add(new Category1(4, "test2"));
        category1List.add(new Category1(5, "test2"));
        category1List.add(new Category1(6, "test2"));
        category1List.add(new Category1(3, "test3"));


        profile1List.add(new Profile1(1, "test"));
        profile1List.add(new Profile1(2, "test2"));
        profile1List.add(new Profile1(3, "test3"));
        profile1List.add(new Profile1(4, "test3"));
        profile1List.add(new Profile1(5, "test3"));
        profile1List.add(new Profile1(6, "test3"));

        binding.recycleViewCategory.setAdapter(categoryAdapter1);
        categoryAdapter1.setData(category1List);

        binding.recycleViewProfiles.setAdapter(profileAdapter);
        profileAdapter.setData(profile1List);


        product1List.add(new Product1());
        product1List.add(new Product1());
        product1List.add(new Product1());
        product1List.add(new Product1());
        product1List.add(new Product1());

        binding.subcategorySection.recycleViewProduct.setAdapter(productAdapter);
        productAdapter.setData(product1List);


    }
}