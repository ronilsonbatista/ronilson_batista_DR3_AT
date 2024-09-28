import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import java.net.HttpURLConnection;
import static org.junit.Assert.assertEquals;

public class ApiTest {

    @Test
    public void testeListagemCarros() throws IOException {
        URL url = new URL("http://localhost:4567/carros");
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET");
        conexao.setConnectTimeout(5000);
        conexao.setReadTimeout(5000);
        int responseCode = conexao.getResponseCode();
        assertEquals(200,responseCode);
    }
}