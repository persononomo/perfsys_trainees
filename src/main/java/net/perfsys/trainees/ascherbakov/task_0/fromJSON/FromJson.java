
package net.perfsys.trainees.ascherbakov.task_0.fromJSON;

import org.codehaus.jackson.map.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.io.*;


public class FromJson {
    public static void main(String[] args) {
        FromJson obj = new FromJson();
        obj.run();

    }

    private void run() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File());
        }

    }
}

