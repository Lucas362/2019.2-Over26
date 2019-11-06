package com.eps.creditoffer
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_instalment.*
import java.lang.Boolean.FALSE
import java.lang.Boolean.TRUE
import java.time.LocalDate
import java.util.*

class InstalmentFragment : Fragment() {

    val debt = OverdraftDebtLink()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("----MainFragment.onCreate----")
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_instalment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("----MainActivity.onViewCreated----")

        debt.listInstalments(1)
        val instalments = debt.instalment

        list_recycler_view.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ListInstalmentAdapter(instalments)
        }
    }

    companion object {
        fun newInstance(): InstalmentFragment = InstalmentFragment()
    }

    /*fun close(view: View) {
print("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")
    }*/

    }