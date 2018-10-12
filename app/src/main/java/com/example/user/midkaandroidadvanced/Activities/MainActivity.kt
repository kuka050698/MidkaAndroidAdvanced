package com.example.user.midkaandroidadvanced.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.widget.LinearLayoutManager
import com.example.user.midkaandroidadvanced.Adapters.PagerAdapter
import com.example.user.midkaandroidadvanced.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val NEWS = 1
    private lateinit var linearLayoutManager: LinearLayoutManager

    private lateinit var adapterViewPager: FragmentPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapterViewPager = PagerAdapter(supportFragmentManager)
        vPager.adapter = adapterViewPager
        tabLayout.setupWithViewPager(vPager)
        tabLayout.getTabAt(0)!!.text = "Todo"
        tabLayout.getTabAt(1)!!.text = "Done"

        linearLayoutManager = LinearLayoutManager(this)
        vPager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                tabLayout.getTabAt(position)!!.select()
            }
        })

        fab.setOnClickListener{
            var intent = Intent(this,DetailsActivity::class.java)
            startActivityForResult(intent,NEWS)
        }
    }
}
