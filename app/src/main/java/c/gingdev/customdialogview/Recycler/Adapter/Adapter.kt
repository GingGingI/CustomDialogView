package c.gingdev.customdialogview.Recycler.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import c.gingdev.customdialogview.R
import c.gingdev.customdialogview.Recycler.Holder.Holder

class Adapter: RecyclerView.Adapter<Holder>() {

  val testValue: Array<String> = arrayOf("1","2","3","4","5","6","7","8","9","10")

  override fun onCreateViewHolder(parent: ViewGroup, position: Int): Holder {
    val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
    val vh = Holder(v)
    return vh
  }

  override fun getItemCount(): Int {
    return testValue.size
  }

  override fun onBindViewHolder(holder: Holder, position: Int) {
    holder.txv.text = testValue[position]
  }
}