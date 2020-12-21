package com.jbluntz.dagger.component

import com.jbluntz.dagger.modulea.ModuleA
import dagger.Component

@Component(modules = [ModuleA::class])
interface Component
