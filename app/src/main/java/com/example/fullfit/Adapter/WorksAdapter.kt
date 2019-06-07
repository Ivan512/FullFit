//package com.example.fullfit.Adapter
//
//import android.support.v7.widget.RecyclerView
//import android.widget.TextView
//import android.R.attr.name
//import android.content.Context
//import android.view.View
//import android.widget.ImageView
//import com.example.fullfit.R
//import android.provider.ContactsContract.CommonDataKinds.Phone
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import com.example.fullfit.Logic.Workout
//import java.nio.file.Files.size
//
//
//
//
//class WorksAdapter : RecyclerView.Adapter<WorksAdapter.ViewHolder>() {
//
//    private var inflater: LayoutInflater? = null
//    private var phones: List<Workout>? = null
//
//    fun WorksAdapter(context: Context, phones: List<Workout>){
//        this.phones = phones
//        this.inflater = LayoutInflater.from(context)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorksAdapter.ViewHolder {
//
//        val view = inflater?.inflate(R.layout.item_work, parent, false)
//        return ViewHolder(view!!)
//    }
//
//    override fun onBindViewHolder(holder: WorksAdapter.ViewHolder, position: Int) {
//        val phone = phones?.get(position)
//        holder.nameView.setText(phone?.name)
//        holder.exerciseView.setText(phone?.exerciseLs?.get(0)?.name)
//    }
//
//    override fun getItemCount(): Int {
//        return phones!!.size
//    }
//
//
//    public class ViewHolder(view: View) : RecyclerView.ViewHolder() {
//        var nameView: TextView = TextView()
//        var exerciseView: TextView = null
//        fun ViewHolder(view: View) {
//            super(view)
//            nameView = view.findViewById(R.id.name)
//            exerciseView = view.findViewById(R.id.exercise)
//        }
//    }
//}
