package com.example.assginment.ui.quickGrab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.LinearInterpolator
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DefaultItemAnimator
import com.example.assginment.adapters.QuickGrabAdapter
import com.example.assginment.databinding.FragmentQuickGrabBinding
import com.example.assginment.utils.Constants
import com.yuyakaido.android.cardstackview.CardStackLayoutManager
import com.yuyakaido.android.cardstackview.CardStackView
import com.yuyakaido.android.cardstackview.Direction
import com.yuyakaido.android.cardstackview.StackFrom
import com.yuyakaido.android.cardstackview.SwipeableMethod

class QuickGrabFragment : Fragment() {

    private val TAG= "LunchFragment"

    private lateinit var binding: FragmentQuickGrabBinding
    private lateinit var quickGrabAdapter: QuickGrabAdapter
    private lateinit var csvQuickGrab: CardStackView
    private lateinit var cslmQuickGrab: CardStackLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuickGrabBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.iActionbar.ivBackArrow.setOnClickListener{
            requireActivity().onBackPressed()
        }
        setUpQuickGrabSCV()
    }

    private fun setUpQuickGrabSCV(){

        csvQuickGrab= binding.csvQuicKGrab
        csvQuickGrab.isVisible= true
        cslmQuickGrab= CardStackLayoutManager(requireActivity())

//        cslmQuickGrab= CardStackLayoutManager(requireActivity(), object: CardStackListener{
//
//            override fun onCardDragging(direction: Direction?, ratio: Float) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onCardSwiped(direction: Direction?) {
//
//                when (direction) {
//                    Direction.Left -> {
//
//                    }
//                    Direction.Right -> {
//
//                    }
//                    Direction.Top -> {
//
//                    }
//                    Direction.Bottom -> {
//
//                    }
//
//                    else -> {
//
//                    }
//                }
//            }
//
//            override fun onCardRewound() {
//                TODO("Not yet implemented")
//            }
//
//            override fun onCardCanceled() {
//                TODO("Not yet implemented")
//            }
//
//            override fun onCardAppeared(view: View?, position: Int) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onCardDisappeared(view: View?, position: Int) {
//                TODO("Not yet implemented")
//            }
//
//        })


        quickGrabAdapter = QuickGrabAdapter(Constants.QuickGrab.getList1())
        csvQuickGrab.apply {
            layoutManager= cslmQuickGrab
            adapter = quickGrabAdapter
            itemAnimator= DefaultItemAnimator()
        }

        cslmQuickGrab.apply {
            setStackFrom(StackFrom.None)
            setVisibleCount(3)
            setTranslationInterval(4.0f)
            setScaleInterval(0.75f)
            setMaxDegree(25.0f)
            setSwipeThreshold(0.3f)
            setDirections(Direction.FREEDOM)
            setCanScrollHorizontal(true)
            setSwipeableMethod(SwipeableMethod.Manual)
            setOverlayInterpolator(LinearInterpolator())
        }
    }
}