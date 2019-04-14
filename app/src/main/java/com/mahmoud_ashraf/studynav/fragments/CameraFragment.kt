package com.mahmoud_ashraf.studynav.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

import com.mahmoud_ashraf.studynav.R
import kotlinx.android.synthetic.main.fragment_camera.view.*
import java.util.*


class CameraFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v =  inflater.inflate(R.layout.fragment_camera, container, false)

      v.button_photos.setOnClickListener {

        //  Navigation.findNavController(it).navigate(CameraFragmentDirections.actionCameraFragmentToPhotosFragment())

          // or

          Navigation.findNavController(it).navigate(R.id.photosFragment)

        }

        return v
    }


}
