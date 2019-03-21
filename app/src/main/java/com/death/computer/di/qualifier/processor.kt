package com.death.computer.di.qualifier

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ProcessorName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ProcessorGeneration