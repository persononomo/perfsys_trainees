package net.perfsys.trainees.ascherbakov.task_0.fromJSON;

import com.fasterxml.jackson.core.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
public class FromJsonTry{
    public static void main(String[] args) {
        FromJsonTry obj = new FromJsonTry();
        obj.run();
    }

    private void run() {
        ObjectMapper mapper = new ObjectMapper();

        try {

            // Convert JSON string from file to Object
            People people = mapper.readValue(new File("C:\\people.json"), People.class);
            System.out.println(people);

            // Convert JSON string to Object


            String jsonInString = null;
            People people1 = mapper.readValue(jsonInString, People.class);
            System.out.println(people1);

            //Pretty print
            String prettyPeople1 = mapper.defaultPrettyPrintingWriter().writeValueAsString(people1);
            System.out.println(prettyPeople1);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}