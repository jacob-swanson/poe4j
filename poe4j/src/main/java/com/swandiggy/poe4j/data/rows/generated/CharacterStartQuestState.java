
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
@DatFile("CharacterStartQuestState")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CharacterStartQuestState
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<Quest> quest;
    @Order(2)
    private List<Integer> questState;
    @Order(3)
    private List<Long> keys1;
    @Order(4)
    private List<QuestVendorReward> questVendorRewards;
    @Order(5)
    private List<Integer> unknown9;

}
