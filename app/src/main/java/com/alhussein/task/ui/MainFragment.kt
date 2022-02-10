package com.alhussein.task.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alhussein.task.adapter.CategoryAdapter
import com.alhussein.task.adapter.ProductAdapter
import com.alhussein.task.adapter.ProfileAdapter
import com.alhussein.task.data.Category
import com.alhussein.task.data.Product
import com.alhussein.task.data.Profile
import com.alhussein.task.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)

        return binding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = CategoryAdapter()

        binding.recycleViewCategory.adapter = adapter


        val data = mutableListOf<Category>()
        data.add(Category(1, "Main Category 1"))
        data.add(Category(2, "Main Category 2"))
        data.add(Category(3, "Main Category 3"))
        data.add(Category(4, "Main Category 4"))

        adapter.data = data

        val profileAdapter = ProfileAdapter()

        binding.recycleViewProfiles.adapter = profileAdapter


        val data_profiles = mutableListOf<Profile>()
        data_profiles.add(Profile(1, "@user1"))
        data_profiles.add(Profile(2, "@user2"))
        data_profiles.add(Profile(3, "@user3"))
        data_profiles.add(Profile(4, "@user4"))
        data_profiles.add(Profile(5, "@user5"))
        data_profiles.add(Profile(6, "@user6"))

        profileAdapter.data = data_profiles


        val productAdapter = ProductAdapter()

        binding.subcategorySection.recycleViewProduct.adapter = productAdapter


        val data_products = mutableListOf<Product>()
        data_products.add(Product(1))
        data_products.add(Product(2))
        data_products.add(Product(3))
        data_products.add(Product(4,))
        data_products.add(Product(5))
        data_products.add(Product(6))

        productAdapter.data = data_products


    }

    companion object {

        @JvmStatic
        fun newInstance() =
            MainFragment()
    }
}