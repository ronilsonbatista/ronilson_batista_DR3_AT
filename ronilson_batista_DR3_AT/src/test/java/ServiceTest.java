
import org.example.dto.CarroDTOInput;
import org.example.service.CarroService;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ServiceTest {
    @Test
    public void testeInsercaoCarro() {
        CarroService service = new CarroService();

        CarroDTOInput dtoInput= new CarroDTOInput();
        dtoInput.setId(1);
        dtoInput.setModelo("Fusca");
        dtoInput.setPlaca("AGC-5462");
        dtoInput.setChassi("13AS2345556362444");

        service.inserir(dtoInput);

        assertEquals(1,service.listar().size());
    }
}
