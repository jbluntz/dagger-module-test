package com.jbluntz.dagger.modulea

import com.jbluntz.dagger.moduleb.IB
import com.jbluntz.dagger.moduleb.ModuleB
import dagger.Binds
import dagger.Module
import javax.inject.Inject

@Module(includes = [ModuleB::class])
interface ModuleA {
    @Binds
    fun bindA(a: A): IA
}

interface IA

class A @Inject constructor(b: IB): IA
