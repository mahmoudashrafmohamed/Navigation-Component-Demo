package com.mahmoud_ashraf.studynav.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

import com.mahmoud_ashraf.studynav.R
import kotlinx.android.synthetic.main.fragment_photos.view.*


class PhotosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v =  inflater.inflate(R.layout.fragment_photos, container, false)

       v.button_home.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.homeFragment)
        }

        return v
    }


}
