package noteapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import java.time.*;

public class CreateNoteData {

    final String ROOT_URI = "https://randomuser.me/api";

    private static String title, first_name,last_name, date;
    public static String note_title;
    private String zdt;

    @Test
    public void createNewUser(){

        RestAssured.baseURI = ROOT_URI;
        RestAssured.useRelaxedHTTPSValidation();
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = null;

        response = requestSpecification.get("");

        System.out.println(response.body().asString());
        title = response.body().jsonPath().getString("results[0].name.title");
        first_name = response.body().jsonPath().getString("results[0].name.first");
        last_name = response.body().jsonPath().getString("results[0].name.last");
        date = response.body().jsonPath().getString("results[0].registered.date");

        System.out.println(title);
        System.out.println(first_name);
        System.out.println(last_name);
        System.out.println(date);

        note_title = title +" " + first_name +" " + " " + last_name;
        System.out.println(note_title);

        Instant instant = Instant.parse( date );

        ZoneId zoneId = ZoneId.of( "Indian/Cocos" ); ZonedDateTime zdt = ZonedDateTime.ofInstant( instant , zoneId );
        System.out.println(zdt);


    }

    /*public String returnNoteTitle(){
        return note_title;
    }

    public String returnNoteBody(){
        return zdt;
    }*/





}
