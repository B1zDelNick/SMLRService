package com.avp.smlr.controller

import org.junit.Before
import org.junit.runner.RunWith
import org.mockito.MockitoAnnotations
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@RunWith(SpringRunner::class)
@SpringBootTest
class RedirectControllerUnitTests
{
    @Autowired
    lateinit var wap: WebApplicationContext

    lateinit var mockMvc: MockMvc

    @Before
    fun setup()
    {
        MockitoAnnotations.initMocks(this)

        mockMvc = MockMvcBuilders.webAppContextSetup(wap).build()
    }
}