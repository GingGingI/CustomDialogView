package c.gingdev.customdialogview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import c.gingdev.customdialogview.CallbackInterfaces.DialogListener
import c.gingdev.customdialogview.Dialog.CustomDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), DialogListener{

  override fun SuccesstoGetData(item: String) {

  }

  private lateinit var dialog: CustomDialog

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    DialogBtn.setOnClickListener { v -> makeDialog() }
  }

  private fun makeDialog() {
    dialog = CustomDialog(this, "test", this)

    dialog.setCancelable(true)
    dialog.window.setGravity(Gravity.CENTER)
    dialog.show()
  }
}
