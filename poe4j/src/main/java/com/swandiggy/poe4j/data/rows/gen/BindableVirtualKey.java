
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BindableVirtualKeys")
public class BindableVirtualKey
    extends BaseRow
{

    @Order(0)
    private Integer keyCode;
    @Order(1)
    private String name;
    @Order(2)
    private String id;

}
