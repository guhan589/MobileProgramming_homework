package com.example.moblieprograming_proect1

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("테이블레이아웃 계산기")


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            edit1.showSoftInputOnFocus = false
            edit2.showSoftInputOnFocus = false
        }

        var arr = arrayOf(zeroBtn,oneBtn,twoBtn,threeBtn,fourBtn,fiveBtn,sixBtn,sevenBtn,eightBtn,nineBtn)
        for(i in 0..9){
            arr[i].setOnClickListener{
                if(edit1.isFocused==true){
                    edit1.append(arr[i].text)
                }else if(edit2.isFocused==true){
                    edit2.append(arr[i].text)
                }else{
                    Toast.makeText(this,"Ediit 창을 먼저 선택하세요",Toast.LENGTH_SHORT).show()
                }
            }
        }
        addBtn.setOnClickListener{//더하기 버튼

            result_textView.setText("걸색결과:")
            result_textView.append(((Integer.parseInt(edit1.getText().toString())+Integer.parseInt(edit2.getText().toString())).toString()))
            edit1.setText("")
            edit2.setText("")
        }

        minusBtn.setOnClickListener{//빼기 버튼

            result_textView.setText("걸색결과:")
            result_textView.append(((Integer.parseInt(edit1.getText().toString())-Integer.parseInt(edit2.getText().toString())).toString()))
            edit1.setText("")
            edit2.setText("")
        }

        multiBtn.setOnClickListener{//곱하기 버튼

            result_textView.setText("걸색결과:")
            result_textView.append(((Integer.parseInt(edit1.getText().toString())*Integer.parseInt(edit2.getText().toString())).toString()))
            edit1.setText("")
            edit2.setText("")
        }

        divBtn.setOnClickListener{//나누기 버튼

            result_textView.setText("걸색결과:")
            result_textView.append(((Integer.parseInt(edit1.getText().toString())/Integer.parseInt(edit2.getText().toString())).toString()))
            edit1.setText("")
            edit2.setText("")
        }

    }
}