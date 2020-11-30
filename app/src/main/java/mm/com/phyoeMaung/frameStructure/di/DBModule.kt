package mm.com.phyoeMaung.frameStructure.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import mm.com.phyoeMaung.frameStructure.local.Database.AttendanceDatabase
import mm.com.phyoeMaung.frameStructure.local.Database.EmployeeDao
import mm.com.phyoeMaung.frameStructure.local.LocalData

@Module
@InstallIn(ApplicationComponent::class)
object DBModule {
    @Provides
    fun provideEmployeeDao(@ApplicationContext appContext: Context) : EmployeeDao {
        return AttendanceDatabase.getDatabase(appContext).EmployeeDao()
    }
    @Provides
    fun provideLocalRepository(EmployeeDao: EmployeeDao) = LocalData(EmployeeDao)
}