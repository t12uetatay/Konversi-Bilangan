package id.t12uetatay.konversi_bilangan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    var input : TextView? = null
    var result : TextView? = null
    var op_a : TextView? = null
    var op_b : TextView? = null
    var btn_2 : AppCompatButton? = null
    var btn_3 : AppCompatButton? = null
    var btn_4 : AppCompatButton? = null
    var btn_5 : AppCompatButton? = null
    var btn_6 : AppCompatButton? = null
    var btn_7 : AppCompatButton? = null
    var btn_8 : AppCompatButton? = null
    var btn_9 : AppCompatButton? = null
    var btn_10 : AppCompatButton? = null
    var btn_11 : AppCompatButton? = null
    var btn_12 : AppCompatButton? = null
    var btn_13 : AppCompatButton? = null
    var btn_14 : AppCompatButton? = null
    var btn_15 : AppCompatButton? = null
    val opr = Operasi()
    var op_1 : Boolean?=false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input = findViewById(R.id.text_input)
        result = findViewById(R.id.text_result)
        btn_2= findViewById(R.id.btn_2)
        btn_3 = findViewById(R.id.btn_3)
        btn_4 = findViewById(R.id.btn_4)
        btn_5 = findViewById(R.id.btn_5)
        btn_6 = findViewById(R.id.btn_6)
        btn_7 = findViewById(R.id.btn_7)
        btn_8 = findViewById(R.id.btn_8)
        btn_9 = findViewById(R.id.btn_9)
        btn_10 = findViewById(R.id.btn_10)
        btn_11 = findViewById(R.id.btn_11)
        btn_12 = findViewById(R.id.btn_12)
        btn_13 = findViewById(R.id.btn_13)
        btn_14 = findViewById(R.id.btn_14)
        btn_15 = findViewById(R.id.btn_15)
        op_a = findViewById(R.id.opr_a)
        op_b = findViewById(R.id.opr_b)


    }

    fun onDigit(view: View) {
        //input?.text = (view as AppCompatButton).text.toString()
        if (input?.text.toString().equals("0")){
            input?.text = (view as AppCompatButton).text.toString()
        } else {
            input?.append((view as AppCompatButton).text.toString())
        }
    }

    fun onClear(view: View) {
        input?.text = "0"
    }

    fun onRes(view: View) {
        op_1 = false
        op_a?.text="DEC"
        op_b?.text="DEC"
        result?.text="0"
        input?.text="0"
        btn_2?.isEnabled=true
        btn_3?.isEnabled=true
        btn_4?.isEnabled=true
        btn_5?.isEnabled=true
        btn_6?.isEnabled=true
        btn_7?.isEnabled=true
        btn_8?.isEnabled=true
        btn_9?.isEnabled=true
        btn_10?.isEnabled=false
        btn_11?.isEnabled=false
        btn_12?.isEnabled=false
        btn_13?.isEnabled=false
        btn_14?.isEnabled=false
        btn_15?.isEnabled=false
    }

    fun bin(view: View){
        if (op_1 == true){
            op_b?.text = (view as TextView).text.toString()
        } else {
            op_1=true
            op_a?.text = (view as TextView).text.toString()
            btn_2?.isEnabled=false
            btn_3?.isEnabled=false
            btn_4?.isEnabled=false
            btn_5?.isEnabled=false
            btn_6?.isEnabled=false
            btn_7?.isEnabled=false
            btn_8?.isEnabled=false
            btn_9?.isEnabled=false
            btn_10?.isEnabled=false
            btn_11?.isEnabled=false
            btn_12?.isEnabled=false
            btn_13?.isEnabled=false
            btn_14?.isEnabled=false
            btn_15?.isEnabled=false
            input?.text="0"
        }
    }

    fun dec(view: View){
        if (op_1 == true){
            op_b?.text = (view as TextView).text.toString()
        } else {
            op_1=true
            op_a?.text = (view as TextView).text.toString()
            btn_2?.isEnabled=true
            btn_3?.isEnabled=true
            btn_4?.isEnabled=true
            btn_5?.isEnabled=true
            btn_6?.isEnabled=true
            btn_7?.isEnabled=true
            btn_8?.isEnabled=true
            btn_9?.isEnabled=true
            btn_10?.isEnabled=false
            btn_11?.isEnabled=false
            btn_12?.isEnabled=false
            btn_13?.isEnabled=false
            btn_14?.isEnabled=false
            btn_15?.isEnabled=false
            input?.text="0"
        }
    }

    fun oct(view: View){
        if (op_1 == true){
            op_b?.text = (view as TextView).text.toString()
        } else {
            op_1=true
            op_a?.text = (view as TextView).text.toString()
            btn_2?.isEnabled=true
            btn_3?.isEnabled=true
            btn_4?.isEnabled=true
            btn_5?.isEnabled=true
            btn_6?.isEnabled=true
            btn_7?.isEnabled=true
            btn_8?.isEnabled=false
            btn_9?.isEnabled=false
            btn_10?.isEnabled=false
            btn_11?.isEnabled=false
            btn_12?.isEnabled=false
            btn_13?.isEnabled=false
            btn_14?.isEnabled=false
            btn_15?.isEnabled=false
            input?.text="0"
        }
    }

    fun hex(view: View){
        if (op_1 == true){
            op_b?.text = (view as TextView).text.toString()
        } else {
            op_1=true
            op_a?.text = (view as TextView).text.toString()
            btn_2?.isEnabled=true
            btn_3?.isEnabled=true
            btn_4?.isEnabled=true
            btn_5?.isEnabled=true
            btn_6?.isEnabled=true
            btn_7?.isEnabled=true
            btn_8?.isEnabled=true
            btn_9?.isEnabled=true
            btn_10?.isEnabled=true
            btn_11?.isEnabled=true
            btn_12?.isEnabled=true
            btn_13?.isEnabled=true
            btn_14?.isEnabled=true
            btn_15?.isEnabled=true
            input?.text="0"
        }
    }

    fun getResult(view: View){
        if (op_a?.text.toString().equals("BIN") && op_b?.text.toString().equals("BIN")){
            result?.text=input?.text.toString()
        } else if (op_a?.text.toString().equals("BIN") && op_b?.text.toString().equals("DEC")) {
            result?.text=opr.binToDec(input?.text.toString())
        } else if (op_a?.text.toString().equals("BIN") && op_b?.text.toString().equals("OCT")) {
            result?.text=opr.binToOktal(input?.text.toString())
        } else if (op_a?.text.toString().equals("BIN") && op_b?.text.toString().equals("HEX")) {
            result?.text=opr.binToHex(input?.text.toString())
        } else if (op_a?.text.toString().equals("DEC") && op_b?.text.toString().equals("BIN")) {
            result?.text=opr.decToBin(input?.text.toString())
        } else if (op_a?.text.toString().equals("DEC") && op_b?.text.toString().equals("DEC")) {
            result?.text=input?.text.toString()
        } else if (op_a?.text.toString().equals("DEC") && op_b?.text.toString().equals("OCT")) {
            result?.text=opr.decToOktal(input?.text.toString())
        } else if (op_a?.text.toString().equals("DEC") && op_b?.text.toString().equals("HEX")) {
            result?.text=opr.decToHex(input?.text.toString())
        } else if (op_a?.text.toString().equals("OCT") && op_b?.text.toString().equals("BIN")) {
            result?.text=opr.oktalToBin(input?.text.toString())
        } else if (op_a?.text.toString().equals("OCT") && op_b?.text.toString().equals("DEC")) {
            result?.text=opr.oktalToDec(input?.text.toString())
        } else if (op_a?.text.toString().equals("OCT") && op_b?.text.toString().equals("OCT")) {
            result?.text=input?.text.toString()
        } else if (op_a?.text.toString().equals("OCT") && op_b?.text.toString().equals("HEX")) {
            result?.text=opr.oktalToHex(input?.text.toString())
        } else if (op_a?.text.toString().equals("HEX") && op_b?.text.toString().equals("BIN")) {
            result?.text=opr.hexToBin(input?.text.toString())
        } else if (op_a?.text.toString().equals("HEX") && op_b?.text.toString().equals("DEC")) {
            result?.text=opr.hexToDec(input?.text.toString())
        } else if (op_a?.text.toString().equals("HEX") && op_b?.text.toString().equals("OCT")) {
            result?.text=opr.hexToOktal(input?.text.toString())
        } else if (op_a?.text.toString().equals("HEX") && op_b?.text.toString().equals("OCT")) {
            result?.text=input?.text.toString()
        }

    }
}