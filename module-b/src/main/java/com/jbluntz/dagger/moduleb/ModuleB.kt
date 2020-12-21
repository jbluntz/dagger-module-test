package com.jbluntz.dagger.moduleb

import dagger.Binds
import dagger.Module
import javax.inject.Inject

@Module
interface ModuleB {

    @Binds
    fun bindB(b: B): IB
}

interface IB

class B @Inject constructor(): IB
