package webService;

import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class WebService {

    @Test
    public void listarUsuariosCadatrado() {
        given()
                .auth().basic("inmetrics", "automacao")
                .when()
                .get("https://inm-api-test.herokuapp.com/empregado/list/5686")
                .then()
                .statusCode(202)
                .body("nome", is("joão"));
    }


    @Test
    public void listarTodosUsuariosCadatrados() {
        given()
                .auth().basic("inmetrics", "automacao")
                .when()
                .get("https://inm-api-test.herokuapp.com/empregado/list_all")
                .then()
                .statusCode(200)
                .body("nome", hasItems("joão","Parker Rowe"));
    }
}
