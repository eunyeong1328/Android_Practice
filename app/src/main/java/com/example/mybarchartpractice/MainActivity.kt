package com.example.mybarchartpractice

import android.graphics.Color
import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.animation.Easing
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet
import com.github.mikephil.charting.utils.ColorTemplate
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var stackedChart: BarChart
    private lateinit var pieChart: PieChart

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

        //------------

        pieChart = findViewById(R.id.pieChart)
        pieChart.setUsePercentValues(true)
        //data Set : 데이터 삽입
        val entries = ArrayList<PieEntry>()
        entries.add(PieEntry(508f,"english"))
        entries.add(PieEntry(308f,"math"))
        entries.add(PieEntry(108f,"korean"))
        //color : 색상
//        for(c in ColorTemplate.VORDIPLOM_COLORS) colorsItems.add(c)
//        for(c in ColorTemplate.JOYFUL_COLORS) colorsItems.add(c)
//        for(c in ColorTemplate.COLORFUL_COLORS) colorsItems.add(c)
        var colorItems = ArrayList<Int>() //색
        colorItems.add(Color.argb(100,68,158,246))  // Red
        colorItems.add(Color.argb(100,168,58,26))   // Brown
        colorItems.add(Color.argb(100,38,18,6))     // Blue

        val pieDataSet = PieDataSet(entries,"")
        pieDataSet.colors = colorItems
        pieDataSet.apply {
            valueTextColor = Color.BLACK
            valueTextSize = 16f
        }
        //% : 퍼센트 수치 색상과 사이즈 지정
        val pieData = PieData(pieDataSet)
        pieChart.apply{
            data = pieData
            description.isEnabled = false //해당 그래프 오른쪽 아래 그래프의 이름을 표시한다.
            isRotationEnabled = false //그래프를 회전판처럼 돌릴 수 있다
//            centerText = "this is color" //그래프 한 가운데 들어갈 텍스트
            setEntryLabelColor(Color.RED) //그래프 아이템의 이름의 색 지정
            isEnabled = false
            legend.isEnabled = false //범례 지우기
            isDrawHoleEnabled = true //중앙의 흰색 테두리 제거
            holeRadius = 50f //흰색을 증앙에 꽉 채우기
            animateY(1400,Easing.EaseInOutQuad)
            animate()
        }
    }

    private fun dataValues() : ArrayList<BarEntry>{
        var dataValues = ArrayList<BarEntry>()
        dataValues.add(BarEntry(0.toFloat(), floatArrayOf(5.1f,10.0f,15.1f,20.5f)))
        dataValues.add(BarEntry(1.toFloat(), floatArrayOf(1.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(2.toFloat(), floatArrayOf(2.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(3.toFloat(), floatArrayOf(3.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(4.toFloat(), floatArrayOf(4.0f,4.4f,4.1f)))
        dataValues.add(BarEntry(5.toFloat(), floatArrayOf(1.3f,4.4f,4.1f,5.5f)))
        return dataValues
    }


}

//dataValues.add(BarEntry(6.toFloat(), floatArrayOf(1.0f,4.4f,4.1f)))
//dataValues.add(BarEntry(7.toFloat(), floatArrayOf(2.0f,4.4f,4.1f)))
//dataValues.add(BarEntry(8.toFloat(), floatArrayOf(3.0f,4.4f,4.1f)))
//dataValues.add(BarEntry(9.toFloat(), floatArrayOf(4.0f,4.4f,4.1f)))
//dataValues.add(BarEntry(10.toFloat(), floatArrayOf(1.3f,4.4f,4.1f,5.5f)))
//dataValues.add(BarEntry(11.toFloat(), floatArrayOf(1.0f,4.4f,4.1f)))
//dataValues.add(BarEntry(12.toFloat(), floatArrayOf(2.0f,4.4f,4.1f)))
//dataValues.add(BarEntry(13.toFloat(), floatArrayOf(3.0f,4.4f,4.1f)))
//dataValues.add(BarEntry(14.toFloat(), floatArrayOf(4.0f,4.4f,4.1f)))
//dataValues.add(BarEntry(15.toFloat(), floatArrayOf(1.3f,4.4f,4.1f,5.5f)))
//dataValues.add(BarEntry(16.toFloat(), floatArrayOf(1.0f,4.4f,4.1f)))
//dataValues.add(BarEntry(17.toFloat(), floatArrayOf(2.0f,4.4f,4.1f)))
//dataValues.add(BarEntry(18.toFloat(), floatArrayOf(3.0f,4.4f,4.1f)))
//dataValues.add(BarEntry(19.toFloat(), floatArrayOf(4.0f,4.4f,4.1f)))