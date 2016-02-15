package com.swandiggy.poe4j.data.rows;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;

/**
 * Base class for rows.
 *
 * @author Jacob Swanson
 * @since 9/26/2015
 */
@Data
public abstract class BaseRow implements Serializable {
    @JsonIgnore
    private Integer index;
    @JsonIgnore
    private Long offset;
}
