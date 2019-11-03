package com.eps.creditoffer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_instalment.*
import java.lang.Boolean.FALSE
import java.lang.Boolean.TRUE
import java.time.LocalDate
import java.util.*

class InstalmentFragment : Fragment() {

    private val instalments = listOf(
        InstalmentLink(TRUE, 100F, Date(119, 9, 4)),
        InstalmentLink(FALSE, 100F, Date(119, 10, 1)),
        InstalmentLink(FALSE, 100F, Date(119, 11, 6)),
        InstalmentLink(FALSE, 100F, Date(120, 0, 3)),
        InstalmentLink(FALSE, 100F, Date(120, 2, -1)),
        InstalmentLink(FALSE, 100F, Date(120, 2, 6))
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_instalment, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println(instalments)
        list_recycler_view.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ListInstalmentAdapter(instalments)
        }
    }

    companion object {
        fun newInstance(): InstalmentFragment = InstalmentFragment()
    }
}