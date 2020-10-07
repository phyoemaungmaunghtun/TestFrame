package mm.com.phyoeMaung.frameStructure.local.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface EmployeeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(EmployeeEntity: EmployeeEntity) : Long

    @Query("SELECT * FROM Employee_table")
    fun get(): LiveData<MutableList<EmployeeEntity>>

    @Query ("SELECT * FROM Employee_table WHERE id = :id LIMIT 1")
    fun getItemById (id: Long) : EmployeeEntity

    @Query("DELETE FROM Employee_table")
    fun deleteAll()

    @Query("SELECT * from Employee_table ORDER BY name ASC")
    fun getAlphabetizedWords(): LiveData<MutableList<EmployeeEntity>>


}