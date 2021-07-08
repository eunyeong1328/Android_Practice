package com.example.mybarchartpractice

import android.graphics.Color
import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var stackedChart: BarChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stackedChart = findViewById(R.id.stacked_BarChart)

        var barDataSet = BarDataSet(dataValues(),"") //값
        var colors = ArrayList<Int>() //색
        colors.add(Color.argb(100,68,158,246))  // Red
        colors.add(Color.argb(100,168,58,26))   // Brown
        colors.add(Color.argb(100,38,18,6))     // Blue
        barDataSet.colors = colors

        var barData = BarData(barDataSet)

        stackedChart.data = barData
        stackedChart.setVisibleXRangeMaximum(2f)
        stackedChart.moveViewToX(-10f)
        stackedChart.invalidate()
    }

    private fun dataValues() : ArrayList<BarEntry>{
        var dataValues = ArrayList<BarEntry>()
        dataValues.add(BarEntry(0.toFloat(), floatArrayOf(5.1f,10.0f,15.1f,20.5f)))
        dataValues.add(BarEntry(1.toFloat(), floatArrayOf(1.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(2.toFloat(), floatArrayOf(2.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(3.toFloat(), floatArrayOf(3.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(4.toFloat(), floatArrayOf(4.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(5.toFloat(), floatArrayOf(1.3f,4.4f,4.1f,5.5f)))
        dataValues.add(BarEntry(6.toFloat(), floatArrayOf(1.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(7.toFloat(), floatArrayOf(2.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(8.toFloat(), floatArrayOf(3.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(9.toFloat(), floatArrayOf(4.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(10.toFloat(), floatArrayOf(1.3f,4.4f,4.1f,5.5f)))
        dataValues.add(BarEntry(11.toFloat(), floatArrayOf(1.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(12.toFloat(), floatArrayOf(2.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(13.toFloat(), floatArrayOf(3.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(14.toFloat(), floatArrayOf(4.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(15.toFloat(), floatArrayOf(1.3f,4.4f,4.1f,5.5f)))
        dataValues.add(BarEntry(16.toFloat(), floatArrayOf(1.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(17.toFloat(), floatArrayOf(2.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(18.toFloat(), floatArrayOf(3.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(19.toFloat(), floatArrayOf(4.0f,4.4f,4.1f)))
        return dataValues
    }


}