package mm.com.phyoeMaung.frameStructure.local

import androidx.lifecycle.LiveData
import mm.com.phyoeMaung.frameStructure.local.Database.EmployeeEntity

interface LocalDataSource {
    suspend fun insertAttendList(EmployeeEntity: EmployeeEntity) : Long
    fun getAttendanceList(): LiveData<MutableList<EmployeeEntity>>
}