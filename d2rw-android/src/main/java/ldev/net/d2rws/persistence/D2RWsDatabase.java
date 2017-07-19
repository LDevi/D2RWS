package ldev.net.d2rws.persistence;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by ldevineau on 28/05/2017.
 */
@Database(entities = {Runeword.class}, version=1)
public abstract class D2RWsDatabase extends RoomDatabase {
}
