package com.utility.parser.parser.avro;

import org.kitesdk.data.spi.JsonUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/converter")
public class Json2AvroSchemaService {

    @RequestMapping(
            value = "/json2avsc",
            method = RequestMethod.POST,
            consumes = "text/plain"
    )
    public String convertJsn2AvroSchema(@RequestBody String payload)throws Exception {

        System.out.println("Json in request is :::" + payload);
        String avroSchema = null;
        if(payload != null)
        avroSchema = JsonUtil.inferSchema(JsonUtil.parse(payload), "myTestschema").toString();

        return avroSchema;
    }


}
