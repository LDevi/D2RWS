package ldev.net.d2baserepository.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity()
public class RunewordRune {
    @PrimaryKey(autoGenerate = true)
    Long id;
    String runewordName;
    String runeCode;
    Integer runePosition;
}
