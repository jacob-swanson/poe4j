
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("NPCTalk")
public class NPCTalk
    extends BaseRow
{

    @Order(0)
    private NPC nPC;
    @Order(1)
    private int unknown2;
    @Order(2)
    private String dialogueOption;
    @Order(3)
    private List<Integer> data0;
    @Order(4)
    private List<Integer> data1;
    @Order(5)
    private List<Integer> data2;
    @Order(6)
    private String unknown10;
    @Order(7)
    private int unknown11;
    @Order(8)
    private int unknown12;
    @Order(9)
    private Long key0;
    @Order(10)
    private int unknown15;
    @Order(11)
    private List<Long> data3;
    @Order(12)
    private List<NPCTextAudio> nPCTextAudio;
    @Order(13)
    private String unknown20;
    @Order(14)
    private Boolean flag0;
    @Order(15)
    private Boolean flag1;
    @Order(16)
    private List<Integer> data5;
    @Order(17)
    private List<Integer> data6;
    @Order(18)
    private Byte unknown25;
    @Order(19)
    private Boolean flag2;
    @Order(20)
    private int unknown25c;
    @Order(21)
    private int unknown26;
    @Order(22)
    private Short unknown27;
    @Order(23)
    private List<Integer> data7;
    @Order(24)
    private int unknown30;
    @Order(25)
    private Boolean flag3;

}
