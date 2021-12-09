package com.example.topnews.testing

import androidx.lifecycle.SavedStateHandle
import com.example.topnews.domain.usecase.NewsUseCase
import com.example.topnews.ui.listfragment.ListViewModel
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import io.mockk.unmockkAll
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ListViewModelTest{
    private lateinit var testViewModel: ListViewModel

    @MockK
    private lateinit var newsUseCase: NewsUseCase
    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        newsUseCase = mockk()
        testViewModel = ListViewModel(newsUseCase, state = SavedStateHandle())
    }

    @After
    fun tearDown() {
        unmockkAll()
    }

    @Test
    fun choseSectionTest(){
        val currentSection = testViewModel.choseSection("business")
        Assert.assertEquals("business", currentSection)
    }
}