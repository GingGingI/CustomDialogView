package c.gingdev.customdialogview.Dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.WindowManager
import android.widget.LinearLayout
import c.gingdev.customdialogview.CallbackInterfaces.DialogListener
import c.gingdev.customdialogview.R
import c.gingdev.customdialogview.Recycler.Adapter.Adapter
import kotlinx.android.synthetic.main.custom_dialog.*

class CustomDialog : Dialog {

  val mContext: Context
  val title: String
  val Listener: DialogListener

  constructor(context: Context, title: String, Listener: DialogListener):
      super(context, android.R.style.Theme_Translucent_NoTitleBar) {
    this.mContext = context
    this.title = title
    this.Listener = Listener
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val lpWindow = WindowManager.LayoutParams()
    lpWindow.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND
    lpWindow.dimAmount = 0.8f
    window.attributes = lpWindow

    setContentView(R.layout.custom_dialog)

    setView()
  }

  private fun setView() {
    Title.text = title
    ChkBtn.setOnClickListener { v -> ShowList() }
  }

  private fun ShowList() {
    val str = "%d년 %d월 %d일 ~"

    Title.text = str.format(picker.year, picker.month+1, picker.dayOfMonth)

    datePick.visibility = View.INVISIBLE
    ItemList.visibility = View.VISIBLE

    val adapter = Adapter()
    recyclerView.adapter = adapter
    recyclerView.layoutManager = LinearLayoutManager(mContext)
    adapter.notifyDataSetChanged()
  }
}