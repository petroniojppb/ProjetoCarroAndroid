package br.com.projetocarro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recycleViewCarros : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleViewCarros = findViewById(R.id.activity_main_recycle_view_carros)

        var carros = ArrayList<Carro>()
        carros.add(Carro("Marca: Renaut", "Modelo: Captur", "Preço:130.000",  "Descrição: Carro Top de linha", R.drawable.captur))
        carros.add(Carro("Marca: Ford", "Modelo: Ecosport", "Preço: 120.000",  "Descrição: Completa de tudo", R.drawable.ecoespport))
        carros.add(Carro("Marca: VolksWagen", "Modelo: Amarock", "Preço: 140.000",  "Descrição: Tração nas 4 rodas", R.drawable.amarok))
        carros.add(Carro("Marca: Toyota", "Modelo: Hilux", "Preço: 160.000",  "Descrição: Cabine estendida", R.drawable.hilux))
        carros.add(Carro("Marca: Chevrolet", "Modelo: S10", "Preço: 135.000",  "Descrição: Modelo 2021", R.drawable.sdez))
        carros.add(Carro("Marca: Renaut", "Modelo: Sandero", "Preço:130.000",  "Descrição: Carro Top de linha", R.drawable.sandero))
        carros.add(Carro("Marca: Ford", "Modelo: Focus", "Preço: 120.000",  "Descrição: Completa de tudo", R.drawable.focus))
        carros.add(Carro("Marca: VolksWagen", "Modelo: Golf", "Preço: 120.000",  "Descrição: Modelo 2021", R.drawable.golf))
        carros.add(Carro("Marca: Toyota", "Modelo: Corolla", "Preço: 80.000",  "Descrição: Completo de tudo", R.drawable.corolla))
        carros.add(Carro("Marca: Chevrolet", "Modelo: Cruze", "Preço: 110.000",  "Descrição: Modelo 2021", R.drawable.cruze))

        var carrosAdapter = CarrosAdapter(carros, this)
        recycleViewCarros.adapter = carrosAdapter

        var layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycleViewCarros.layoutManager = layoutManager

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId;
        if (id == R.id.sobre_action){
            Toast.makeText(this, "Petrônio Araujo", Toast.LENGTH_SHORT).show()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
