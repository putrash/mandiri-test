package co.saputra.mandiritest.di

import co.saputra.mandiritest.arch.vm.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel(get()) }
}