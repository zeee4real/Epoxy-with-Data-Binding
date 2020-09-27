package com.example.epoxyapplication.epoxyapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.epoxyapplication.R
import com.example.epoxyapplication.content
import com.example.epoxyapplication.footer
import com.example.epoxyapplication.header
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sampleModel = getSampleData()
        recyclerView.withModels {
            sampleModel.forEachIndexed { position, model ->
                when (model.type) {
                    //view_holder_header (layout file) = "header" this is because of data binding
                    "Header" -> header {
                        id(position)
                        headerName("Pos:$position ${model.content}")
                    }
                    "Content" -> content {
                        id(position)
                        sampleModelVariable(model)
                        onClickContent { _ ->
                            Toast.makeText(this@MainActivity, model.content, Toast.LENGTH_SHORT)
                                .show()
                        }
                    }
                    "Footer" -> footer {
                        id(position)
                        footerName("Pos:$position ${model.content}")
                    }
                }
            }
        }
    }
}