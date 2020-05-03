
//Douglas Lonkoski -  03/05/2020

package com.lonkoski.atmconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class  MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_clientes.setOnClickListener {
            var intent = Intent(this, DetalhesClienteActivity::class.java)
            startActivity(intent)
        }
        button_empresas.setOnClickListener {
            var intent2 = Intent(this, DetalhesEmpresaActivity::class.java)
            startActivity(intent2)
        }
        button_servicos.setOnClickListener {
            var intent3 = Intent(this, DetalhesServicoActivity::class.java)
            startActivity(intent3)
        }
        button_contatos.setOnClickListener {
            var intent4 = Intent(this, DetalhesContatoActivity::class.java)
            startActivity(intent4)
        }
    }
}
