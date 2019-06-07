package com.example.fullfit.Activity


import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.*
import com.example.fullfit.Logic.Exercise
import com.example.fullfit.Logic.ISet
import com.example.fullfit.Logic.Strength
import com.example.fullfit.Logic.Workout
import com.example.fullfit.R
import android.content.Intent
import android.content.Intent.getIntent
import android.provider.MediaStore


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [@link Fragment] subclass.
 *
 */
class SecondFragment : Fragment() {

    //private val tweetsRecyclerView: RecyclerView? = findViewById<RecyclerView>(R.id.list_works)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    var works = arrayOf("Tr1","Tr2","Tr3")

    val pullup: ISet = Strength("PullUp", 60, 15.0, 10)
    val squeezing: ISet = Strength("Squeez", 60, 0.0, 15)
    val jumping: ISet = Strength("Jumping", 60, 0.0, 25)

    val MyExerc = Exercise("My Exerc", arrayListOf(pullup, pullup, pullup, pullup), 120)
    val SqueezEx = Exercise("Squeez", arrayListOf(squeezing, squeezing, squeezing), 120)
    val JumpEx = Exercise("Jump", arrayListOf(jumping, jumping, jumping), 120)

    val work = Workout("Workout",arrayListOf(MyExerc, SqueezEx, JumpEx), 5)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view : View = inflater!!.inflate(R.layout.fragment_second,container, false)
        val listView = view.findViewById<ListView>(R.id.worklist) as ListView
        val wAdapter : ArrayAdapter<String> = ArrayAdapter(activity,android.R.layout.simple_list_item_1,works)

        val btnAdd = view.findViewById<Button>(R.id.addBtn) as Button


        listView.adapter = wAdapter
        listView.setOnItemClickListener{parent,view,position,id->
            Toast.makeText(activity,"item Clicked:-$id",Toast.LENGTH_SHORT).show()
        }

        btnAdd.setOnClickListener{addWork(view)}

//        return inflater.inflate(R.layout.fragment_second, container, false)
        return view
    }

    fun addWork(view: View){
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

        intent.component = null
        intent.setPackage("com.google.android.GoogleCamera")
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        Toast.makeText(this.activity, "text", Toast.LENGTH_SHORT).show()
        works = arrayOf("Tr2", "Tr3", "Tr1")
    }

}
