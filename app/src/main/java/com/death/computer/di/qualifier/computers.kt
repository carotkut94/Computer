package com.death.computer.di.qualifier

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class GeneralCompter


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SpecializedComputer

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ComputerName