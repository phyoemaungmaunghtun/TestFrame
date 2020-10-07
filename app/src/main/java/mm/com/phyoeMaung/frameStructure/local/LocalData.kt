package mm.com.phyoeMaung.frameStructure.local

import androidx.lifecycle.LiveData
import mm.com.phyoeMaung.frameStructure.local.Database.EmployeeDao
import mm.com.phyoeMaung.frameStructure.local.Database.EmployeeEntity
import javax.inject.Inject

class LocalData @Inject constructor(private val employeeDao: EmployeeDao) {

    fun getAttendanceList(): LiveData<MutableList<EmployeeEntity>> = employeeDao.getAlphabetizedWords()

    suspend fun  insertAttendList(employeeEntity: EmployeeEntity) = employeeDao.insert(employeeEntity)

}