
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class NPCTalk
    extends BaseRow
{

    @Order(0)
    private NPCs NPCKey;
    @Order(1)
    private int Unknown2;
    @Order(2)
    private String DialogueOption;
    @Order(3)
    private List<Integer> Data0;
    @Order(4)
    private List<Integer> Data1;
    @Order(5)
    private List<Integer> Data2;
    @Order(6)
    private String Unknown10;
    @Order(7)
    private int Unknown11;
    @Order(8)
    private int Unknown12;
    @Order(9)
    private Long Key0;
    @Order(10)
    private int Unknown15;
    @Order(11)
    private List<Long> Data3;
    @Order(12)
    private List<NPCTextAudio> NPCTextAudioKeys;
    @Order(13)
    private String Unknown20;
    @Order(14)
    private Boolean Flag0;
    @Order(15)
    private Boolean Flag1;
    @Order(16)
    private List<Integer> Data5;
    @Order(17)
    private List<Integer> Data6;
    @Order(18)
    private Byte Unknown25;
    @Order(19)
    private Boolean Flag2;
    @Order(20)
    private int Unknown25c;
    @Order(21)
    private int Unknown26;
    @Order(22)
    private Short Unknown27;
    @Order(23)
    private List<Integer> Data7;
    @Order(24)
    private int Unknown30;
    @Order(25)
    private Boolean Flag3;

}
