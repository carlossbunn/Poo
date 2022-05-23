
import com.google.gson.*;

public class FilmeParser {
    public static Filme parse(String json) {
        Filme filme= new Filme();

        //convertendo para json
        JsonElement elm = JsonParser.parseString(json);

        //converteu para objeto
        if(elm.isJsonObject()){
            JsonObject obj = elm.getAsJsonObject();
            filme.titulo = obj.get("Title").getAsString();
            filme.lancamento = obj.get("Released").getAsString();
            filme.sinopse = obj.get(("Plot")).getAsString();

        }


        return  filme;
    }
    public static String getUrlPoster(String json){
        String url = null;
        JsonElement elm = JsonParser.parseString(json);
        if(elm.isJsonObject()){
            JsonObject obj = elm.getAsJsonObject();
            url = obj.get("Poster").getAsString();

        }
        return url;
    };
}
