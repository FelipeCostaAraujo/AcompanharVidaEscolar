package com.jeffersonantunes.ave.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;
import com.jeffersonantunes.ave.R;
import com.jeffersonantunes.ave.config.ConfigFirebase;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = ConfigFirebase.getAuth();

        toolbar = (Toolbar) findViewById(R.id.toolbar_principal);
        toolbar.setTitle("AvE");
        setSupportActionBar(toolbar);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.menu_item_sair:
                deslogarUsuario();
                return true;

            case R.id.menu_item_configuracoes:
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void deslogarUsuario(){
            mAuth.signOut();
            LoginManager.getInstance().logOut();
            abrirTelaLogin();
        }

    private void abrirTelaLogin(){
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

}
