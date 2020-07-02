import cucumber.api.java.en.Then;
import impl.AuthServiceImpl;
import io.cucumber.java.en.Given;
import models.User;
import org.junit.Assert;
import services.AuthService;

public class MyStepdefs {
    AuthService authSer = new AuthServiceImpl();

    @cucumber.api.java.en.Given("^create new User$")
    public void createNewUser() {
        User newUser = User.builder()
                .email("email@gmail.com")
                .firstName("firstName")
                .lastName("lastName")
                .password("password")
                .build();

        User createUser = authSer.createUser(newUser);
        Assert.assertNotNull(createUser);
    }




    @Then("^login by User$")
    public void loginByUser() {

        Assert.assertEquals("login 1", authSer.login(),"application/json");

        Assert.assertEquals("login 2", authSer.login2(),"[code:200, type:unknown, message:logged in user session:1593709378880]");

    }
}
