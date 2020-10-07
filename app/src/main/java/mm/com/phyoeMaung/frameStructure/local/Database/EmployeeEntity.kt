package mm.com.phyoeMaung.frameStructure.local.Database


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Employee_table")
class EmployeeEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0L,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "salary")
    var salary: Int,

    @ColumnInfo(name = "offday")
    var offday: String

)
