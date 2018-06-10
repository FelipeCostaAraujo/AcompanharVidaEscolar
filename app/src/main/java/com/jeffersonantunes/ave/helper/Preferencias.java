package com.jeffersonantunes.ave.helper;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferencias {
    private Context context;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private static final String NOME_ARQUIVO = "ave.preferencias";
    private static final String CHAVE_IDENTIFICADOR = "idUsuarioLogado";
    private static final String CHAVE_NOMEUSUARIO = "nomeUsuarioLogado";
    private static final int MODE = 0;


    public Preferencias( Context contextParametro) {

        context = contextParametro;
        sharedPreferences = context.getSharedPreferences(NOME_ARQUIVO,MODE);
        editor = sharedPreferences.edit();

    }

    //Metodo para salvar os dados do user
    public void salvarDados(String idUsuarioLogado, String nomeUsuarioLogado){

        //inseri no arquivo o dado (id,valor)
        editor.putString(CHAVE_IDENTIFICADOR,idUsuarioLogado);
        editor.putString(CHAVE_NOMEUSUARIO,nomeUsuarioLogado);

        //GRAVAR
        editor.commit();

    }

    public String getIdentificador() {

        return sharedPreferences.getString(CHAVE_IDENTIFICADOR,null);
    }
    public String getNomeUsuario() {

        return sharedPreferences.getString(CHAVE_NOMEUSUARIO,null);
    }

}
