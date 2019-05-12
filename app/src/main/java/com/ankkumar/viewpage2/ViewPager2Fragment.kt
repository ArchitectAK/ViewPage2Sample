package com.ankkumar.viewpage2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ViewPager2Fragment : Fragment() {

    private var mUserView: TextView? = null

    companion object {
        fun getInstance(name: String): Fragment {
            val fragment = ViewPager2Fragment()
            val arg = Bundle()
            arg.putString("name", name)
            fragment.arguments = arg
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mUserView = view.findViewById(R.id.name)
        val name = arguments?.getString("name")
        mUserView?.text = "Hello $name"
    }
}