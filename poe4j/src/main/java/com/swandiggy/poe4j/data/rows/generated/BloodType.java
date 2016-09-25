
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BloodTypes")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class BloodType
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String petFile1;
    @Order(2)
    private String petFile2;
    @Order(3)
    private String petFile3;
    @Order(4)
    private Long key0;
    @Order(5)
    private String petFile4;
    @Order(6)
    private String petFile5;
    @Order(7)
    private String petFile6;
    @Order(8)
    private Long key1;
    @Order(9)
    private List<Long> keys0;
    @Order(10)
    private Long key2;
    @Order(11)
    private String petFile7;
    @Order(12)
    private String petFile8;
    @Order(13)
    private String petFile9;

}
