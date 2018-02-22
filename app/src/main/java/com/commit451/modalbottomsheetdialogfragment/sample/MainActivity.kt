package com.commit451.modalbottomsheetdialogfragment.sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import com.commit451.modalbottomsheetdialogfragment.ModalBottomSheetDialogFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonShow.setOnClickListener {
            ModalBottomSheetDialogFragment.Builder(R.menu.options)
                    .show(supportFragmentManager, "HI", {
                        Snackbar.make(root, "Selected option $it", Snackbar.LENGTH_SHORT)
                                .show()
                    })
        }

        buttonCustom.setOnClickListener {
            ModalBottomSheetDialogFragment.Builder(R.menu.options)
                    .layout(R.layout.item_custom)
                    .show(supportFragmentManager, "HI", {
                    })
        }
    }
}