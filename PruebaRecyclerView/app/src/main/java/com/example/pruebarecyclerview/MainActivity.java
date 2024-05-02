package com.example.pruebarecyclerview;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebarecyclerview.adaptadores.UsuarioAdaptador;
import com.example.pruebarecyclerview.clases.Usuario;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv_usuarios;
    List<Usuario> listaUsuario = new ArrayList<>();
    private void description(Usuario item) {
        Intent i = new Intent(this, DescriptionActivity.class);
        i.putExtra("Usuario", item);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_usuarios = findViewById(R.id.rcv_usuarios);

        Usuario usuario1 = new Usuario("https://rickandmortyapi.com/api/character/avatar/72.jpeg",
                "Miguel","Movil");
        Usuario usuario2 = new Usuario("https://rickandmortyapi.com/api/character/avatar/120.jpeg",
                "Camilo","Ingles");
        Usuario usuario3 = new Usuario("https://rickandmortyapi.com/api/character/avatar/190.jpeg",
                "Caleb","IA");
        Usuario usuario4 = new Usuario("https://rickandmortyapi.com/api/character/avatar/241.jpeg",
                "Anthony","Calculo");

        listaUsuario.add(usuario1);
        listaUsuario.add(usuario2);
        listaUsuario.add(usuario3);
        listaUsuario.add(usuario4);
        listaUsuario.add(usuario1);
        listaUsuario.add(usuario2);
        listaUsuario.add(usuario3);
        listaUsuario.add(usuario4);

        UsuarioAdaptador usuarioAdaptador = new UsuarioAdaptador(listaUsuario,new UsuarioAdaptador.OnItemClickListener() {
            @Override
            public void OnItemClick(Usuario item) {
                description(item);
            }
        });

        rcv_usuarios.setLayoutManager(new LinearLayoutManager(this));
        rcv_usuarios.setAdapter(usuarioAdaptador);
    }
}