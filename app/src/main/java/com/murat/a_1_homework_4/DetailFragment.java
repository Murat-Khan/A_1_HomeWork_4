package com.murat.a_1_homework_4;

import static com.murat.a_1_homework_4.ContinentsFragment.KEY_FOR_BUNDLE;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.murat.a_1_homework_4.databinding.FragmentDetailBinding;

import java.util.ArrayList;


public class DetailFragment extends Fragment implements Listener {

    private FragmentDetailBinding binding;
    private CountryAdapter countryAdapter ;
    private  ArrayList<Country> countryList = new ArrayList<>();





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentDetailBinding.inflate(inflater,container,false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String continent = getArguments().getString(KEY_FOR_BUNDLE);
        binding.title.setText(continent);
        loadData(continent);
    }
    public void init(){}

    public void loadData(String continent){

        if ("Australia".equals(continent)) {
            countryList.add(new Country("Australia", "Канберра", R.drawable.ustralia_svg));
            countryList.add(new Country("Tonga", "Nukualofa", R.drawable.tonga_svg));
            countryList.add(new Country("Vanuatu"," Port Vila",R.drawable.vanuatu_svg));
            countryList.add(new Country(" Fiji","Suva",R.drawable.fiji_svg));
            countryList.add(new Country("Belau"," Ngerulmud",R.drawable.palau_svg));
            countryList.add(new Country(" Niue","Alofi",R.drawable.niue_svg));
        }
        else if ("Eurasia".equals(continent)){
            countryList.add(new Country("China","Pekin",R.drawable.china_svg));
            countryList.add(new Country("Japan","Tokio",R.drawable.japan_svg));
            countryList.add(new Country("Turkey","Ankara",R.drawable.turkey_svg));
            countryList.add(new Country("Germany","Berlin",R.drawable.germany_svg));
            countryList.add(new Country("Iran","Tehran",R.drawable.iran_svg));
        }
        else if ("North America".equals(continent)){
            countryList.add(new Country("Canada","Ottawa",R.drawable.canada_svg));
            countryList.add(new Country("Cuba","Habana",R.drawable.cuba_svg));
            countryList.add(new Country("Jamaica","Kinston",R.drawable.jamaica_svg));
            countryList.add(new Country(" Guatemala","Guatemala",R.drawable.guatemala_svg));
            countryList.add(new Country("Barbados","Bridgetown",R.drawable.barbados_svg));
        }
        else if ("South America".equals(continent)){
            countryList.add(new Country("Brasil","Brasilia",R.drawable.brazil_svg));
            countryList.add(new Country("Argentina","Buenos Aires",R.drawable.argentina_svg));
            countryList.add(new Country("Venezuela","Caracas",R.drawable.venezuela_svg));
            countryList.add(new Country("Colombia", "Bogota",R.drawable.colombia_svg));
            countryList.add(new Country("","Montevideo",R.drawable.uruguay_svg));
        }
        else if ("Africa".equals(continent)){
            countryList.add(new Country("Congo","Brazzaville",R.drawable.congo_svg));
            countryList.add(new Country("Kingdom of Lesotho","Maseru",R.drawable.lesotho_svg));
            countryList.add(new Country("Sudan","الخرطوم",R.drawable.sudan_svg));
            countryList.add(new Country("Mauritania","Nouakchott",R.drawable.mauritania_svg));
            countryList.add(new Country("Tunisia","Tunisia",R.drawable.tunisia_svg));

        }

        if (!countryList.isEmpty()){
            countryAdapter = new CountryAdapter(countryList);
            binding.recyclerForCountry.setAdapter(countryAdapter);
        }
    }
    @Override
    public void onItemClick(Continent continent) {}
}