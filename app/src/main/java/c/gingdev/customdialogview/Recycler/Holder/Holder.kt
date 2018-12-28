package c.gingdev.customdialogview.Recycler.Holder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import c.gingdev.customdialogview.R

class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
  val txv = itemView.findViewById<TextView>(R.id.Txt)
}