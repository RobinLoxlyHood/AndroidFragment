package com.muhammadrizki.androidfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_satu.*

class FragmentSatu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentDua = FragmentDua()
        BtnDua.setOnClickListener {
            val bundle = Bundle()
            bundle.putString(FragmentDua.EXTRA_NAME,"Data dari fragment satu")
            val desc = "Fragment ini akan  menerima data dari Fragment Satu"

            fragmentDua.arguments = bundle
            fragmentDua.desc = desc
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container,fragmentDua,FragmentDua::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }
    }
}