
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Navegador {
    CinefiloObserver observer;
    String nome = new String();
    private static final String apiKey = "&apikey=d58efcda";
    private String site = "https://www.omdbapi.com/?t=";
    OkHttpClient client;


    public Navegador() {
        client = new OkHttpClient().newBuilder().build();

    }

    public void busca(String filme) {


        String url = this.site + filme + apiKey;

        Request request = new Request.Builder()
                .url(url)
                .method("GET", null)
                .build();

        //rotina de pesquisa
        Thread t = new Thread() {
            public void run() {
                Response responde = null;
                try {
                    responde = client.newCall(request).execute();
                    String json = "";
                    //gerandostring
                    if (responde.isSuccessful()) {
                        json = responde.body().string();
                    }

                    if (observer != null) {
                        Filme filme = FilmeParser.parse(json);
                        String urlPoster = FilmeParser.getUrlPoster(json);
                        Request requestpost = new Request.Builder()
                                .url(urlPoster)
                                .method("GET",null)
                                .build();
                        responde = client.newCall(requestpost).execute();
                        if(responde.isSuccessful()){
                            filme.poster = responde.body().bytes();
                        }
                        observer.acheiOFilme(filme);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        };
        t.start();


    }
    public void setObserver(CinefiloObserver cinefiloObserver){
        observer = cinefiloObserver;
    }
}






/*
class MyThered extends Thread{
    private final  Request request;

    public MyThered(Request request) {
        this.request = request;
    }

    public void run(){
        Response responde = client.newCall(request).execute();
        String json = "";
        //gerandostring
        if(responde.isSuccessful()){
            json = responde.body().toString();
        }

        if(observador!= null){
            observador.ofilme(FilmeParser.parse(json));
        }
    }
}

 */