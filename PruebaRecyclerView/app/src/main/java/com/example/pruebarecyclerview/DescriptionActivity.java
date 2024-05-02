package com.example.pruebarecyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.pruebarecyclerview.adaptadores.UsuarioAdaptador;
import com.example.pruebarecyclerview.clases.Usuario;
import com.squareup.picasso.Picasso;

public class DescriptionActivity extends AppCompatActivity {

    TextView txt_titulo, txt_curso;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Usuario dato = (Usuario) getIntent().getSerializableExtra("Usuario");

        txt_titulo = findViewById(R.id.txt_titulo);
        txt_curso = findViewById(R.id.txt_curso);
        imagen = findViewById(R.id.imagen);

        txt_titulo.setText(dato.getNombre());
        txt_curso.setText(dato.getCurso());
        Picasso.get().load(dato.getImagen()).into(imagen);
    }
}