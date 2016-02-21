package com.swandiggy.poe4j.data.rows;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import java.io.Serializable;

/**
 * Base class for rows.
 *
 * @author Jacob Swanson
 * @since 9/26/2015
 */
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "index")
public abstract class BaseRow implements Serializable {
    private Integer index;
    @JsonIgnore
    private Long offset;
}
