
package net.perfsys.trainees.ascherbakov.task_0.fromJSON;


import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;


public class FromJson {
    public static void main(String[] args) {
        String inputJson="{\"Булыжник Виктор Сергеевич\":{\"id\":1, \"gender\": мужик, \"age\": 86, \"father\": Сергей, \"mother\": Доздроперма, \"brothers\": нет, \"sisters\": нет }}";

        ObjectMapper mapper = new ObjectMapper();
        try {
            MainParser mp = mapper.readValue(inputJson, MainParser.class);

            System.out.println(mp.getFirst());
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


