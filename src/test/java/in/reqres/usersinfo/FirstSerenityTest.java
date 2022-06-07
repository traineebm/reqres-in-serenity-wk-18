package in.reqres.usersinfo;

import in.reqres.constants.EndPoints;
import in.reqres.testbase.TestBase;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Title;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Jay
 */

//@RunWith(SerenityRunner.class)
public class FirstSerenityTest extends TestBase {

    @Test
    public void getAllUsersList(){
        SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_USERS)
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public void thisIsFailingTest(){
        SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_USERS)
                .then()
                .log().all()
                .statusCode(201);
    }

    @Pending //Serenity
    @Test
    public void thisIsAPending(){

    }

    @Ignore //Junit
    @Test
    public void thisIsASkipped(){

    }

    @Test
    public void thisIsATestWithError(){
        System.out.println("This is an Error " +(5/0) );
    }

    @Manual
    @Test
    public void thisIsManual(){

    }

    @Test
    public void thisIsCompromised() throws FileNotFoundException {
        File file = new File("E://file.txt"); //java
        FileReader fr = new FileReader(file); //java
    }

    @Title("This test will get the information of all users")
    @Test
    public void test001(){
        SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_USERS)
                .then()
                .log().all()
                .statusCode(200);
    }
}
