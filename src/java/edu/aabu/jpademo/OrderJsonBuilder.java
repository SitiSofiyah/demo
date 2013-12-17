/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aabu.jpademo;

import java.math.BigDecimal;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

/**
 *
 * @author webdev
 */
public class OrderJsonBuilder {

    public JsonObject buildPurchaseOrder() {
//       JsonObjectBuilder jsonBuilder = Json.createObjectBuilder();
        //     jsonBuilder.add(null, BigDecimal.ONE);
        //   return jsonBuilder.build();
        return Json.createObjectBuilder().add("order", Json.createObjectBuilder()
                .add("id", "1234")
                .add("date", "05/06/2013")
                .add("customer", Json.createObjectBuilder()
                .add("first_name", "James")
                .add("last_name", "Rorrison")
                .add("email", "j.rorri@me.com")
                .add("phoneNumber", "+44 1234 1234"))
                .add("content", Json.createObjectBuilder()
                .add("order_line", Json.createArrayBuilder()
                .add(Json.createObjectBuilder()
                .add("item", "H2G2")
                .add("quantity", "1")
                .add("unit_price", "23.5"))
                .add(Json.createObjectBuilder()
                .add("item", "Harry Potter")
                .add("quantity", "2")
                .add("unit_price", "34.99"))))
                .add("credit_card", Json.createObjectBuilder()
                .add("number", "1357")
                .add("expiry_date", "10/13")
                .add("control_number", "234")
                .add("type", "Visa"))).build();
    }
}
