package com.example.in2dm3_03.ejemplomenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String mTexto;
    private EditText t1;

    public static final int OPCION_1 = 0;
    public static final int OPCION_2 = 1;
    public static final int OPCION_3 = 2;
    public static final int OPCION_4 = 3;
    public static final int OPCION_5 = 4;
    public static final int OPCION_6 = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(EditText) findViewById(R.id.editTextTexto);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        crearMenu(menu);
        return true;
    }

    private void crearMenu(Menu menu) {
        MenuItem item1 = menu.add(Menu.NONE, OPCION_1, Menu.NONE,"Opcion 1"); //La segunda opcion es la ID
        MenuItem item2 = menu.add(Menu.NONE, OPCION_2, Menu.NONE,"Opcion 2");
        MenuItem item3 = menu.add(Menu.NONE, OPCION_3, Menu.NONE,"Opcion 3");
        MenuItem item4 = menu.add(Menu.NONE, OPCION_4, Menu.NONE,"Opcion 4");
        MenuItem item5 = menu.add(Menu.NONE, OPCION_5, Menu.NONE,"Opcion 5");
        MenuItem item6 = menu.add(Menu.NONE, OPCION_6, Menu.NONE,"Opcion 6");
    }

    public void recogerTexto(){
        mTexto= String.valueOf(t1.getText());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        seleccionarOpcion(item);
        return true;    }

        private void seleccionarOpcion(MenuItem item){
            int itemId= item.getItemId();

            switch (itemId){
                case OPCION_1:
                    Toast.makeText(this,"Opcion 1 elegida",Toast.LENGTH_LONG ).show();
                    recogerTexto();
                    Intent i1=new Intent(this, Recibir.class);
                    i1.putExtra("texto", mTexto);

                    startActivity(i1);
                    break;
                case OPCION_2:
                    Toast.makeText(this,"Opcion 2 elegida",Toast.LENGTH_LONG ).show();
                    break;
                case OPCION_3:
                    Toast.makeText(this,"Opcion 3 elegida",Toast.LENGTH_LONG ).show();
                    break;
                case OPCION_4:
                    Toast.makeText(this,"Opcion 4 elegida",Toast.LENGTH_LONG ).show();
                    break;
                case OPCION_5:
                    Toast.makeText(this,"Opcion 5 elegida",Toast.LENGTH_LONG ).show();
                    break;
                case OPCION_6:
                    Toast.makeText(this,"Opcion 6 elegida",Toast.LENGTH_LONG ).show();
                    break;
            }
        }



}

